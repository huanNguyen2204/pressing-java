package org.example.ch12;

public record Rocket<T>(T value) {
    public boolean isEmpty() { return value == null; }
}

//public record Rocket<Elf> {
//
////    private Elf value;
////
////    public void set(Elf value) {
////        this.value = value;
////    }
////
////    public Elf get() {
////        return value;
////    }
//
////    private T value;
////
////    public Rocket() {}
////
////    public Rocket(T value) { this.value = value; }
////
////    public void set(T value) { this.value = value; }
////
////    public T get() { return value; }
////
////    public boolean isEmpty() {
////        return value == null;
////    }
////
////    public void empty() {
////        value = null;
////    }
//
////    private Object value;
////
////    public Rocket() {}
////
////    public Rocket(Object value) { this.value = value; }
////
////    public void set(Object value) {
////        this.value = value;
////    }
////
////    public Object get() {
////        return value;
////    }
////
////    public boolean isEmpty() {
////        return value == null;
////    }
////
////    public void empty() {
////        value = null;
////    }
//}
