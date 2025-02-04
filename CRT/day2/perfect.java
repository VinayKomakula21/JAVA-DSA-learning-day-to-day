import java.util.Scanner;

public class perfect {
    static boolean perf(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(perf(n))
        {
            System.out.print("it is perfect num");
        }
        else{
            System.out.print("it is not perfect");
        }
        sc.close();
    }
}
