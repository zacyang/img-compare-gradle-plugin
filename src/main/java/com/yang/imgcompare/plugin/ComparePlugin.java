package com.yang.imgcompare.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class ComparePlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        ComparePluginExtension imgComparePluginExtention = target.getExtensions().create("ImgComparePluginExtention", ComparePluginExtension.class);
        CompareTask compareTask = target.getTasks().create("CompareTask", CompareTask.class);
        compareTask.setGreeting(imgComparePluginExtention.getGreeting());
    }
}
