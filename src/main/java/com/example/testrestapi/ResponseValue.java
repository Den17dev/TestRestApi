package com.example.testrestapi.inResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseValue {

    private String disclaimer;
    private String license;
    private String timestamp;
    private String base;
    private Map<String, String> rates;

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, String> getRates() {
        return rates;
    }

    public void setRates(Map<String, String> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Response{" +
                "disclaimer= " + disclaimer + "\n" +
                "license= " + license + "\n" +
                "timestamp= " + timestamp + "\n" +
                "base= " + base + "\n" +
                "rates= " + rates + "\n" + "}";
    }
}
