package com.github.romankh3.logginglecture;

import com.github.romankh3.logginglecture.debug.DebugDemo;
import com.github.romankh3.logginglecture.error.ErrorDemo;
import com.github.romankh3.logginglecture.varargs.VarargsDemo;
import com.github.romankh3.logginglecture.warn.WarnDemo;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demo class for Logging Lecture.
 */
public class MainDemo {

    private static final Logger log = LoggerFactory.getLogger(MainDemo.class.getName());

    public static void main(String[] args) {
        log.info("Application has started, time= {}", LocalDateTime.now());
        DebugDemo debugDemo = new DebugDemo(11, 123);
        WarnDemo warnDemo = new WarnDemo();
        ErrorDemo errorDemo = new ErrorDemo();
        VarargsDemo varargsDemo = new VarargsDemo();
    }
}
