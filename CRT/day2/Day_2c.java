
import java.util.Scanner;

public class Day_2c {
    public static void main(String[] args) {
        int n;
        int amt=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int weights[]=new int[n];
        int t=15;
        int i=1;
        while(i<=n){
            weights[i]=sc.nextInt();
            i++;
        }
        for(int x:weights){
            if(x<=15){
                amt+=1;
            }
            else{
                amt+=2;
            }
        }
    }
}