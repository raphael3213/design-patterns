package org.example.behavioural.memento.simple;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.write("Joel is a dev");

        editor.write("Joel is not a dev");

        System.out.println(editor.getText());

        editor.undo();
        editor.undo();
        System.out.println(editor.getText());

    }

}
