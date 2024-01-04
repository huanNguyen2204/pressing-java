package org.example.ch16;

import org.example.ch15.Chapter15;

import static java.time.temporal.ChronoUnit.MILLIS;
import static java.time.Instant.now;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Chapter16 {

    private static final Logger log = Logger.getLogger(Chapter15.class.getName());

    public static void main(String[] args) {
        Instant start = Instant.now();
        log.info("About to start");

        try {
            log.log( Level.INFO, "Lets try to throw {0}", "null" );
            throw null;
        } catch (Exception e) {
            log.log(Level.SEVERE, "Oh oh", e);
        }

        log.info(() -> String.format("Runtime: %s ms", start.until(now(), MILLIS)));
    }
}
