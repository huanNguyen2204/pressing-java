package org.example.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadGifSizeCatchingExceptions {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile( "duke.gif", "r" );
            raf.seek( 6 );
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist!");
        } catch (IOException e) {
            System.err.println("General input / output error");
        }
    }
}
