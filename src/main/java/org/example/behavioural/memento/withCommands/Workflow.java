package org.example.behavioural.memento.withCommands;

import java.util.Arrays;
import java.util.LinkedList;

public class Workflow {
    private LinkedList<String> steps = new LinkedList<>();;
    private String name;

    public Workflow(String name){
        this.name = name;
    }

    public Workflow(String name, String... steps){
        this.name = name;
        this.steps.addAll(Arrays.asList(steps));

    }

    public String toString(){
        String name = String.format("Workflow name : %s -> BEGIN -> " , this.name);
        StringBuilder builder = new StringBuilder(name);
        for(String step : this.steps){
            builder.append(step).append(" -> ");
        }
        return builder.toString();
    }


    public void addStep(String step){
        this.steps.add(step);
    }

    public void removeStep(String step){
        this.steps.remove(step);
    }

    public String[] getSteps() {
        if(steps ==null || steps.isEmpty()){
            return new String[0];
        }
        return steps.toArray(new String[0]);
    }

    public String getName() {
        return name;
    }
}
