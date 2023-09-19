package array;

import java.util.Scanner;

public class userINput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the size of array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the elements of array:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
// accessing array elements using the for loop
        for (int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
