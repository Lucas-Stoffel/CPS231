package Week11;

public class Overriding {

    public static void main(String[] args) {
        
        A a = new A();
        a.p(10.0);
        a.p(10);
    }
}

class B {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A extends B {
    // This method overrides the method in B
    public void p(double i) {
        System.out.println(i);
    }
}
