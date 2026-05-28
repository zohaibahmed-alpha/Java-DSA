import java.util.*;
public class Lec9 {
    public static void main (String args[]){
        int nums[] = {1,2,3,4,5,6,10};
        Scanner sc = new Scanner(System.in);
        int min = nums[0];
        for(int i=0; i<nums.length;i++){
         if(nums[i] < min) {
            min = nums[i];
         }
         
        }
        System.out.println("min nums is:" + min);
    }
    
}
