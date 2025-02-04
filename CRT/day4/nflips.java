import java.util.Scanner;
public class nflips{
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        n=a^b;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        System.out.println(count);
    }
}
