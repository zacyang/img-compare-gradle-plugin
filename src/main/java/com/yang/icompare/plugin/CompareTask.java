package com.yang.icompare.plugin;

import java.io.IOException;

import com.yang.icompare.Application;
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
    public void compareTask() throws ClassNotFoundException {
        Application application = new Application();
        try {
            Class.forName("com.fasterxml.jackson.dataformat.yaml.YAMLFactory");
            System.out.println("comparing.....");
            application.compare();
        } catch (IOException e) {
            System.out.println("exception" + e);
            e.printStackTrace();
        }
        System.out.println( "greeting in CompareTask : " + this.greeting);
    }
    public static void main(String[] args) throws IOException {
        new Application().compare();
    }
}
