
import java.util.Scanner;

public class leastdigitsum {
    static int findLeastdigit(int n){
        int min=Integer.MAX_VALUE;
        while(n!=0){
            int rem=n%10;
            if(rem<min){
                min=rem;
            }
            n=n/10;
        }
        return min;
    }
    static int lDigitsum(int[] arr){
        int sum=0;
        for(int i:arr){
            int a=findLeastdigit(i);
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int v=lDigitsum(arr);
        System.out.println(v);
    }
}
