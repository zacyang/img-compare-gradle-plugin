package com.yang.icompare.plugin;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.Before;
import org.junit.Test;

public class CompareTaskTest {

    private Project project;
    private Task compareTask;

    @Before
    public void setUp() throws Exception {
        project = ProjectBuilder.builder().build();
        project.getPluginManager().apply("com.yang.icompare");
        compareTask = project.getTasks().getByName("CompareTask");
    }

    @Test
    public void shouldAddTaskToProject() throws Exception {
        assertThat(compareTask instanceof  CompareTask, is(true));
    }

    @Test
    public void shouldGetConfigurationFromExtension() throws Exception {
        ComparePluginExtension extension = project.getExtensions().findByType(ComparePluginExtension.class);
        assertNotNull(extension);
    }
}