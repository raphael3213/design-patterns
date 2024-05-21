package org.example.behavioural.memento.simple;

import java.util.Stack;

public class Editor {

    private Stack<TextArea.Memento> editStack;
    private TextArea textArea;

    public Editor(){
        editStack = new Stack<>();
        textArea = new TextArea();
    }

    public void write(String text){
        textArea.setText(text);
        editStack.push(textArea.getSnapshot());
    }

    public void undo(){
        if(editStack.empty()) throw new IndexOutOfBoundsException("Nothing to undo");
        textArea.restore(editStack.pop());
    }

    public String getText(){
        return textArea.getText();
    }
}
