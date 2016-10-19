package org.example.multiproject.services;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooServiceTest {

    @Test 
    public void testFoo() {
        FooService service = new FooService();
        assertEquals("Foo", service.foo());
    }
}
