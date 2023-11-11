package cwiczenia.kolejki.cwiczenie0;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ClientService {

    public static void main(String[] args) {
        //   Queue<Client> clients = new LinkedList<>(); - podstawowa implementacja kolejki, zasada fifo;
        Queue<Client> clients = new PriorityQueue<>();
        clients.add(new Client("Karol", 2));
        clients.add(new Client("Patrycja", 1));
        clients.add(new Client("Andrzej", 7));
        clients.add(new Client("Karolina", 3));

        System.out.println("Zawartość kolejki priorytetowej:");
        System.out.println(clients);

        while(!clients.isEmpty()) {
            System.out.println("Obsługiwany klient: " + clients.poll());
        }

        clients.peek(); // metoda do pobierania elementów z kolejki ale go nie usuwa
        clients.poll(); // metoda do pobierania elementów z kolejki i go usuwa


//        final String clientFirst = clients.peek();
//        final String clientSecond = clients.peek();
//        final String clientThird = clients.peek();
//        System.out.println(clients);

        Queue<String> dogs = new ArrayBlockingQueue<>(3); // w tej kolejce określamy maksymalną pojemność
        dogs.offer("Pimpuś");
        dogs.offer("Azorek");
        dogs.offer("Fifi");
        final boolean tadeuszek = dogs.offer("Tadeuszek");

        System.out.println(tadeuszek);
        System.out.println(dogs);

        Queue<Client> priorityQueue = new PriorityQueue<>(new Comparator<Client>() {
            @Override
            public int compare(Client c1, Client c2) {
                return Integer.compare(c1.getOrdersNumber(), c2.getOrdersNumber());
            }
        });
        priorityQueue.add(new Client("Karol", 2));
        priorityQueue.add(new Client("Patrycja", 1));
        priorityQueue.add(new Client("Andrzej", 7));
        priorityQueue.add(new Client("Karolina", 3));

        System.out.println(priorityQueue);






    }
}
