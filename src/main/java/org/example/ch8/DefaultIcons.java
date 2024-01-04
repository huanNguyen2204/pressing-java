package org.example.ch8;

import javax.swing.*;
import java.awt.*;

public enum DefaultIcons implements Icon {
    WARNING {
        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {}
    },
    ERROR {
        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {}
    };

    @Override
    public int getIconWidth() { return 16; }

    @Override
    public int getIconHeight() { return 16; }
}
