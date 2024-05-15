class A {
    public void m1() {
        System.out.println("method m1");
    }
}

// Child class B inherits from class A
class B extends A {

    public void m2() {
        System.out.println("method m2");
    }
}

// Child class C inherits from class B
class C extends B {

    public void m3() {
        System.out.println("method m3");
    }
}

public class Main1 {
    public static void main(String[] args) {
        C r = new C();
        r.m1();
        r.m2();
        r.m3();
    }
}


