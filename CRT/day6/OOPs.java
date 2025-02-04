public class OOPs{
    public static void main(String[] args) {
        Pen p1=new Pen();
        Pen p2=new Pen("cello");
        Pen p3=new Pen("reynolds",10);

        Device d=new Device();
        d.change();
        d.askForwarranty();
    }
}

class Device extends Warranty{
    void change(){
        Pen p4=new Pen("flair");
        System.out.println(p4.getBrand());
        p4.setBrand("pentonic");
        System.out.println(p4.getBrand());
    }
    void askForwarranty(){
        System.out.println("1 year warranty");
    }
}
abstract class Warranty{
    abstract void askForwarranty();
}

class Pen{
    private int price;
    private String brand;

    Pen() {
        System.out.println("constructor1: object is created;");
    }
    Pen(String brand) {
        System.out.println("constructor2: object is created;");
        this.brand=brand;
    }
    Pen(String brand,int price) {
        System.out.println("constructor3: object is created;");
        this.brand=brand;
        this.price=price;
    }
    String getBrand(){
        return this.brand;
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    void charge(){
        System.out.println("charging");
    }
    void changetool(){
        System.out.println("change to last used tool");
    }
}