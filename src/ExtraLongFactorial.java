import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger result = new BigInteger("1");
        
        for(int i =n ; i>1 ; i--){
            result = result.multiply( BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
