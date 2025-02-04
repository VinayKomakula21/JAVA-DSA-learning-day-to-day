import java.util.Scanner;

public class lines {
    static void h_lines(int n){
        for (int row=0;row<n;row++) {
            for(int col=0;col<n;col++){
                if (row==0||row==n-1) {
                    System.out.print('*'+" ");
                }
            }
            System.out.println("");
        }
    }
    static void v_lines(int n){
        for (int row=0;row<n;row++) {
            for(int col=0;col<n;col++){
                if (col==0||col==n-1) {
                    System.out.print('*'+" ");
                }
                else{
                    System.out.print(' '+" ");
                }
            }
            System.out.println("");
        }
    }
    
    static void backslash(int n){
        for (int row=0;row<n;row++) {
            for(int col=0;col<n;col++){
                if (col==row) {
                    System.out.print('*'+" ");
                }
                else{
                    System.out.print(' '+" ");
                }
            }
            System.out.println("");
        }
    }
    static void forwardslash(int n){
        for (int row=1;row<=n;row++) {
            for(int col=1;col<=n;col++){
                if (col+row==n+1) {
                    System.out.print('*'+" ");
                }
                else{
                    System.out.print(' '+" ");
                }
            }
            System.out.println("");
        }
    }
    static void v_square(int n){
        for (int row=1;row<=n;row++) {
            for(int col=1;col<=n;col++){
                if (row==1||col==1||row==n||col==n) {
                    System.out.print('*'+" ");
                }
                else{
                    System.out.print(' '+" ");
                }
                
            }
            System.out.println("");
        }
    }
    static void cross(int n){
        for (int row=1;row<=n;row++) {
            for(int col=1;col<=n;col++){
                if (row==col||row+col==n+1) {
                    System.out.print('*'+" ");
                }
                else{
                    System.out.print(' '+" ");
                }
                
            }
            System.out.println("");
        }
    }
    static void arrow(int n){
        for (int row=1;row<=n;row++) {
            for(int col=1;col<=n;col++){
                if (row==col||col==1||row==n) {
                    System.out.print('*'+" ");
                }
                else{
                    System.out.print(' '+" ");
                }
                
            }
            System.out.println("");
        }
        for (int row=2;row<=n;row++) {
            for(int col=1;col<=n;col++){
                if (col==1||row+col==n+1) {
                    System.out.print('*'+" ");
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

        arrow(n);
    }
}
