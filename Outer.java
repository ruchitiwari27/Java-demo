public class Outer {
    public void women(){
        System.err.println("this method is for women");
    }
    class Inner extends Outer{
        public void girl(){
            System.out.println("this method is for girls");
        }
    }
    public static void main(String[] args) 
    {
     Outer s=new Outer();
     Inner r= s.new Inner();
     r.girl();
     r.women();

    }

    }
    
