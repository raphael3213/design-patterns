package org.example.behavioural.memento.withCommands;

public class RemoveStepCommand extends  AbstractWorkflowCommand{

    private final String step;
    public RemoveStepCommand(WorkflowDesigner receiver, String step) {
        super(receiver);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.removeStep(step);
    }
}
