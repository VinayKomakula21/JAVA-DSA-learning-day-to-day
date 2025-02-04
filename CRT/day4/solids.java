import java.util.Scanner;
public class solids {
    static void square(int n){
        for (int row=0;row<n;row++) {
            for(int col=0;col<n;col++){
                System.out.print('*'+" ");
            }
            System.out.println("");
        }
    }

    static void incr(int n){
        for (int row=0;row<n;row++) {
            for(int col=0;col<=row;col++){
                System.out.print('*'+" ");
            }
            System.out.println("");
        }
    }
    static void decr(int n){
        for (int row=0;row<n;row++) {
            for(int col=n;col>row;col--){
                System.out.print('*'+" ");
            }
            System.out.println("");
        }
    }
    static void trian(int n){
        for (int row=0;row<n;row++) {
            for(int col=n-1;col>row;col--){
                System.out.print("  ");
            }
            for(int col=0;col<=row;col++){
                System.out.print('*'+" ");
            }
            for(int col=0;col<row;col++){
                System.out.print('*'+" ");
            }
            System.out.println("");
        }
    }
    static void hill(int n){
        for (int row=0;row<n;row++) {
            
            for(int col=0;col<=row;col++){
                System.out.print('*'+" ");
            }
            for(int col=n-1;col>row;col--){
                System.out.print("  ");
            }
            for(int col=0;col<=row;col++){
                System.out.print('*'+" ");
            }
            System.out.println("");
        }
    }
    static void valley(int n){
        for (int row=0;row<n;row++) {
            
            for(int col=0;col<=row;col++){
                System.out.print('*'+" ");
            }
            for(int col=n-1;col>row;col--){
                System.out.print("  ");
            }
            for(int col=n-1;col>row;col--){
                System.out.print("  ");
            }
            for(int col=0;col<=row;col++){
                System.out.print('*'+" ");
            }
            System.out.println("");
        }
    }
    static void rev(int n){
        for (int row=1;row<n;row++) {
            
            for(int col=0;col<row;col++){
                System.out.print(' '+" ");
            }
            for(int col=n-1;col>=row;col--){
                System.out.print("*"+" ");
            }
            for(int col=n-1;col>row;col--){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
    static void diamond(int n){
        trian(n);
        rev(n);
    }
    static void patt(int n){
        for (int row=0;row<n;row++) {
            for(int col=0;col<=row;col++){
                System.out.print('*'+" ");
            }
            System.out.println("");
        }
        for (int row=0;row<n;row++) {
            for(int col=0;col<row;col++){
                System.out.print(' '+" ");
            }
            for(int col=n;col>row;col--){
                System.out.print(' '+" ");
            }
            for(int col=0;col<row;col++){
                System.out.print(' '+" ");
            }
            for(int col=n;col>row;col--){
                System.out.print('*'+" ");
            }
            System.out.println("");
        }
        
    }
    static void dhill(int n){
        for (int row=0;row<n;row++) {
            
            for(int col=n-1;col>row;col--){
                System.out.print("* ");
            }
            for(int col=0;col<=row;col++){
                System.out.print(' '+" ");
            }
            for(int col=n-1;col>row;col--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void forward(int n){
        hill(n);
        dhill(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        diamond(n);
        
        
    }
}
