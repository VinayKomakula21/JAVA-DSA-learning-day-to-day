public class gen {
    public static void main(String[] args) {
        Calsi<String> cal=new Calsi();
        cal.addition(10);
        cal.addition(10.99);
        cal.addition("hello");
        
        Calsi<Integer> cc=new Calsi();
    }
}

class Calsi<R>{
    R a;
    <TMP>void addition(TMP data){
        System.out.println(data.getClass());
        System.out.println(data);
    }
}