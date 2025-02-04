import java.util.Scanner;

public class phon {
    static long getNumber(String Number) {
        return switch (Number) {
            case "one" -> 1;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            default -> 0;
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Phone Number: ");

        String Number;
        long n = 0, m = 1;

        for(int i = 1 ; i <= 10 ; i++) {
            Number = sc.next();
            if(Number.equalsIgnoreCase("double")){
                m = 2;
            }
            else if(Number.equalsIgnoreCase("triple")){
                m = 3;
            }
            else {
                for(int j = 1 ; j <= m ; j++){
                    n = n*10 + getNumber(Number);
                }
                m = 1;
            }
        }

        System.out.println("Your Phone Number is: " +n);
    }
}

