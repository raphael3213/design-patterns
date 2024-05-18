package org.example.behavioural.mediator;

public class Slider extends UIControl{


    public Slider(UIMediator uiMediator, String name) {
        super(uiMediator);
        this.name = name;

    }

    @Override
    protected void controlChanged(UIControl control) {
        System.out.printf("The UI Control : %s has changed and the UI Control " +
                ": %s has received it \n", control.getName() ,this.getName());
    }


}
