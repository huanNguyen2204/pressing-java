package org.example.ch11;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

class WordIterable implements Iterable<String>, Iterator<String> {
    private StringTokenizer tokenizer;

    public WordIterable(String s) {
        tokenizer = new StringTokenizer(s);
    }

    @Override
    public Iterator<String> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return tokenizer.hasMoreTokens();
    }

    @Override
    public String next() {
        if (hasNext())
            return tokenizer.nextToken();
        throw new NoSuchElementException();
    }

    public static void main(String[] args) {
        String s = "Even miracles take a little time.";

        for (String word: new WordIterable(s))
            System.out.println(word);

        String word;
        Iterator<String> iterator = new WordIterable(s).iterator();

        while (iterator.hasNext()) {
            word = iterator.next();
            System.out.println(word);
        }

        word = null;
        iterator = null;
    }
}
