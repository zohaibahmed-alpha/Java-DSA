import java.util.*;
public class Lec6func {
    public static int printMul(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(printMul(a , b));

    }
    
}
