import java.util.*;
public class Lec3 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = 5;
    int number = 1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            int sum = i+j;
            if(sum % 2 == 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
    }
    System.out.println();
    }
    
}
}
