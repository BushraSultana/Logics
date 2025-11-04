package Assignment1;

public class printDuplicates {
    public static void main(String[] args){
        System.out.println("Print duplicates of Array ");
        int[] myArr4={1,1,2,2,3,4};

        for (int i = 0; i < myArr4.length; i++) {
            for (int j = i + 1; j < myArr4.length; j++) {
                if (myArr4[i] == myArr4[j]) {
                    System.out.println(myArr4[i]);
                    break;
                }
            }
        }
    }
}
