package io.github.lacti;

import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App implements Function<String, String> {
    private final String prefix;

    public App(final String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String apply(final String input) {
        return this.prefix + " " + input;
    }

    public static void main(String[] args) {
        System.out.println(new App("Hello").apply("World!"));
    }
}
