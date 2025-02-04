
import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String[] values = input.trim().split("\\s+");

        System.out.println("Entered values:");

        int[] arr=new int[10];
        int i=0;
        for(String value:values){
            System.out.println(value+" ");
            arr[i]=Integer.parseInt(value);
            i++;
        }
        int c=0;
        for(int v:arr){
            System.out.println(v);
            
        }
    }
}
