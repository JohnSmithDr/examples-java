package org.example.multiproject.shared;

public class Logger {

    public static void debug(String content) {
        System.out.println(content);
    }

    public static void debug(String format, Object... args) {
        Logger.debug(String.format(format, args));
    }
}
