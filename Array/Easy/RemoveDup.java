package Array.Easy;

import java.util.Scanner;

public class RemoveDup {
    public int removeDuplicates(int[] nums) {
        int i =0 ;

        for(int j = 1 ; j< nums.length;j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }

        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        RemoveDup rd = new RemoveDup();
        int k  = rd.removeDuplicates(arr);
        System.out.println("Unique=" +k);
    }
}
