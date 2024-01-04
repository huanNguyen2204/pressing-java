package org.example.ch9;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class ReadGifSizeIgnoringExceptions {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("duke.gif", "r");
        raf.seek(6);
        System.out.printf("%s x %s Pixel %n", raf.read() + raf.read() * 256, raf.read() + raf.read() * 256);
    }
}
