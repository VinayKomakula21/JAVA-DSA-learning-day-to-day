
import java.util.Arrays;
import java.util.Scanner;

public class arraysdemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr=new int[n];
        Arrays.setAll(arr,(i)->arr[i]=sc.nextInt());

        
    }
}
