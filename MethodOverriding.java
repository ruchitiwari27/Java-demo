class Person {
    public void speak(){
        System.out.println("this is the speak method");
    }
}
class Ruchi extends Person{
    public void speak()
{
    System.out.println("this is the hear method ");
}
}

public class MethodOverriding {
    public static void main(String[] args) {
        
    
    Ruchi r= new Ruchi();
    r.speak();
    }
    
}
