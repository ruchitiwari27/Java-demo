public  class MetConst1{
    public static void myStaticMethod()
    {
        System.out.println("  this is static method");
    }
     public MetConst1(int a,int b)
     {
        System.out.println(" this is constructor");
    }
     public void prachi()
     {
        System.out.println("this is the method");
    }
//public class MetConst1{
public static void main(String[]args)
{
    MetConst1.myStaticMethod();
    MetConst1 r=new MetConst1(1,2);
    r.prachi();
}
}
