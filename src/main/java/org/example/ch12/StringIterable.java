package org.example.ch12;

public class StringIterable implements CharIterable<RuntimeException> {
    private final String string;
    private int pos;

    public StringIterable(String string) {
        this.string = string;
    }

    @Override
    public boolean hasNext() {
        return pos < string.length();
    }

    @Override
    public char next() {
        return string.charAt(pos++);
    }
}
