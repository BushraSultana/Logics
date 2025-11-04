package Assignment1;

import java.util.HashMap;
import java.util.Map;

public class Frequency_ofElements_inArray {

    public static void main(String[] args) {

        //Frequency of elements in an array
        System.out.println("Frequency of elements in an array");
        int[] myArr = {1, 1, 3, 4, 5, 6};
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();

        for (int x : myArr) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry y : count.entrySet()) {
            System.out.println(y.getKey() + "----->" + y.getValue());
        }
    }
}
