import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        
        for(int i =0 ; i<testCases ; i++){
            String str1 = sc.next();
            String str2 = sc.next();
            Set<Character> set1 = new HashSet<Character>();
            Set<Character> set2 = new HashSet<Character>();
        
            for(char c : str1.toCharArray()){
                set1.add(c);    
            }

            for(char c: str2.toCharArray()){
                set2.add(c);
            }

            set1.retainAll(set2);
            if(set1.size()>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}