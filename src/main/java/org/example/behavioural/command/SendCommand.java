package org.example.behavioural.command;

import java.util.List;

public class SendCommand implements Command{

    private List<String> mailingList;
    private String content;
    private Service service;

    @Override
    public void execute() {
    }
}
