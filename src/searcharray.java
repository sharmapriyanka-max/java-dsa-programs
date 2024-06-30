// search in a rotated sorted array

import java.util.Scanner;

public class searcharray {
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        //System.out.println("Enter the size of array");
        //int n=scn.nextInt();
        int[] arr={4,5,1,2,3};
        System.out.println("Enter the element to be searched");
        int k=scn.nextInt();
        int index=sortedsearcharray(arr,k);
        System.out.println("index of the searched element " + index);


    }

    private static int sortedsearcharray( int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]>=arr[start])
            {
                if(k>=arr[start]&&k<=arr[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if(k>=arr[mid] && k<=arr[end])
                {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
