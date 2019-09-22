package com.github.romankh3.logginglecture.debug;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

/**
 * Demo class for demonstration {@link Level#INFO}
 */
public class DebugDemo {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public DebugDemo(int var1, int var2) {
        log.debug("Object has been created with var1={}, var2={}", var1, var2);
    }

}
