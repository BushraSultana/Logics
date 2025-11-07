package Assignment4;

import java.util.Arrays;

public class Reverse_String {

    public static void main(String[] args) {

//REVERSING CHARACTER BY CHARACTER
        //Using Array
        String s = "bushra";

        char[] myArr = s.toCharArray();
        int i=0;
        int j=myArr.length-1;

       while(i<j) {
                  char temp=myArr[i];
                myArr[i]=myArr[j];
                myArr[j]=temp;
                i++;
                        j--;
        }
       String res=new String(myArr);
       //System.out.println(Arrays.toString(myArr));
        System.out.println("REVERSING CHARACTER BY CHARACTER: "+res);

        //REVERSING WORD BY WORD
        String s2="I Love Programming";
        String[] chArr=s2.split(" ");
        for(int k=chArr.length-1;k>=0;k--){
            System.out.print(chArr[k]+" ");
        }

    }
    }

