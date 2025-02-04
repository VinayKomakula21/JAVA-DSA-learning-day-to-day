
import java.util.Scanner;

public class set {
    static void kset(int n,int k){
        //set the kth bit
        int mask=(1<<k);
        int num=(n|mask);
        System.out.println(num);
    }
    static  void clearset(int n,int k){
        //clear set
        int mask=(1<<k);
        int num=n& ~(mask);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int mask=1<<k;
        if((n&mask)==0){
            System.out.println("unset");
        }
        else{
            System.out.println("set");
        }
        kset(10,4);
        clearset(10,1);
        System.out.println(15&14);
    }
}
