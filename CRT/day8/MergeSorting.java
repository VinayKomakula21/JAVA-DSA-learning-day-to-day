import java.util.Scanner;

public class MergeSorting {
    static void merge(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        int i = start, j = mid + 1;
        int[] tmp = new int[end - start + 1];
        int idx = 0;

        while(i <= mid && j <= end) {
            if(arr[i] < arr[j])
                tmp[idx++] = arr[i++];
            else
                tmp[idx++] = arr[j++];
        }
        while(i <= mid)
            tmp[idx++] = arr[i++];
        while(j <= end)
            tmp[idx++] = arr[j++];

        for(int index = 0, oIdx = start; index < tmp.length; index++) {
            arr[oIdx++] = tmp[index];
        }
    }

    static void mergeSort(int[] arr, int start, int end) {
        if(start >= end)
            return;
        // Divide until each sublist contains single element
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        // Merge into sorted order
        merge(arr, start, end);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n);
        
        for(int item:arr){
            System.out.print(item);
        }
    }
}
