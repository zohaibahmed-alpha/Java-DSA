package arrays;

public class PrintEvenOdd {
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int Evencount = 0;
        int Oddcount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0) {
                Evencount++;
            }else{
                Oddcount++;
            }
        }
        System.out.println("Even nums are :" + Evencount);
        System.out.println("Odd nums are :" + Oddcount);
    }
    
}
