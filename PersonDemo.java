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
public class PersonDemo 
{
    public static void main(String[]args){
        Ruchi  r = new Ruchi();
        r.hear();
         r.speak(); 
}
}
