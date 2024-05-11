package org.example.behavioural.command;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AddMemberCommand command1 = new AddMemberCommand("joel.dsouza@gmail.com" , "SpikeBoysz" , EwsService.getInstance());
        AddMemberCommand command2 = new AddMemberCommand("hansel.dsouza@gmail.com" , "SpikeBoysz" , EwsService.getInstance());
        System.out.println("Going to add commands");
        MailTaskRunner.getInstance().addCommand(command1);
        MailTaskRunner.getInstance().addCommand(command2);
        System.out.println("Going to sleep commands");

        Thread.sleep(3000);

        MailTaskRunner.getInstance().addCommand(command1);
        MailTaskRunner.getInstance().addCommand(command2);
        MailTaskRunner.getInstance().shutdown();
    }
}
