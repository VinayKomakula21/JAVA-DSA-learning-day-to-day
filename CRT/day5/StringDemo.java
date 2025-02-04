
import java.util.Scanner;

public class StringDemo {
    static String encodeMessage(String message) {
        String answer = "";
        for(int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);
            if(ch >= 65 && ch <= 90) {
                int position = ch - 64;
                int enc_position = 91 - position;
                answer = answer + (char)enc_position;

            } else {
                answer += ch;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner snr = new Scanner(System.in);
        String str = snr.nextLine().toUpperCase();

        System.out.println(encodeMessage(str));
    }
}