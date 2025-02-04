import java.util.Scanner;

public class fountain {
    static void patt(int n){
        for (int row=1;row<=n;row++) {
            for(int col=1;col<=n;col++){
                if (col==row) {
                    System.out.print(col+" ");
                }
                else{
                    System.out.print(' '+" ");
                }
            }
            for(int col=1;col<=n;col++){
                if (col+row==n) {
                    System.out.print(row+" ");
                }
                else{
                    System.out.print(' '+" ");
                }
            }
            System.out.println("");
        }
        for (int row=1;row<=n;row++) {
            for(int col=1;col<=n;col++){
                if (col+row==n) {
                    System.out.print(col+" ");
                }
                else{
                    System.out.print(' '+" ");
                }
            }
            for(int col=1;col<n;col++){
                if (col==row) {
                    System.out.print(n-row+" ");
                }
                else{
                    System.out.print(' '+" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        patt(n);
    }
}
