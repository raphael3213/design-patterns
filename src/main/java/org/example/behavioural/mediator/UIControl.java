package org.example.behavioural.mediator;

abstract public class UIControl {

    private final UIMediator uiMediator;
    protected String value;
    protected String name;

    protected UIControl(UIMediator uiMediator) {
        this.uiMediator = uiMediator;
        uiMediator.register(this);
    }

    abstract protected void controlChanged(UIControl control);

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        uiMediator.valueChanged(this);
    }

    public String getName() {
        return name;
    }


}
