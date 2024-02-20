package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I love Jenkins 123";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Tried to push to GitHub, it works!");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
