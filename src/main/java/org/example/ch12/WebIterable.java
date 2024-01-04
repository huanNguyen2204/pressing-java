package org.example.ch12;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class WebIterable implements CharIterable<IOException> {
    private final Reader reader;

    public WebIterable(String url) throws IOException {
        reader = new InputStreamReader(new URL(url).openStream());
    }

    @Override
    public boolean hasNext() throws IOException {
        return reader.ready();
    }

    @Override
    public char next() throws IOException {
        return (char) reader.read();
    }

    public static void main(String[] args) {
        StringIterable iter1 = new StringIterable("Shasha");

        while (iter1.hasNext())
            System.out.println(iter1.next());

        System.out.println();

        try {
            WebIterable iter2 = new WebIterable( "http://tutego.de/javabuch/aufgaben/bond.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
