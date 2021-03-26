package priorityQueue;


import java.io.Serializable;
import java.util.*;

public class priorityQueue{

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Terje", 5);
        hm.put("Kari", 7);
        hm.put("Nils", 4);
        hm.put("Otto", 8);
        hm.put("Syvert", 7);
        hm.put("Lise", 11);
        hm.put("Notto", 0);
        hm.put("Odd", 1);
        hm.put("Even", 2);

        System.out.println("Unordered list: " + hm);

        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(hm::get).reversed());
        System.out.println("\nPrioritized list from Highest to Lowest: ");
        pq.add("Terje");
        pq.add("Otto");
        pq.add("Even");
        pq.add("Lise");
        pq.add("Odd");
        pq.add("Syvert");
        pq.add("Kari");
        pq.add("Nils");
        pq.add("Notto");


        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
