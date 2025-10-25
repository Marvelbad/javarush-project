package ru.javarush.java.core.level19.task18;

import java.util.HashMap;
import java.util.Map;

public class InMemoryTaskRepository implements TaskRepository {
    private final Map<String, Task> storage = new HashMap<>();

    @Override
    public void save(Task task) {
        storage.put(task.getTitle(), task);
    }

    @Override
    public Task findByTitle(String title) {
        return storage.get(title);
    }
}
