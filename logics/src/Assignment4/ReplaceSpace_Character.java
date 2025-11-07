package Assignment4;

public class ReplaceSpace_Character {
    public static void main(String[] args) {
        String myStr="I  am  bushra";

        String myStr2= myStr.replaceAll("\\s+ ","*");
        System.out.println(myStr2);

    }
}
