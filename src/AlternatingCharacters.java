import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int c = 0 ; c< testCase ; c++){
            String str = sc.next();
            int count =0 ; 
            for(int i=0 ; i <str.length() ; i++){
                char current = str.charAt(i);
                int j = i+1;
                while( (j< str.length()) && (current == str.charAt(j))  ){
                    count++;
                    j++;
                }
                i = (j-1);
            }
            System.out.println(count);
        }
    }
}