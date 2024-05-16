class Person {
    public void speak(){
        System.out.println("person can speak");
    }
}
class Ruchi extends Person {
    public void  hear(){
        System.out.println("ruchi can hear");

    }
}
class Prachi extends Ruchi {
    public void see(){
        System.out.println("prachi can see");
    }
}
class Multilevel {
    public static void main(String[] args) {
        Prachi p = new Prachi();
        p.see();
        p.hear();
        p.speak();
    }
}