package Assignment3;

public class DivideString_NParts {
    public static void main(String[] args) {
String name="bushra";
int len=name.length();
int n=2;
int rem;
if(len%n!=0){
   
    System.out.println("Cant divide in equal parts");
}
else{
    int parts = len/n; //3
    for(int i=0;i<len;i=i+parts){
       System.out.println( name.substring(i,i+parts));  //
    }
}
    }
}
