interface operation{
    int operate(int a,int b);
}
public class highorder1 {
    public static void main(String[] args) {
        operation addition = getoperator('+');
        int result = addition.operate(5,3);
        System.out.println("5+3="+result);

        operation mult = getoperator('*');
        result = mult.operate(5,3);
        System.out.println("5+3="+result);
    }
    public static operation getoperator(char op){
        switch(op) {
            case '+':
                return (a,b)->a+b;
            case '-':
                return (a,b)->a-b;
            case '*':
                return (a,b)->a*b;
            case '/':
                return (a,b)->a/b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
