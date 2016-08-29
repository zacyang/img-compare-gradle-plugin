package com.yang.icompare.plugin;

public class ComparePluginExtension {
    private String firstCompareCandidateDir = "hello";
    private String secondCompareCandidateDir = "hello";
    private String outputDir = "hello";

    private String pathOfDataJs = "hello";

    public String getFirstCompareCandidateDir() {
        return firstCompareCandidateDir;
    }

    public void setFirstCompareCandidateDir(String firstCompareCandidateDir) {
        this.firstCompareCandidateDir = firstCompareCandidateDir;
    }

    public String getSecondCompareCandidateDir() {
        return secondCompareCandidateDir;
    }

    public void setSecondCompareCandidateDir(String secondCompareCandidateDir) {
        this.secondCompareCandidateDir = secondCompareCandidateDir;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public String getPathOfDataJs() {
        return pathOfDataJs;
    }

    public void setPathOfDataJs(String pathOfDataJs) {
        this.pathOfDataJs = pathOfDataJs;
    }

}
