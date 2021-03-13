package Search_tasks;

import java.util.stream.IntStream;

public class subArray {

    public static void main(String[] args) {
        int[] intArray = new int[]{4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};

        //for (int i = 0; i < intArray.length; i++)
          //  System.out.println("Index: " + i + " = " + intArray[i]);

        intArray(intArray, 0 ,0);

        int sum = IntStream.of(intArray).sum();
        System.out.println(sum);

    }
    static void intArray(int []intArray, int start, int end)
    {
        /** Stop hvis vi har nådd slutten av arrayen **/
        if (end == intArray.length)
            return;

        /** increment slutt punktet og start fra 0 **/
        else if (start > end)
            intArray(intArray, 0, end + 1);

        /** print subarrayen og increment start punktet **/
        else
        {
                //System.out.println();
            for (int i = start; i < end; i++){
                //System.out.println(intArray[i]+ ",");
            }
                //System.out.println(intArray[end]);
            intArray(intArray, start + 1, end);
        }
        return;
    }
}
