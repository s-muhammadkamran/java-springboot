package com.in28minutes.learn_spring_framework.game;

public class SuperContraGame implements IGamingConsole {
    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Sit");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Shoot an arrow");
    }
}
