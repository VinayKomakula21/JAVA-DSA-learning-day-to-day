
import java.util.Scanner;


public class sending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split("");
        int n=arr.length;
        for (int row=1;row<=n;row++){
            for(int col=row;col<n;col++){
                System.out.print(' ');
            }
            for(int col=0;col<row;col++){
                System.out.print(arr[col]);
            }
            System.out.println("");
        }
        for (int row=1;row<=n;row++){
            for(int col=row;col<n;col++){
                System.out.print(arr[col]);
            }
            for(int col=row;col<n;col++){
                System.out.print(' ');
            }
            System.out.println("");
        }
    }
}
