package org.example.behavioural.memento.simple;

public class TextArea {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento getSnapshot(){
        return new Memento(text);
    }

    public void restore(Memento memento){
        setText(memento.getSavedText());
    }

    public static class Memento {
        private final String text ;


        public Memento(String text) {
            this.text = text;
        }

        public String getSavedText(){
            return this.text;
        }


    }
}
