/**
@author Sandeep Kolli
*/

public class Main{
public static void main(String[] args) {
    ToDoList todo = new ToDoList();
    todo.addTask("Module 5 Assignment 1", "Need to finish ToDoList Assignment", "24/09/2019", "incomplete");
    todo.addTask("Module 5 Assignment 1 Date Objects", "Understand how Date should be handled", "23/09/2019", "complete");
    todo.addTask("Module 4 Assignment 1 Library Card Catalog", "Understand how array of objects to be handled", "16/10/2019", "inprocess");
    todo.addTask("Dummy Task", "Task Description", "11/11/2019", "incomplete");

    todo.removeTask("Dummy Task");

    System.out.println();
    System.out.println("Pending Tasks:");
    todo.displayPendingIncompleteTasks();

    System.out.println("Tasks on Date 23/09/2019:");
    todo.displayBasedonDate("23/09/2019");

    System.out.println("Details about 'Module 4 Assignment 1 Library Card Catalog' Task:");
    todo.displayBasedonTask("Module 4 Assignment 1 Library Card Catalog");

    System.out.println("Display all the tasks:");
    todo.displayTasks();

    System.out.println("-----------------------------------------------------");
    System.out.println("Details about 'Module 5 Assignment 1' Task (Before Change):");
    todo.displayBasedonTask("Module 5 Assignment 1");

    System.out.println("after change");
    todo.UpdateStatus("Module 5 Assignment 1", "inprocess");

    System.out.println("Details about 'Module 5 Assignment 1' Task (After Change):");
    todo.displayBasedonTask("Module 5 Assignment 1");
    System.out.println("-----------------------------------------------------");

    System.out.println("The Pending tasks are :");
    todo.pendingTasks();
}    
}