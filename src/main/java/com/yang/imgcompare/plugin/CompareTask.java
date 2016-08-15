package com.yang.imgcompare.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class CompareTask extends DefaultTask {
    private String greeting = "hello from GreetingTask";

    public String getGreeting() {
        return greeting;
    }

    public String setGreeting(String greeting) {
        return this.greeting = greeting;
    }

    @TaskAction
    public void compareTask() {
        System.out.println( "greeting in CompareTask : " + this.greeting);
    }
}
