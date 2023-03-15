package cwiczenia.Enum.Ćwiczenie2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista wszystkich zamówień: ");

        Order[] orders = new Order[10];
        orders[0] = new Order("monitor LG", 799.99, Status.NEW);
        orders[1] = new Order("myszka Microsoft", 77.99, Status.PAID);
        orders[2] = new Order("klawiatura Microsoft", 99.99, Status.SHIPPED);
        orders[3] = new Order("kostka Rubika", 49.99, Status.DELIVERED);
        orders[4] = new Order("podkładka pod kubek", 9.99, Status.CANCELLED);
        orders[5] = new Order("butelka na wodę", 39.99, Status.NEW);
        orders[6] = new Order("lampka na biurko IKEA", 79.99, Status.PAID);
        orders[7] = new Order("głośniki 2.1 Creative", 499.99, Status.SHIPPED);
        orders[8] = new Order("iPhone SE 2020", 1999.99, Status.DELIVERED);
        orders[9] = new Order("Samsung Galaxy S21", 3999.99, Status.CANCELLED);

        printAllOrders(orders);

        System.out.println("\nFiltrujemy zamówienia.\nPodaj status zamówień, które chcesz zobaczyć:");
        Status selectedStatus = Status.valueOf(scanner.nextLine());

        Order[] filteredOrders = selectedOrders(orders, selectedStatus);

        printSelectedOrders(filteredOrders);

    }

    public static Order[] selectedOrders(Order[] orders, Status status) {
        int size = countSelectedOrders(orders, status);
        Order[] orderByStatus = new Order[size];
        int counter = 0;
        for (Order order : orders) {
            if (order.getStatus() == status) {
                orderByStatus[counter] = order;
                counter++;
            }
        }
        return orderByStatus;
    }

    private static int countSelectedOrders(Order[] orders, Status status) {
        int count = 0;
        for (Order order : orders) {
            if (order.getStatus() == status) {
                count++;
            }
        }
        return count;
    }

    public static void printAllOrders (Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public static void printSelectedOrders(Order[] filteredOrders) {
        for (int i = 0; i < filteredOrders.length; i++) {
            System.out.println(filteredOrders[i]);
        }
    }
}
