package org.example.behavioural.memento.withCommands;

public class CreateCommand extends  AbstractWorkflowCommand{

    private final String name;
    public CreateCommand(WorkflowDesigner receiver, String name) {
        super(receiver);
        this.name = name;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.createWorkflow(name);
    }
}
