package Revision;

public class OptimalSLar {
    public static void main(String[] args) {

        int [] arr ;
        arr= new int[]{1, 3, 8, 2,10,7};

        int lar= arr[0];
        int slar = -1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>lar){
                slar = lar;
                lar = arr[i];

            } else if (arr[i] < lar && arr[i]> slar) {
                slar =arr[i];
            }

        }
        System.out.println("Second Largest:"+slar);

    }
}
