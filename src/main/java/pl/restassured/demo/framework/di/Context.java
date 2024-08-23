package pl.restassured.demo.framework.di;

import java.util.HashMap;
import java.util.Map;

// This class is used to store data between steps
public class Context {

    Map<String, String> stepData;

    public Context() {
    stepData = new HashMap<>();
    }

    public void setContext(String key, String value) {
        stepData.put(key, value);
    }

    public String getContext(String key) {
        return stepData.get(key);
    }
}
