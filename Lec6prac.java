import java.util.*;
public class Lec6prac {
  public static void printAge(int n) {
    if(n >= 18) {
      System.out.println("elegible to vote");
    } else {
      System.out.println("not eligible");
    }
  }
   
    
    
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAge(n);
        
        
    }
    
}
