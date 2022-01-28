// 4c implementation of abstract class
abstract class A {
    abstract void set();
    void get() {
        System.out.println("This is a normal method of Abstract class");
    }
}
class B extends A {
    void set() {
        System.out.println("Body provided to Abstract Method of class A");
    }
    void check() {
        System.out.println("This is normal method of derived class B");
    }
}
public class Abstractclass {
    public static void main(String[] args) {
        B b1 = new B();
        b1.get();
        b1.set();
        b1.check();
    }
}
