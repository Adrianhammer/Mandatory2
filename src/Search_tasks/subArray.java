package Search_tasks;

import java.security.KeyPair;
import java.util.*;
import java.util.stream.IntStream;


class Sub {
    int first, second;

    Sub(int a, int b) {
        first = a;
        second = b;
    }
}

public class subArray {

    static ArrayList<Sub> findSubArrays(int[] arr, int n, int total) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        ArrayList<Sub> out = new ArrayList<>();

        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0)
                out.add(new Sub(0, i));
            ArrayList<Integer> al = new ArrayList<>();

            if (map.containsKey(sum)) {
                al = map.get(sum);
                for (int it = 0; it < al.size(); it++) {
                    out.add(new Sub(al.get(it) + 1, i ));
                }
            }
            al.add(i);
            map.put(sum, al);
        }
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] + arr[j] == total)
                    System.out.println(" Pairs of elements that adds up to zero (" + arr[i] + ", " + arr[j] + ")");

        return out;
    }

    static void print(ArrayList<Sub> out) {
        for (int i = 0; i < out.size(); i++) {
            Sub s = out.get(i);
            System.out.println("Subarrays that adds up to zero " + s.first + " to " + s.second);
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
        int n = arr.length;
        int total = 0;

        ArrayList<Sub> out = findSubArrays(arr, n, total);
        if (out.size() == 0)
            System.out.println("No subarray exists");
        else print(out);
    }

}




