import java.util.Scanner;

public class ZigZag {
    static String zigZagConversion(int numRows,String str){
        String con[] = new String[numRows];
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int numRows = sc.nextInt();

        System.out.println(zigZagConversion(numRows, str));
    }
}
