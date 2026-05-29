package basics;
import java.util.*;
public class Lec6func {
    // public static int printMul(int a, int b){
    //     return a*b;
    // }
    public static void printFact(int n){
        int factorial = 1;
        if(n < 0) {
            System.out.println("invalid num");
            return;
        }
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
         System.out.println(factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFact(n);
        

    }
    
}
