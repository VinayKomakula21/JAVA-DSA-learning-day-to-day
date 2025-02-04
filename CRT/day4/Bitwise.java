
import java.util.Scanner;

public class Bitwise {
    static void bitwiseop(){
        System.out.println(9^15);
        System.out.println(9&15);
        System.out.println(9|15);
        System.out.println(~9);
        System.out.println(~5);
        System.out.println(~-99);
        System.out.println(5 << 1);
        System.out.println(5 >> 1);
    }

    public static void main(String[] args) {
        //bitwiseop();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        //incr by 1 using bitwise
        //n=-(~n);
        //System.out.println(n);

        //check even or odd using bitwise
        int mask=1;
        if((n&mask) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        //same sign or not
        int a=53,b=-44;
        if((a^b)>0){
            System.out.println("same sign");
        }
        else{
            System.out.println("opp sign");
        }
    }
}
