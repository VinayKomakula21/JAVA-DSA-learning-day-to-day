
import java.util.Scanner;

public class spynum {
    
    static boolean spy(int n){
        int d,sum=0,prod=1;
        while(n>0){
            d=n%10;
            sum+=d;
            prod*=d;
            n=n/10;
        }
        if(sum==prod){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(spy(n))
        {
            System.out.print("it is spy num");
        }
        else{
            System.out.print("it is not spy");
        }
        sc.close();
    }
}
