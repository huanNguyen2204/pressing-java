package org.example.ch14;

import java.util.EventListener;

interface AdListener extends EventListener {
    void advertisement(AdEvent e);
}
