
import java.util.Scanner;

public class sorting {
    static void selectionSort(int[] arr){
        for(int pos=0;pos<=(arr.length-2);pos++){
            for(int next=pos+1;next<arr.length;next++){
                if(arr[pos]>arr[next]){
                    swap(arr[pos],arr[next]);
                }
            }
        }
        for(int item:arr){
            System.out.print(item+" ");
        }
    }
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for (int skipCount = 0; skipCount < n-1; skipCount++) {
            for(int y=0;y<n-skipCount-1;y++){
                if(arr[y]>arr[y+1]){
                    swap(arr[y],arr[y+1]);
                }
            }
        }
        for(int item:arr){
            System.out.print(item+" ");
        }
    }

    static void swap(int i,int j){
        int x=i;
        i=j;
        j=x;
    }

    static void insertionSort(int[] arr){
        int n=arr.length,i=1,j;
        while(i<n) {
            int temp=arr[i];
            j=i-1;
            while(j>=0&&temp<=arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
            i++;
        }
        for(int item:arr){
            System.out.print(item+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);
    }
}

/*
 * Selection sort  ---->O(n2)
 * Bubble sort     ---->O(n2)
 * Insertion sort  ---->O(n2)
 */