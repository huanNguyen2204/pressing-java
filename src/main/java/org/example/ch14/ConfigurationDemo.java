package org.example.ch14;

class ConfigurationDemo {
    public static void main(String[] args) {
        System.out.println(Configuration.INSTANCE.getVersion());
        System.out.println(Configuration.INSTANCE.getUserDir());
    }
}