import java.util.Scanner;

public class searching{
    static int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(key == arr[i])
                return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(key == arr[mid])
                return mid;
            else if(key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    static int ternarySearch(int[] arr,int key){
        int low=0,high=arr.length-1;
        while(low<=high){
            int dist=(high-low)/3;
            int mid1=low+dist;
            int mid2=high-dist;

            if(key==arr[mid1])
                return mid1;
            else if(key<arr[mid1])
                high=mid1-1;
            else if(key==arr[mid2])
                return mid2;
            else if(key<arr[mid2]){
                low=mid1+1;
                high=mid2-1;
            }
            else
                low=mid2+1;
        }
        return -1;
    }


    static int jumpSearch(int[] arr, int key) {
        int i = 0;
        int jump = (int)Math.sqrt(arr.length);

        int start = i;
        while(i < arr.length) {
            if(key == arr[i])
                return i;
            else if(key > arr[i]) {
                start = i+1;
                i = i + jump;
                if(i >= arr.length)
                    break;
            } else
                break;
        }
        i = i >= arr.length ? arr.length : i;
        for(int idx = start; idx < i; idx++)
            if(key == arr[idx])
                return idx;
        return -1;
    }


    static int ExpSearch(int[] arr,int key){
        if(key==arr[0])
            return 0;
        int i=1;
        int start=0;
        while(i<arr.length){
            if(key==arr[i]){
                return i;
            }
            else if(key>arr[i]){
                start=i;
                i=i*2;
                if(i>=arr.length)
                    break;
            }
            else{
                break;
            }
        }
        for(int idx=start;idx<arr.length||idx<i;idx++){
            if(key==arr[idx]){
                return idx;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        System.out.println(ExpSearch(arr,target));
    }
}

/*
1.linear search
2.Binary search
3. Ternary search
4. Jump search
5.Exponential search
6.interpretation search
*/