package Search_tasks;

import java.security.KeyPair;
import java.util.*;
import java.util.stream.IntStream;


/**
 *  In this assignment we wanted to try and solve all three tasks in one class, with the only intention of just
 *  seeing if it was possible. That is why we chose to use both ArrayList together with HashMap to try and
 *  make them work together. We managed to complete task "a" and "b" but decided to move task "c" to a seperate class.
 *  Another reason for choosing HashMap is because that the worst case for searching, insertion and deletion is O(n) and
 *  O(1) respectively.
 */

class Sub {
    int first, second;

    Sub(int a, int b) {
        first = a;
        second = b;
    }
}

public class subArray {

    /**Finding sub arrays that adds up to zero in the given array**/

    static ArrayList<Sub> findSubArrays(int[] arr, int n, int total) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        ArrayList<Sub> list1 = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0)
                list1.add(new Sub(0, i));

            ArrayList<Integer> list2 = new ArrayList<>();
            if (map.containsKey(sum)) {
                list2 = map.get(sum);
                for (int it = 0; it < list2.size(); it++) {
                    list1.add(new Sub(list2.get(it) + 1, i ));
                }
            }
            list2.add(i);
            map.put(sum, list2);
        }
        return list1;
    }

    /**Finding Pairs that adds up to zero in the given array**/

     static void pairs(int[] arr, int total) {

        Map<Integer, Integer> pairMap = new HashMap<>();
        List pairList = new ArrayList();

         System.out.println("Finding pairs...");

        for (int k = 0; k < arr.length; k++) {
            if (pairMap.containsKey(total - arr[k]))  {

                Integer[] temp = { pairMap.get(total  - arr[k]), k };
                pairList.add(temp);
                System.out.printf("Pair found (%d, %d) \n", arr[pairMap.get(total - arr[k])], arr[k]);
            }
           else pairMap.put(arr[k], k);
        }
         System.out.println("All pairs have been found.\n");
    }

    /**Prints out the subarrrays that adds up to zero**/

    static void print(ArrayList<Sub> out) {
        System.out.println("Finding Subarrays...");

        for (int i = 0; i < out.size(); i++) {
            Sub s = out.get(i);
            System.out.println("Subarrays that add up to zero are from index " + s.first + " to index " + s.second);
        }
        System.out.println("All subarrays found.");
    }

    /** The main method where the list is defined and other methods are called.*/
    public static void main(String[] args) {
            //Index: 0, 1, 2, 3,  4,  5,  6, 7,  8,  9, 10, 11, 12, 13, 14, 15, 16, 18, 19, 19, 20, 21, 22, 23
        int[] arr = {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5,  -5, -6, -7, -8, -99, 42, 11, 20, 1,  2,  3};
        int n = arr.length;
        int total = 0;


        pairs(arr, total);

        ArrayList<Sub> out = findSubArrays(arr, n, total);
        if (out.size() == 0)
            System.out.println("No subarray exists");
        else print(out);
    }

}




