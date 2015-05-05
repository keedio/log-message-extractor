package com.keedio.utils;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class FlumePayload {

    private Map<String,String> extraData;
    private String message;

    @JsonCreator
    public FlumePayload(@JsonProperty("extraData") Map<String, String> extraData,
                             @JsonProperty("message") String message) {
        if (extraData == null) {
            this.extraData = new HashMap<String, String>();
        } else {
            this.extraData = extraData;
        }
        this.message = message;
    }

    public Map<String, String> getExtraData() {
        return extraData;
    }

    public void setExtraData(Map<String, String> extraData) {
        this.extraData = extraData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
