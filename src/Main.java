import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
                for(int i=0;i<n;i++) {
                    arr[i] = scn.nextInt();
                }
                swappairs(arr);
                System.out.println("Array after swapping");
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }


    }

    public static void swappairs(int[] arr) {
        for(int i=0;i<arr.length-1;i=i+2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }


    }
}