package org.example.behavioural.mediator;

public class Main {
    public static void main(String[] args) {

        UIMediator mediator = new UIMediator();

        Slider slider = new Slider(mediator, "MySlider");
        TextBox textBox = new TextBox(mediator, "MyTextBox");

        slider.setValue("0");
        textBox.setValue("Joel");
    }
}
