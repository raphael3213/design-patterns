package org.example.behavioural.iterator;

public enum ThemeColor {
    RED,
    ORANGE,
    BLACK,
    WHITE;


    public static class ThemeIterator implements Iterator<ThemeColor> {

        private final Integer length = ThemeColor.values().length;
        private Integer index = 0;

        ThemeIterator(){

        };

        @Override
        public Boolean hasNext() {
            return index < length;
        }

        @Override
        public ThemeColor getNext() {
            return ThemeColor.values()[this.index++];

        }
    }

    public static ThemeIterator getIterator() {
        return new ThemeIterator();
    }
}
