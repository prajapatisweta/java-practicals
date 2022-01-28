// 5b
class Base {
    public void method() {
        System.out.println("This is a method of Base class");
    }
}
class Derived extends Base {
    public void method() {
        System.out.println("This is a overriden method of Derived class");
    }
}
public class Overriding {
    public static void main(String[] args) {
        System.out.println("Main starts");
        Derived d = new Derived();
        d.method();
        System.out.println("Main ends");
    }
}
