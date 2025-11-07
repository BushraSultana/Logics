package Assignment4;

import java.util.*;

public class FindMAX_min_Char
{
    public static void main(String[] args)
    {
        String str="apple";
        int min=0;
        int  max=0;
        char charMax=0;
        char charMin=0;
        Map<Character,Integer> count=new TreeMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
            for(int i=0;i<str.length();i++)
            {

                char ch = str.charAt(i);
                int x=count.getOrDefault(ch,0);
                 if(x>max)
                 {
                    max=x;
                     charMax=ch;
                  }
               else
               {
                  min=x;
                  charMin=ch;
               }

            }

     System.out.println("The Maximum occuring character is "+charMax+",it occurs "+max+"times");
        System.out.println("The Minimum occuring character is "+charMin+",it occurs "+min+"times");
    }
}
