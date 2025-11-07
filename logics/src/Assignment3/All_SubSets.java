package Assignment3;

public class All_SubSets {
    public static void main(String[] args) {
        String s="FUN";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length()-i;j++){
                     System.out.println(s.substring(i+j,s.length()));
            }
        }
    }
}
