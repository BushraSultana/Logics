package Assignmnet2;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArr={9,4,5,6,3};
        for(int i=0;i<myArr.length-1;i++){
            for(int j=0;j<myArr.length-1-i;j++){
                if(myArr[j]>myArr[j+1]){
                    int temp=myArr[j];
                    myArr[j]=myArr[j+1];
                    myArr[j+1]=temp;
                }
            }
        }
        for(int x:myArr) {
            System.out.println(x);
        }
    }
    }
