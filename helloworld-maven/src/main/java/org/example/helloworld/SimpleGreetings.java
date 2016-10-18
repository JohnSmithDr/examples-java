package org.example.helloworld;

public class SimpleGreetings implements IGreetings
{
    public String sayHelloTo( String name ) {
        return String.format( "Hello, %s !!!", name );
    }
}