
/**
 * @author Sandeep Kolli
 */

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.*;

public class ToDoList {
    final long not = -100000000;
    public task[] tasks;
    public int size;

    ToDoList() {
        tasks = new task[20];
        size = 0;
    }

    public void addTask(String s1, String s2, String s3, String s4) {
        tasks[size] = new task(s1, s2, s3, s4);
        size++;
    }

    public void removeTask(String name) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getName() == name) {
                tasks[i] = tasks[size - 1];
                tasks[size - 1] = null;
                size = size - 1;
            }
        }
    }

    public void updateStatus(String name, String status) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getName() == name) {
                tasks[i].setStatus(status);
            }
        }
    }

    public void displayPendingIncompleteTasks() {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getStatus() != "complete") {
                System.out.println(tasks[i].getName());
                System.out.println(tasks[i].getDescription());
                System.out.println(tasks[i].getDate());
                System.out.println(tasks[i].getStatus());
                System.out.println();
            }
        }
    }

    public void displayBasedonDate(String s1) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getDate() == s1 && tasks[i].getStatus() != "complete") {
                System.out.println(tasks[i].getName());
                System.out.println(tasks[i].getDescription());
                System.out.println(tasks[i].getDate());
                System.out.println(tasks[i].getStatus());
                System.out.println();
            }
        }
    }

    public void displayBasedonTask(String s1) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getName() == s1) {
                System.out.println(tasks[i].getName());
                System.out.println(tasks[i].getDescription());
                System.out.println(tasks[i].getDate());
                System.out.println(tasks[i].getStatus());
                System.out.println();
            }
        }
    }

    public void displayTasks() {
        for (int i = 0; i < size; i++) {
            System.out.println(tasks[i].getName());
            System.out.println(tasks[i].getDescription());
            System.out.println(tasks[i].getDate());
            System.out.println(tasks[i].getStatus());
            System.out.println();
        }
    }

    public void pendingTasks() {
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        Date ConvertExpire;
        long days;
        for (int i = 0; i < size; i++) {
            try {
                ConvertExpire = ft.parse(tasks[i].getDate());
                Date date = new Date();
                days = -TimeUnit.DAYS.convert(ConvertExpire.getTime() - date.getTime(), TimeUnit.MILLISECONDS);
            } catch (ParseException e) {
                days = not;
            }
            if (days != not) {
                if (days > 0) {
                    System.out.println("The task is pending by " + days + " days");
                    System.out.println(tasks[i].getName());
                    System.out.println(tasks[i].getDescription());
                    System.out.println(tasks[i].getDate());
                    System.out.println(tasks[i].getStatus());
                    System.out.println();
                }
            } else
                System.out.println("Date Format is wrong");
        }
    }
}