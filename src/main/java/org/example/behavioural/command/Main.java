package org.example.behavioural.command;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AddMemberCommand command1 = new AddMemberCommand("joel.dsouza@gmail.com" , "SpikeBoysz" , EwsService.getInstance());
        AddMemberCommand command2 = new AddMemberCommand("hansel.dsouza@gmail.com" , "SpikeBoysz" , EwsService.getInstance());

        MailTaskReceiver.getInstance().addCommand(command1);
        MailTaskReceiver.getInstance().addCommand(command2);


        Thread.sleep(3000);

        MailTaskReceiver.getInstance().addCommand(command1);
        MailTaskReceiver.getInstance().addCommand(command2);
        MailTaskReceiver.getInstance().shutdown();
    }
}
