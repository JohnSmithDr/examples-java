package org.example.multiproject.app;

import org.example.multiproject.services.*;
import org.example.multiproject.shared.*;

public class App {

    public static void main(String[] args) {
        
        FooService service = new FooService();
        Logger.debug(service.foo());
    }
}
