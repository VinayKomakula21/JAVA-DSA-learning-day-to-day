import java.util.Scanner;

public class Bounds{
    /*
    Given a list N integers in the increasing order and an integer K.
    Your task is to find the lower bound of K in the list.
    The lower bound of K is the element which is equal or nearest larger
    element of K.
    */

    static int lowerBound(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        int answer = -1;
        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] < k)
                low = mid + 1;
            else {
                answer = mid;
                high = mid - 1;
            }
        }
        return answer;
    }

    static int upperBound(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        int answer = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(k == arr[mid]) {
                answer = mid + 1;
                low = mid + 1;
            } else if(arr[mid] > k)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return answer;
    }

    static int findFrequency(int[] arr, int k) {
        int lb = lowerBound(arr, k);
        int ub = upperBound(arr, k);
        return ub - lb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        
    }
}
