package strings;

import java.util.*;
public class Lec12sb {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder("Zohaib");
        // System.out.println(sb);
        // System.out.println(sb.charAt(0));
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);
        // sb.insert(0, 'L');
        // System.out.println(sb);
        // sb.delete(0,2);
        // System.out.println(sb);
        // StringBuilder sb = new StringBuilder("h");
        // sb.append('e');
        // sb.append('l');
        // sb.append('l');
        // sb.append('o');
        // System.out.println(sb.length());

        
     StringBuilder sb = new StringBuilder("HelloWorld");
    
     for(int i=0; i<sb.length()/2; i++) {
       int front = i;
       int back = sb.length() - i - 1;


       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);


       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }


     System.out.println(sb);
   }
}


        
        
    
    

