package Assignment4;

public class Print_DuplicateinString {
    public static void main(String[] args) {
        String s1="Hi Hi bye bye bushra";
        String[] strArray=s1.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j < s1.length()-1; j++) {
                if (strArray[i].equals(strArray[j])) {
                    System.out.println(strArray[i]);
                    break;
                }
            }
        }
    }
}
