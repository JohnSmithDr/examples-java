package org.example.helloworld;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleGreetingsTest 
{
    @Test 
    public void testSayHelloTo() 
    {
        IGreetings greetings = new SimpleGreetings();
        assertEquals( "Hello, world !!!", greetings.sayHelloTo("world") );
    }
}