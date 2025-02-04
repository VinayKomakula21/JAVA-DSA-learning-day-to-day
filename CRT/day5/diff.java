
import java.util.Arrays;
import java.util.Scanner;

public class diff {
    static int findCount(int[] arr, int length, int num, int diff){
        int count=0;
        if(length==0){
            return -1;
        }
        for(int i:arr){
            if(Math.abs(i-num)<=diff){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Arrays.setAll(arr,(i)->arr[i]=sc.nextInt());
        int num=sc.nextInt();
        int diff=sc.nextInt();

        System.out.println(findCount(arr,n,num,diff));
    }
}
