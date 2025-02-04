public class exec {
    public static void main(String[] args) {
        disp(2);
    }
    public static void disp(int a){
        if(a>5){
            try {
                throw new NullPointerException();
            } 
            catch (NullPointerException e) {
                System.out.println(e);
            }
        }
        else{
            System.out.println("passed number is"+a);
        }
    }
}