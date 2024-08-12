package Revision;

public class BetterSecondlar {
    public static void main(String[] args) {

        int [] arr = new int[]{1,3,2,56,4};
        int largest = arr[0];
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] >arr[largest]){
                largest = arr[i];
            }
        }

        int secondlar = -1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>secondlar && arr[i]!= largest){
                secondlar= arr[i];
            }
        }

        System.out.println("Second Largest :"+secondlar);

    }
}
