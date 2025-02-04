import java.util.Scanner;
import java.util.Stack;

public class RedundantParenthesis {
    static boolean isOperator(char ch){
        return "+-*/".contains(ch+"");
    }
    static String isRedundant(String exp){
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch != ')')
                stk.push(ch);
            else{
                boolean oper_found = false;
                while(!stk.isEmpty() && stk.peek() != '('){
                    if(isOperator(stk.pop())){
                        oper_found = true;
                    }
                }
                if(!oper_found)
                    return "yes";
                stk.pop();
            }
        }
        return "no";        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();

        System.out.println(isRedundant(exp));
    }
}
