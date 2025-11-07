package Assignment3;

import java.security.spec.RSAOtherPrimeInfo;

public class Anangram {
    public static void main(String[] args) {


        //Anagrams; Ex=KEEP & PEEK
        /*String s1 = "KEEP";
        String s2 = "PEEK";
        int s1L = s1.length();
        int s2L = s2.length();
        if (s1L != s2L) {
            System.out.println("Not Anangram");
        } else {
            for (int i = 0; i < s1L; i++) {
                if (s1.isEmpty()) break;  //If not anagram this is needed
                char ch = s1.charAt(0);

                s1 = s1.replace(ch + "", "");
                s2 = s2.replace(ch + "", "");


            }
            if (s1.length() == 0 && s2.length() == 0) {
                System.out.println("Anagram");

            } else
                System.out.println("Not Anagram");

        }*/

                String s1="cat";
                String s2="act";
                int len = s1.length();
                //System.out.println(s1.length());

                if(s1.length() != s2.length()){
                    System.out.println("Not Anagram");
                }
                else {
                    for(int i = 0;i<len;i++){
                        char ch=s1.charAt(0);
                        s1=s1.replace(ch+"","");
                        s2=s2.replace(ch+"","");

                    }


                    if(s1.length()==0 && s2.length()==0){
                        System.out.println("Anagram");
                    }
                    else System.out.println("Not Anagram");


                }


            }
        }


