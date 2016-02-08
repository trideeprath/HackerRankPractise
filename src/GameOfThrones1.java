import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrones1 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        for(char c : inputString.toCharArray()){
            Integer value = charMap.get(c);
            if(value == null){
                charMap.put(c,1);
            }
            else{
                charMap.put(c,++value);
            }
        }
        
        int oddCount = 0;
        String ans = "YES";
        for (Map.Entry<Character, Integer> entry : charMap.entrySet())
        {
            if(oddCount>1){
                ans = "NO";
                break;
            }
            if(entry.getValue()%2!=0){
                oddCount++;
            }
        }
        
        
       
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
}
