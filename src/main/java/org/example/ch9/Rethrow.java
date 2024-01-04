package org.example.ch9;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Rethrow {
    public static URI createUriFromHost(String host) throws URISyntaxException {
        try {
            return new URI("http://" + host);
        } catch (URISyntaxException e) {
            System.err.println("Wrong URI! " + e.getMessage());
            throw e;
        }
    }

    public static boolean isAvailable(String url) {
        try {
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection con = (HttpURLConnection) (new URL(url).openConnection());
            return con.getResponseCode() == HttpURLConnection.HTTP_OK;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println( isAvailable( "http://caliginous.junk/" ) ); // false
        System.out.println( isAvailable( "http://www.tutego.com/" ) ); // true
        System.out.println( isAvailable( "pigeon://germany/dortmund/huelshof/28/" ) ); //

//        try {
//            createUriFromHost("tutego.de");
//            createUriFromHost("%");
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
    }
}
