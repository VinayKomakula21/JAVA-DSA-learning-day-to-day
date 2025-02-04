
import java.util.Scanner;

public class patterns {
    static void square(int n){
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    static void hill(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            for(int col=row;col<n;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();

        hill(n);
        square(n);
    }
}
