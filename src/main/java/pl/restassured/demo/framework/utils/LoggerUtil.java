package pl.restassured.demo.framework.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {
    public static Logger getLogger() {
        // This is to enforce the logger to print the name of the class that called it
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String className = stackTrace[3].getClassName(); // 3 is the index of the class that called this method
        return LogManager.getLogger(className);
    }
}