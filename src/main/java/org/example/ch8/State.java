package org.example.ch8;

public sealed class State { }

final class Open extends State {}
final class Closed extends State {}