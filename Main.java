  class Single {
    public void m1 ()
    {
        System.out.println("this is m1 method ");
    }
}

class Two extends Single {
    public void m2()
     { System.out.println("this is m2 method"); }
}
 public class Main{
    public static void main(String[] args)
    {
        Two g = new Two();
        g.m1();
        g.m2();
        
    }}
 
