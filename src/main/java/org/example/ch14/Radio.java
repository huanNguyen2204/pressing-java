package org.example.ch14;

import javax.swing.event.EventListenerList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.*;

public class Radio {
    private final EventListenerList listeners = new EventListenerList();
    private final List<String> ads = List.of(
      "A Bite of Heaven",
      "Bag the sweets and run",
      "Chew on this, for a while.",
      "Taste the explosion."
    );

    public Radio() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Collections.shuffle(ads);
                notifyAdvertisement(new AdEvent(this, ads.get(0)));
            }
        }, 0, 500);
    }

    public void addAdListener(AdListener listener) {
        listeners.add(AdListener.class, listener);
    }

    public void removeAdListener(AdListener listener) {
        listeners.remove(AdListener.class, listener);
    }

    protected synchronized void notifyAdvertisement(AdEvent event) {
        for (AdListener l : listeners.getListeners(AdListener.class))
            l.advertisement(event);
    }
}
