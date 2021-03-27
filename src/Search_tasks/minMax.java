package Search_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * In this case we chose to use ArrayList as our datastructure for a few reasons. The numbers that we are working
 * with are to be in a spesific order. ArrayList maintains the insertion order of the elements. In addition,
 * worst case scenario for an ArrayList in terms of BigO-Notation is O(n) for search, insertion and deletion.
 */


public class minMax {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3));

        int min = array.get(0);
        int max = array.get(0);

        Min(array, min);
        Max(array, max);
    }

    public static void Min(ArrayList<Integer> array, int min) {
        System.out.println("Finding smalles number in the list...");
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        System.out.println(String.format("The smallest number in the list is: %d. At index %d\n", min, array.indexOf(min) + 1));
    }

    public static void Max(ArrayList<Integer> array, int max) {
        System.out.println("Finding biggest number in the list...");
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        System.out.println(String.format("The biggest number in the list is: %d. At index: %d", max, array.indexOf(max) + 1));
    }
}
