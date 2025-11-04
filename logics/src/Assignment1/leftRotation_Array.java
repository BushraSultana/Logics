package Assignment1;

public class leftRotation_Array {
    public static void main(String[] args){
        //Left rotate elements in array by two positions
        System.out.println("Left rotate elements in array by two positions");
        int[] myArr1={1,2,3,4,5};
        int n=2;
        for(int i=0;i<n;i++) {
            int first = myArr1[0];

            for (int j = 0; j < myArr1.length - 1; j++) {

                myArr1[j] = myArr1[j+1];
            }
            myArr1[myArr1.length-1]=first;
        }
        for(int x:myArr1){
            System.out.println(x);
        }
    }
}
