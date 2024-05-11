package org.example.behavioural.command;

public class AddMemberCommand implements Command{

    public AddMemberCommand(String email, String listName, Service service) {
        this.email = email;
        this.listName = listName;
        this.service = service;
    }

    private final String listName;
    private final String email;
    private final Service service;

    @Override
    public void execute() {
        service.addMember(email, listName);
    }
}
