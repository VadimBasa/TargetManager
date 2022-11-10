package ru.netology.javacore;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TodosTests {

    Todos todos = new Todos();
    Task task = new Task();

    @BeforeEach
    void setUp() {
        String jsonText = "{ \"type\": \"ADD\", \"task\": \"смотреть ТВ\" }";
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        task = gson.fromJson(jsonText, Task.class);
    }

    @Test
    public void testAddTask() {
        todos.addTask(task.task);
        Assertions.assertEquals("смотреть ТВ ", todos.getAllTasks());
    }

    @Test
    public void testRemoveTask() {
        todos.addTask("footboll");
        todos.addTask("watch TV");
        todos.addTask("sleep");
        todos.removeTask("watch TV");
        Assertions.assertEquals("footboll sleep ", todos.getAllTasks());
    }

    @Test
    public void testGetAllTasks() {
        todos.addTask("footboll");
        todos.addTask("watch TV");
        todos.addTask("sleep");
        Assertions.assertEquals("footboll sleep watch TV ", todos.getAllTasks());
    }
}
