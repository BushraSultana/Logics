package Assignment4;

public class Palindrome_String {
    public static void main(String[] args) {
        String m="mom";
        String result="";
        for (int i=m.length()-1;i>=0;i--){
            char ch=m.charAt(i);
            result+=ch;
        }
        if(result.equals(m)) System.out.println("Palindromee");
       else System.out.println("Not Palindromee");
    }
}
