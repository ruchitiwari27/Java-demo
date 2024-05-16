
class A 
{
    public void m1()
     {
         System.out.println("Class A");
     }
}

class B extends A 
{
    public void m2()
     {
         System.out.println("Class B");
     }
}

class C extends A 
{
    public void m3() 
    {
         System.out.println("Class C"); 
    }
}

class D extends A 
{
    public void m4() 
    { 
        System.out.println("Class D"); 
    }
}
public class Main2
 { 
     public static void main(String[] args)
    {
        B b = new B();
        b.m1();
        b.m2();

        C c = new C();
        c.m1();
        c.m3();

        D d = new D();
        d.m1();
        d.m4();
    }
}