import java.util.Scanner;

public class bin {
    public static void main(String[] args) {
        int x,n,i=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        int arr[]=new int[10];
        while(x!=0){
            n=x%2;
            arr[i]=n;
            i++;
            x=x/2;
        }
        for(int j=i;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
