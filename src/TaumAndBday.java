import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaumAndBday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int b = in.nextInt();
            int w = in.nextInt();
            long x = in.nextInt();
            long y = in.nextInt();
            long z = in.nextInt();
            long score1 = 0;
            long score2 = 0;
            long small, big;
            if(x<=y){
                small = x;
                big =y;
            }
            else{
                big = x;
                small =y;
            }
            if(x == small ){
                score1 = small*b;
                
                if( (x+z) < y){
                    score2 = (x+z) *w;    
                }
                else{
                    score2 = y *w;
                }
                //System.out.println(score1 + " " + score2);
            }
            else{
                score1 = small*w;
                if((y+z) <x){
                    score2 = (y+z)*b;
                }
                else{
                    score2 = (x)*b; 
                }
                //System.out.println(score1 + " " + score2);
            }
            System.out.println(score1+score2);
            
            
        }
    }
}
