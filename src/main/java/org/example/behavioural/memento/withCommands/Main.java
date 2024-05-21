package org.example.behavioural.memento.withCommands;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        WorkflowDesigner designer = new WorkflowDesigner();

        LinkedList<WorkflowCommand> commands = new LinkedList<>();
        WorkflowCommand command = new CreateCommand(designer, "Leave Workflow");
        commands.addLast(command);
        command.execute();

        command = new AddStepCommand(designer, "Create Leave Application");
        commands.addLast(command);
        command.execute();

        command = new AddStepCommand(designer, "Submit Application");
        commands.addLast(command);
        command.execute();

        command = new AddStepCommand(designer, "Application approved");
        commands.addLast(command);
        command.execute();

//        command = new AddStepCommand(designer, "Create Leave Application");
//        commands.addLast(command);
//        command.execute();

//        command.undo();
//        commands.removeLast().undo();

        System.out.println(designer.workflow.toString());


    }


    private static void undoLastCommand(LinkedList<WorkflowCommand> commands){
        if(!commands.isEmpty()){
            commands.removeLast().undo();
        }
    }
}
