package arrays;
import java.util.*;
public class Lec9 {
    public static void main (String args[]){
        int nums[] = {1,2,3,4,5,6,10};
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<nums.length;i++){
         sum = sum + nums[i];
        }
        System.out.println("sum is:" + sum);
    }
    
}
