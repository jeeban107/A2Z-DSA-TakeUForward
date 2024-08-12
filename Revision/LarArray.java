package Revision;

public class LarArray {
    public static void main(String[] args) {

        int [] arr ;
        arr= new int[]{1, 2, 89, 23, 21};

        int temp;
        for (int i = 0; i <arr.length -1; i++) {
                if(arr[i] >arr[i+1]){
                     temp = arr[i];
                     arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Largest Element in the array is: "+arr[arr.length-1]);

    }
}
