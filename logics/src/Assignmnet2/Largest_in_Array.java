package Assignmnet2;

public class Largest_in_Array {
    public static void main(String[] args) {

        System.out.println("Largest element in an integer array");
        int[] Arr={1,0,2,7,4,5};
        int min=Arr[0];
        int max=Arr[0];
        for(int no : Arr){
            if(no>max){
                max=no;
            }
            else if(no<min){
                min=no;
            }
        }
        System.out.println("Largest-->"+max+" "+"Minimum-->"+min);

        System.out.println("=================================================================================");
        System.out.println("Second Largest element in an integer array");

        int[] az={1,2,3,4,5,6};
        int firstMax=0;
        int secondMax=0;

        for(int v:az){
            if(v>firstMax){

                secondMax=firstMax;
                firstMax=v;
            }
            else if(v>secondMax && v!=firstMax){
                secondMax=v;
            }
        }

        System.out.println("secondLargest-->"+secondMax);

        System.out.println("=================================================================================");
        System.out.println("Third Largest element in an integer array");
        int[] a3={1,2,3,4,90,5,6};
        int firMax=a3[0];
        int secMax=a3[0];
        int thiMax=a3[0];
        for(int v:az){
            if(v>firMax){
                thiMax=secMax;
                secMax=firMax;
                firMax=v;
            }
            else if(v>secMax && v!=firMax ){
                thiMax=secMax;
                secMax=v;
            }
            else if(v>thiMax && v!=secMax && v!=firMax){
                thiMax=v;
            }
        }
        System.out.println("thirdLargets-->"+thiMax);
    }
}



