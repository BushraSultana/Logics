package Assignment3;

public class TotalVowels_TotalConso {
    public static void main(String[] args){
        String name="bushra";

        String vowels=name.replaceAll("[^aeiou]","");
        System.out.println("In "+name+" we have "+vowels.length()+" Vowels");
        String consonants=name.replaceAll("[aeiou]","");
        System.out.println("In "+name+" we have "+consonants.length()+" Consonants");



//        for(int i=0;i<name.length()-1;i++) {
//            if (name.charAt(i)==["aeiou"]) {
//
//            }
//        }
    }
}

