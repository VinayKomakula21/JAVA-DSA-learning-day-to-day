
import java.util.Scanner;

public class Day_2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the interior and exterior walls");
        int tamt=0,iamt,eamt;
        int measurement;
        int n_intr = sc.nextInt();
        int n_extr = sc.nextInt();
        if(n_intr>0){
            for(int i=1;i<n_intr;i++){
                measurement=sc.nextInt();
                iamt=measurement*18;
                tamt=tamt+iamt;
            }
        }
        if(n_extr>0){
            for(int i=1;i<n_extr;i++){
                measurement=sc.nextInt();
                eamt=measurement*16;
                tamt=tamt+eamt;
            }
        }
        System.out.println("total amount"+tamt);
    }
}
