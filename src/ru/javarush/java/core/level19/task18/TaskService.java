package ru.javarush.java.core.level19.task18;

public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(Task task) {
        repository.save(task);
    }

    void completedTask(String title) {
        Task task = repository.findByTitle(title);
        if (task != null) {
            task.complete();
        }
    }
}
