package com.yang.icompare.plugin;

import com.yang.icompare.core.config.Config;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class ComparePlugin implements Plugin<Project> {
    private static final String PLUGIN_EXTENTION = "ImgComparePluginExtention";
    private static final String TASK_NAME = "CompareTask";

    @Override
    public void apply(Project target) {
        ComparePluginExtension extention = target.getExtensions().create(PLUGIN_EXTENTION, ComparePluginExtension.class);
        CompareTask compareTask = target.getTasks().create(TASK_NAME, CompareTask.class);

        compareTask.setConfig(generateConfig(extention));
    }

    private Config generateConfig(ComparePluginExtension extention) {
        return new Config(extention.getFirstCompareCandidateDir(), extention.getSecondCompareCandidateDir(), extention.getOutputDir(), extention.getPathOfDataJs());
    }
}
