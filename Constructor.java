//4 b 
public class Constructor {
    public Constructor() {
        System.out.println("Constructor executes ");
    }
    public void finalize() {
        System.out.println("Finalizer executes ");
    }
    public void set() {
        System.out.println("This is a set method ");
    }
    public static void main(String[] args) {
        System.out.println("Main Starts");
        Constructor f1 = new Constructor();
        f1.set();
        System.out.println("Main ends ");
    }
}
