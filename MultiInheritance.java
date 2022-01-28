// 5c multiple level inheritance
class X {
    public void get() {
        System.out.println("This is a get method of class X");
    }
    public void demo() {
        System.out.println("This is a demo method of class X");
    }
}
interface Y {
    public void set();
    public void check();
}
class Z extends X implements Y {
    public void put() {
        System.out.println("This is a put method of class Z");
    }
    public void set() {
        System.out.println("This is a overridden set method of interface Y");
    }
    public void check() {
        System.out.println("This is a overridden check method of inetface Y");
    }
}
public class MultiInheritance {
    public static void main(String[] args) {
        System.out.println("Main starts");
        Z z = new Z();
        z.get();
        z.demo();
        z.put();
        z.set();
        z.check();
        System.out.println("Main ends");
    }
}
