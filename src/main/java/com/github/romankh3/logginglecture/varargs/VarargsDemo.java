package com.github.romankh3.logginglecture.varargs;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demo for varargs.
 */
public class VarargsDemo {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public VarargsDemo() {
        log.info(VarargsDemo.class.getSimpleName() + " has been created " + this);

        if (log.isInfoEnabled()) {
            log.info(VarargsDemo.class.getSimpleName() + " has been created " + this);
        }

        log.info("{} has been created {}", VarargsDemo.class.getSimpleName(), this);
    }

}
