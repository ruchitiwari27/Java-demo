class Person
{
    public void speak(){
        System.out.println("person can speak");
    }
}
    class Ruchi extends Person{
        public void hear(){
            System.out.println("ruchi can hear");
        }
    }
    class Prachi extends Person{
        public void see(){
            System.out.println("prachi can see");
        }
    }
public class Hierarchical{
    public static void main(String[]args){
        Prachi  r = new Prachi();
         //r.hear();
         r.speak();
         r.see();
         Ruchi h =new Ruchi();
         h.hear();
         h.speak();
}
}
