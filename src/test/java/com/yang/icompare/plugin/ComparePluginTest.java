package com.yang.icompare.plugin;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.Before;
import org.junit.Test;

public class ComparePluginTest {

    private Project project;

    @Before
    public void setUp() throws Exception {
        project = ProjectBuilder.builder().build();
        project.getPluginManager().apply("com.yang.icompare");
    }

    @Test
    public void shouldApplyTaskWhenLoaded() throws Exception {
        assertTrue(project.getTasks().getByName("CompareTask") instanceof CompareTask);
    }

    @Test
    public void shouldLoadExtensionWhenPluginLoaded() throws Exception {
        ComparePluginExtension comparePluginExtension = project.getExtensions().findByType(ComparePluginExtension.class);
        assertNotNull(comparePluginExtension);
    }
}