package Assignment1;

public class rightRotation_Array {
    public static void main(String[] args){

        //Right rotate of Array
        System.out.println("Right rotate of Array by two positions");
        int[] myArray3={1,2,3,4,5};

        int n1=2;
        for(int i=0;i<n1;i++) {
            int last = myArray3[myArray3.length-1];

            for (int j=myArray3.length-1; j >0 ; j--) {

                myArray3[j] = myArray3[j-1];
            }
            myArray3[0]=last;
        }
        for(int x:myArray3){
            System.out.println(x);
        }

    }
}
