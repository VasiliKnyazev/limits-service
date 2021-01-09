package com.luxoft.education.microservices.limitsservice.config;

public class LimitConfiguration {
    private String profileName;
    private int minimum;
    private int maximum;

    protected LimitConfiguration() {}

    public LimitConfiguration(String profileName, int minimum, int maximum) {
        super();
        this.profileName = profileName;
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public String getProfileName() {
        return profileName;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }
}
