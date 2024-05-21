package org.example.behavioural.memento.withCommands;

public interface WorkflowCommand {
    void execute();

    void undo();
}
