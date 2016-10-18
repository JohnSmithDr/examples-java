package org.example.helloworld;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SimpleGreetingsTest extends TestCase
{
    public void testSayHelloTo() 
    {
        IGreetings greetings = new SimpleGreetings();
        assertEquals( "Hello, world !!!", greetings.sayHelloTo("world") );
    }
}
