package Assignment4;

import java.util.Arrays;

public class Replace_lower2Upper_viceVersa {
    public static void main(String[] args) {
        String name="bushra";
        String nam2="";
     //   char[] my=name.toCharArray();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch>='a' && ch<='z'){
                nam2+=(char)(ch-32);
            } else  {
                nam2+=(char)(ch+32);
            }

        }
        System.out.println(nam2);
    }
}
