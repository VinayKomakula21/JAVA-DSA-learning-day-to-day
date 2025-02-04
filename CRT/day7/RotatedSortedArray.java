import java.util.Scanner;

public class RotatedSortedArray {
    static int rotatingsort(int[] arr,int key){
        int low=0,high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(arr[mid]>=arr[low]){
                if (key > arr[low] && key < arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
                
            }
            else{
                if(key < arr[high] && key > arr[mid])
                    low=mid+1;
                else
                    high=mid-1;

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
        int key=sc.nextInt();

        System.out.println(rotatingsort(arr, key));
    }
}
