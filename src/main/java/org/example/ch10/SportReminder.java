package org.example.ch10;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class SportReminder {
    public static void main(String[] args) {
        class SportReminderTask extends TimerTask {
            @Override
            public void run() {
                System.out.println("Come on, you candy-ass");
            }
        }

        new Timer().scheduleAtFixedRate(
          new SportReminderTask(),
          0,
          1000
        );

        Point p = new Point(10, 12) {
            @Override
            public String toString() {
                return "(" + x + "," + y +")";
            }
        };

        System.out.println(p);

        final int[] result1 = { 0 };
        final String[] result2 = { null };
        final AtomicInteger result3 = new AtomicInteger();
        final AtomicReference<String> result4 = new AtomicReference<String>();

        System.out.println(result1[0]);
        System.out.println(result2[0]);
        System.out.println(result3.get());
        System.out.println(result4.get());

        new Object() {{
            result1[0] = 1;
            result2[0] = "snort wasabi hot sauce";
            result3.set(1);
            result4.set("skateboard in bowling lanes");
        }};

        System.out.println(result1[0]);
        System.out.println(result2[0]);
        System.out.println(result3.get());
        System.out.println(result4.get());
    }
}
