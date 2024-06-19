package Sorting;

import java.util.Scanner;

public class BubbleSort {

    static  void bubble_sort(int arr[],int n){

        for (int i = n-1; i >=0 ; i--) {

            for (int j = 0; j <= i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
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

        bubble_sort(arr,n);
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] +" ");

        }
    }
}
