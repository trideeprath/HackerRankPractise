import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakeItAnagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        str1 = sortString(str1);
        str2 = sortString(str2);
        
        int index1 = 0;
        int index2 = 0;
        int count=0;
        while(index1 < str1.length() && index2 < str2.length()){
            int charOneValue = (int)str1.charAt(index1);
            int charTwoValue = (int)str2.charAt(index2);
            
           if(charOneValue > charTwoValue){
               count++;
               index2++;
           }
           else if(charTwoValue > charOneValue){
               count++;
               index1++;
           }
           else{
               index1++;
               index2++;
           }
            
            
        }
        
        if(index1< str1.length()){
            count = count + (str1.length() - index1);
        }
        else if(index2 < str2.length()){
            count = count + (str2.length() - index2);
        }
            
        System.out.println(count);
        
        
        
    }
    
    public static String sortString(String original){
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}