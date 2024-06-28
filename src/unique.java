
/*	You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1]. Now, in the given array/list, 'M' numbers are present twice and one number is present only once. You need to find and return that number which is unique in the array/list.
        Note: Unique element is always present in the array/list according to the given condition.*/

import java.util.Scanner;

public class unique {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int uniqueelement=findunique(arr);

        System.out.println("the unique element is " + uniqueelement);

    }

    private static int findunique(int[] arr) {
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            result=result^arr[i];
        }

        return result;
    }
}
