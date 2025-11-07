package Assignment4;

public class Check_stringRotation {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="cdab";
        String res="";
        String str3=str1+str1;
        int leng=str1.length();
      //  System.out.println(str3);
        for(int i=0;i<str1.length();i++){
          res=  str3.substring(i,i+leng);
          if(res.equals(str2)){
              System.out.println("Yes its rotation");
             return;
          }
        }
        System.out.println("No its not rotation");



    }
}
