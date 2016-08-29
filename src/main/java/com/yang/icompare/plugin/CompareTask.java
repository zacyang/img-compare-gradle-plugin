package com.yang.icompare.plugin;

import com.yang.icompare.Application;
import com.yang.icompare.core.config.Config;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class CompareTask extends DefaultTask {

    private Config config = null;

    @TaskAction
    public void compareTask() throws Exception {
        Application application = initICompare();
        Class.forName("com.fasterxml.jackson.dataformat.yaml.YAMLFactory");
        application.compare(config);
    }

    private Application initICompare() {
        return new Application();
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}
