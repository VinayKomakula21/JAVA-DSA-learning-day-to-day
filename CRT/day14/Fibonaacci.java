
import java.util.Scanner;

public class Fibonaacci {
    static int getFibo(int n){
        if(n == 0 || n == 1)
            return n;
        return getFibo(n-1)+getFibo(n-2);
    }

    static int getFiboDP_td(int n,int[] buffer){
        //top down approach 
        if(n == 0 || n == 1)
            return n;
        if(buffer[n] != 0)
            return buffer[n];
        buffer[n] = getFiboDP_td(n-1,buffer)+getFiboDP_td(n-2,buffer);
        return buffer[n];
    }

    static int getFiboDP_BU(int n){
        int[] buffer = new int[n+1];

        buffer[0] = 0;
        buffer[1] = 1;

        for(int count = 2; count <= n; count++){
            buffer[count] = buffer[count - 1]+buffer[count - 2];
        }
        return buffer[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] buffer = new int[n+1];

        System.out.println(getFiboDP_BU(n));
    }
}