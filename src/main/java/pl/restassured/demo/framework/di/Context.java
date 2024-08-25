package pl.restassured.demo.framework.di;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pl.restassured.demo.framework.pageObjects.CartPage;

import java.util.HashMap;
import java.util.Map;

// This class is used to store data between steps
public class Context {
    private Logger log = LogManager.getLogger(CartPage.class);

    Map<String, String> stepData;

    public Context() {
    stepData = new HashMap<>();
    }

    public void setContext(String key, String value) {
        stepData.put(key, value);
        log.info("Set context value: " + key + " = " + value);
    }

    public String getContext(String key) {
        log.info("Get context value: " + key + " = " + stepData.get(key));
        return stepData.get(key);
    }
}
