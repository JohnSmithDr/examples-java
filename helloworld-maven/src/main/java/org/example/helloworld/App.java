package org.example.helloworld;

public class App 
{
    public static void main( String[] args )
    {
        String name = (args.length > 0) ? args[0] : "World";
        IGreetings greetings = new SimpleGreetings();
        System.out.println( greetings.sayHelloTo(name) );
    }
}
