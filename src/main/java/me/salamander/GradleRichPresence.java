package me.salamander;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;

import java.util.Set;

public class GradleRichPresence implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        var tasks = project.getAllTasks(true);
        for(Set<Task> tasksInProject : tasks.values()){
            for(Task task : tasksInProject){
                task.doFirst((t) -> System.out.println("Running " + t.getName()));
            }
        }
    }
}
