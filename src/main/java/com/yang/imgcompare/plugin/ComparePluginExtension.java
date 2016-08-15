package com.yang.imgcompare.plugin;

public class ComparePluginExtension {
    private String firstCompareCandidateDir = "hello";
    private String secondCompareCandidateDir = "hello";
    private String outputDir = "hello";
    private String greeting = "hello";

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
