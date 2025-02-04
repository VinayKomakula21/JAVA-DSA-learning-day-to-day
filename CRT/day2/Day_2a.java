
import java.util.Scanner;


public class Day_2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i,x;
        int coll=0;
        int ages[] = new int[20];
        if(n<20){
            for(i=0;i<n;i++){
                x=sc.nextInt();
                ages[i] = x;
            }
            for(int j:ages){
                if(j<=17){
                    coll+=200;
                }
                else if(j>17 && j<40){
                    coll+=400;
                }
                else{
                    coll+=600;
                }
            }
        }
        System.out.println("total day collection:"+(coll-4000));
        sc.close();
    }
}
