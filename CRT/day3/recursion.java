public class recursion{
    static int calc(int v){
        if(v==1||v==0){
            return 1;
        }
        if(v%2==0){
            return calc(v/2)+2;
        }
        else{
            return calc(v-2)+3;
        }
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(calc(n));
    }
}
