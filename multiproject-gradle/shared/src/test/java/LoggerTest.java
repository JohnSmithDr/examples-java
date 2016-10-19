package org.example.multiproject.shared;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoggerTest {

    @Test 
    public void testDebug() {

        Logger.debug("Hello World");
        Logger.debug("%s", "Hello World");
        assertTrue(true);
    }
}
