package Revision;

public class OptimalLarArr {
    public static void main(String[] args) {
        int [] arr = new int[]{1,3,2,56,4};
        int largest = arr[0];
        for(int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] >arr[largest]){
                largest = arr[i];
            }
        }
        System.out.println("Largest : "+largest);

    }
}
