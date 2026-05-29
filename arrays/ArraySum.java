package arrays;

import java.util.*;
public class ArraySum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println("sum of array is : " + sum);
    }

    
}
