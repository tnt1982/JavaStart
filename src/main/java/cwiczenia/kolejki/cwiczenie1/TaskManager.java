package cwiczenia.kolejki.cwiczenie1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Queue<Task> newTask = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return -Integer.compare(t1.getPriority().rank, t2.getPriority().rank);
            }
        });

        addNewTas(newTask);
        addNewTas(newTask);
        addNewTas(newTask);
        printAllTask(newTask);
        pickHighestPriorityTask(newTask);
        exit();
    }
    static void addNewTas(Queue<Task> newTask) {
        System.out.println("Podaj nazwę zadania: ");
        String task = scanner.nextLine();
        System.out.println("Podaj opis zadania: ");
        String description = scanner.nextLine();
        System.out.println("Podaj priorytet zadania (high, moderate, low): ");
        Priority priority = Priority.valueOf(scanner.nextLine().toUpperCase());
        newTask.add(new Task(task, description, priority));
    }

    static Task pickHighestPriorityTask(Queue<Task> tasks) {
        final Task highestRankTask = tasks.peek();
        System.out.println("Zadanie o najwyższym priorytecie na dziś: ");
        System.out.println(highestRankTask);
        return highestRankTask;
    }

    static void printAllTask(Queue<Task> tasks) {
        System.out.println(tasks);
    }

    static void exit() {
        System.out.println("Dziękuję za skorzystanie z programu");
    }

}
