import java.util.Scanner;

public class QuickSort {
    static int partition(int[] arr,int start,int end){
        int pivot=arr[start];
        int pivotIdx=start;
        
        while (start < end) { 
            while(start < arr.length && arr[start] <= pivot){
                start++;
            }
            while(end > 0 && arr[end] > pivot){
                end--;
            }
            if(start < end){
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }
        int tmp = arr[end];
        arr[end] = arr[pivotIdx];
        arr[pivotIdx] = tmp;

        return end;
    }

    static void QSort(int[] arr,int start,int end){ 
        if(start < end){
            int pivotIdx = partition(arr,start,end);
            QSort(arr, start, pivotIdx-1);
            QSort(arr, pivotIdx+1, end);
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

        QSort(arr, 0, n);
    }
}
