package com.github.romankh3.logginglecture.error;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

/**
 * Demo class for demonstration {@link Level#ERROR}
 */
public class ErrorDemo {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public ErrorDemo() {
        log.error("Something went wrong... {}", "That's life =\\");
    }

}
