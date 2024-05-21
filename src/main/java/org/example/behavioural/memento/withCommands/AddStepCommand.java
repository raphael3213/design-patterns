package org.example.behavioural.memento.withCommands;

public class AddStepCommand extends  AbstractWorkflowCommand{

    private final String step;
    public AddStepCommand(WorkflowDesigner receiver, String step) {
        super(receiver);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.addStep(step);
    }
}
