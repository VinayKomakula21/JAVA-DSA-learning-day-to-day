
import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction{
    String run(String str);
}
public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<Integer>();
        nums.add(5);
        nums.add(9);
        nums.add(8);
        nums.add(1);
        nums.forEach((n)->{System.out.println(n);});
        Consumer<Integer> method = (n)->{System.out.println(n);};
        nums.forEach(method);


        StringFunction exclaim =(s)->s+"!";
        StringFunction ask =(s)->s+"?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
        
    }
    public static void printFormatted(String str,StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }
}
