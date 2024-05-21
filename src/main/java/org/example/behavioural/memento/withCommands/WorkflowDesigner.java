package org.example.behavioural.memento.withCommands;

public class WorkflowDesigner {
    public Workflow workflow;


    public Workflow createWorkflow(String name){
        this.workflow = new Workflow(name);
        return this.workflow;
    }

    public void addStep(String step){
        this.workflow.addStep(step);
    }

    public void removeStep(String step){
        this.workflow.removeStep(step);
    }

    public Memento getMemento(){
        if(workflow == null) return new Memento();
        return new Memento(workflow.getSteps(), workflow.getName());
    }

    public void setMemento(Memento memento){
        if(memento.isEmpty()){
            this.workflow = null;
        }
        else{
            this.workflow = new Workflow(memento.getName(), memento.getSteps());
        }
    }

    // Memento
    public class Memento {
        private String[] steps;
        private String name;

        private Memento(){}

        private Memento(String[] steps, String name) {
            this.steps = steps;
            this.name = name;
        }

        private String[] getSteps() {
            return steps;
        }

        private String getName() {
            return name;
        }

        private boolean isEmpty(){
            return this.getSteps() == null && this.getName() == null;
        }
    }
}
