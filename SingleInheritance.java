// 5A implementation of single level inheritance
class Base {
    public void set() {
        System.out.println("This is a set method of Base class");
    }
    public void get() {
        System.out.println("This is a get method of Base class");
    }
}
class Derived extends Base {
    public void check() {
        System.out.println("This is a check method of Base class");
    }
    public void demo() {
        System.out.println("This is a demo method of Base class");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("Main starts");
        Derived d = new Derived();
        d.set();
        d.get();
        d.check();
        d.demo();
        System.out.println("Main ends");
    }
}
