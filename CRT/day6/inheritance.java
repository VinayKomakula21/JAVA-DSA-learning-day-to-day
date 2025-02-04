public class inheritance {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();

        b.show();
        b.display();
    }
}

class A{
    int x=10;
    void display(){
        System.out.println("displayed in a");
    }
}
class B extends A{
    int x=100,y=20;
    void show(){
        System.out.println(super.x);
    }
    @Override
    void display(){
        System.out.println("displayed in b");
    }
}
class C extends B{
    int z=30;
}