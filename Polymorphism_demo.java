
 class Polymorphism1{
    public int add(int a,int b)
    { 
        System.out.println("addition");
        return a+b; 
    }
    public int  sub( int a, int b)
    { 
        System.out.println("substraction");
        return a-b;
    }
    public int  multi(int a,int b,int c)
    {
        System.out.println("multiplication");
        return a*b*c;
    }
    public int  divide (int a,int b )
    {
        System.out.println("division");
        return a/b;  
    }
    
}
class MethodOverloading extends Polymorphism1{
   // public int add(int a,int b)
    public int  add (int a,int b,int c){
       // {
        System.out.println("addition in overloading");
        return a+b+c;
       // return a+b;

    }
    public int  multi(int a,int b,int c){
        System.out.println("multiplication in overloading");
        return a*b*c;
    }
}
class MethodOverriding extends Polymorphism1{
    public int  divide (int a,int b )
    {
        int c=5;
        //int d;
        System.out.println("division and multiplication in overriding method ");
        return (a/b)*c;  
    }
    public int add(int a,int b )
    {
        System.out.println("addition in overriding method ");
        return a;
    
    }
}
public class Polymorphism_demo
 {
    public static void main(String[] args) {
        MethodOverloading m1=new MethodOverloading();
        System.out.println (m1.add(1,2,3 ));
        System.out.println (m1.multi(1,2,3));
        MethodOverriding  m2=new MethodOverriding();
       System.out.println(m2.add(2,20));
       System.out.println( m2.divide(2, 5));
    }
    
}
    
