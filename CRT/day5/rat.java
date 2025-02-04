
import java.util.Arrays;
import java.util.Scanner;

public class rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,unit,r,count=0;
        r=sc.nextInt();
        unit=sc.nextInt();
        n=sc.nextInt();
        int[] arr=new int[n];
        Arrays.setAll(arr,(i)->arr[i]=sc.nextInt());
        if(n==0){
            System.out.println("-1");
        }
        else{
            for(int j=0;j<n;j++){
                count+=arr[j];
                if(count>=r*unit){
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}
