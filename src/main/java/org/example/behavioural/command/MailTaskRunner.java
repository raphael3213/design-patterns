package org.example.behavioural.command;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MailTaskRunner implements Runnable{

    public Thread getRunner() {
        return runner;
    }

    private Thread runner;
    private final List<Command> pendingCommands;
    private static final MailTaskRunner INSTANCE = new MailTaskRunner();
    private volatile boolean stop;

    public static MailTaskRunner getInstance() {
        return INSTANCE;
    }


    private MailTaskRunner(){
        pendingCommands = new LinkedList<>();
        runner = new Thread(this);
        runner.start();
    }
    @Override
    public void run() {
        Command cmd = null;
        while(true){
//            System.out.println("Runner running");
            synchronized (pendingCommands) {
                if(pendingCommands.isEmpty()){
                    try{
                        System.out.println("Runner Waiting");
                        pendingCommands.wait();
                    }
                    catch (Exception e){
                        System.out.println("Runner Interrupted");
                        if(stop){
                            System.out.println("Runner Stopped");
                            return;
                        }

                    }
                }
                else{
                    cmd = pendingCommands.remove(0);
                }
            }
            if(cmd == null) return;
            cmd.execute();
        }
    }

    public void addCommand(Command cmd){
        synchronized (pendingCommands){
            pendingCommands.add(cmd);
            pendingCommands.notifyAll();
        }
    }

    public void shutdown(){
        this.stop = true;
        this.runner.interrupt();
    }
}
