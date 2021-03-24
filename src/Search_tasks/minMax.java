package Search_tasks;

import java.util.ArrayList;
import java.util.Arrays;

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
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        System.out.println("Det minste tallet i listen er :" + min);
    }

    public static void Max(ArrayList<Integer> array, int max) {
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
        }
        System.out.println("Det største tallet i listen er : " + max);
    }
}
