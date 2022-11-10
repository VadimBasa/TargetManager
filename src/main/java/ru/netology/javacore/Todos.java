package ru.netology.javacore;

import java.util.*;


public class Todos {
    protected final int targetLenght = 7;

    List<String> targetList = new ArrayList<>();

    public void addTask(String task) {
        if (targetList.size() < targetLenght) {
            targetList.add(task);
        }
    }

    public void removeTask(String task) {
        targetList.remove(task);
    }

    public String getAllTasks() {
        if (targetList.size() > 0) {
            String sortList = "";
            Collections.sort(targetList);
            for (String item : targetList) {
                sortList += item + " ";
            }
            return sortList;
        }
        return "Список задач пустой, добавьте задачу!";
    }

}
