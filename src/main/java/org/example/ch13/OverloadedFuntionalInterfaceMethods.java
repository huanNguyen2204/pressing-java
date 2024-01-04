package org.example.ch13;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

class OverloadedFuntionalInterfaceMethods {
    static <V> void run(Callable<V> callable) { }

    static <V> void run(Supplier<V> callable) { }
}
