
import java.util.Arrays;
import java.util.Scanner;

public class third {
    static void LargeSmallSum(int[] arr){
        int n=arr.length;
        int f_max = Integer.MIN_VALUE, s_max = Integer.MIN_VALUE;
        int f_min = Integer.MAX_VALUE, s_min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(i%2==0){
                //find 2nd large
                if(arr[i] > f_max) {
                    s_max = f_max;
                    f_max = arr[i];
                } else if(arr[i] > s_max && arr[i] != f_max) {
                    s_max = arr[i];
                }
            }
            else{
                //find 2nd small
                if(arr[i]<f_min){
                    s_min=f_min;
                    f_min=arr[i];
                }
                else if(arr[i]<s_min && arr[i]!=f_min){
                    s_min=arr[i];
                }
            }
        }
        System.out.println(s_min+s_max);

    }
    static int find2ndLargest(int[] arr) {
        int f_max = Integer.MIN_VALUE, s_max = Integer.MIN_VALUE;
        for(int element: arr) {
            if(element > f_max) {
                s_max = f_max;
                f_max = element;
            } else if(element > s_max && element != f_max) {
                s_max = element;
            }
        }
        return s_max;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        Arrays.setAll(arr,(i)->arr[i]=sc.nextInt());
        LargeSmallSum(arr);
    }
}
