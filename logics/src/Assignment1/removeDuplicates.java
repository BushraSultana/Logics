package Assignment1;

import java.util.HashMap;
import java.util.Map;

public class removeDuplicates {
    public static void main(String[] args) {
        System.out.println("Remove duplicates of Array ");
        int[] myArr5 = {1, 3, 2, 1, 1};
        Map<Integer, Integer> notDup = new HashMap<Integer, Integer>();

        for (int yy : myArr5) {
            notDup.put(yy, notDup.getOrDefault(yy, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> zz : notDup.entrySet()) {
            if (zz.getValue() == 1) {
                System.out.println(zz.getKey());
            }
        }
    }
}
