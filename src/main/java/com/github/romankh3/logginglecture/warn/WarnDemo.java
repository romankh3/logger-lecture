package com.github.romankh3.logginglecture.warn;

import com.github.romankh3.logginglecture.debug.DebugDemo;
import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

/**
 * Class for demonstration {@link Level#WARN}
 */
@Deprecated
public class WarnDemo {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public WarnDemo() {
        log.info("{} object has been created", this.getClass().getSimpleName());
        log.warn("this class is deprecated, don't use it!");
        log.warn("please, use {} class instead of it", DebugDemo.class.getSimpleName());
    }

}
