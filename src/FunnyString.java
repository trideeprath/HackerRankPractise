import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCaseCount = sc.nextInt();
        for(int k=0 ; k<testCaseCount; k++){
            StringBuilder strBuilder = new StringBuilder(sc.next());
            String str1 = strBuilder.toString();
            String str2 = strBuilder.reverse().toString();
            boolean isFunny = true;
            //System.out.println(str1 + " " + str2);
            for(int i =0 ; i< str1.length()-1  ; i++){
               // System.out.println((Math.abs((double)str1.charAt(i) - (double)str1.charAt(i+1)))  + " " + (Math.abs((double)str2.charAt(i) - (double)str2.charAt(i+1))));
                if( (Math.abs((double)str1.charAt(i) - (double)str1.charAt(i+1)))  != (Math.abs((double)str2.charAt(i) - (double)str2.charAt(i+1)))){
                    isFunny = false;
                    break;
                }
            }
            if(isFunny){
                System.out.println("Funny");
            }
            else{
                System.out.println("Not Funny");
            }
            
        }
    }
}