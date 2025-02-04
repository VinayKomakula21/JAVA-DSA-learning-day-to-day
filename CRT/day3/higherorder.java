interface Operation{
    int operate(int a,int b);
}
public class higherorder {
    public static int perform(int a,int b,Operation op){
        return op.operate(a, b);
    }
    public static void main(String[] args) {
        int result = perform(5,3,(x,y)->x+y);
        System.out.println("5+3="+result);
        result=perform(5,3,(x,y)->x*y);
        System.out.println("5*3="+result);
    }
}
