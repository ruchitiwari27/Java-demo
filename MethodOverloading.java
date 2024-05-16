class Single{
    //static int  add (int a,int b)
    public int  add (int a,int b)
    { 
        int d=a+b;
        System.out.println("sum of numbers:" +d);
        return d;
    }
    //static int  add (int a,int b,int c)
    public int  add (int a,int b,int c)
    {
         int e=a+b+c;
         System.out.println("sum of numbers:" +e);
        return e;
    }
}
public class MethodOverloading {
    public static void main(String[]args)
    {
        Single s=new Single();
        s.add(1,2);
        s.add(1,2,3);
       // Single.add(1,2);
        //Single.add(1,2,3);
    }
    
}
