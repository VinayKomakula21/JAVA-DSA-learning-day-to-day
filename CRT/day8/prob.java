/*
given an array containing n integers,you need to find the total number of inversions.

Inversion: two elements a[i] and a[j] form an inversion
if a[i]>a[j] and i<j

Input:
5
0 5 2 3 1

Output:
5
 */

import java.util.Scanner;

public class prob {
    static int inversionCount(int[] arr){
        int count=0;
        for(int i=0;i < arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(inversionCount(arr));
    }
}

