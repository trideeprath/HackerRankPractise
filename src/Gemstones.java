import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        Set<Character> bigSet = new HashSet<Character>();
        
        for(int i =0 ; i<testCases ; i++){
            Set<Character> set = new HashSet<Character>();
            String rockString = sc.next();
            Map<Character, Integer> elementMap = new HashMap<Character,Integer>();
            for(char c : rockString.toCharArray()){
                set.add(c);
            }
            if( i ==0){
                bigSet = set;
            }
            else{
                bigSet.retainAll(set);
            }
           
        }
        System.out.println(bigSet.size());
    }
}





