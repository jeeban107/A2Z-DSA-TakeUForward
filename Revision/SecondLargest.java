package Revision;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr ;
        arr= new int[]{1, 3, 7, 7, 7};

        int temp;
        for (int i = 1; i <arr.length -1; i++) {
            if(arr[i] <arr[i-1]){
                temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
        int n = arr.length;

        int secondlargest= arr[n-1];
        for(int i = n-2; i >=0 ; i--) {
            if(arr[i]!= secondlargest){
                secondlargest= arr[i];
                break;
            }
        }

        System.out.println("Second largest:" +secondlargest);
    }
}
