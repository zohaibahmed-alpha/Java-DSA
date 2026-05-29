import java.util.*;
public class Lec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operators = sc.nextInt();
        int a  = sc.nextInt();
        int b  = sc.nextInt();

        switch(operators) {
            case 1: System.out.println(a + b);
            break;
            case 2: System.out.println(a - b);
            break;
            case 3: System.out.println(a * b);
            break;
            case 4: System.out.println(a / b);
            break;
        
        }


    }
    
}
