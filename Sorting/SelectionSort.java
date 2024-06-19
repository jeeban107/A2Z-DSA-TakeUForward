package Sorting;

import java.util.Scanner;

public class SelectionSort {


    static  void  SelSort(int arr[] ,int n){

        for (int i = 0; i <n ; i++) {
            int min = i;
            for (int j = i; j <n ; j++) {
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
             int temp = arr[min] ;
            arr[min] = arr[i];
            arr[i]= temp;
        }


    }
    public static void main(String[] args) {

        Scanner sc =  new Scanner( System.in);

        System.out.println("enter the size of the array :");
        int n = sc.nextInt();
        int [] arr= new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();

        }

        SelSort(arr,n);
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] +" ");

        }

    }
}
