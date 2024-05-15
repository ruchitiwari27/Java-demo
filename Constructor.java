public class Constructor {
    
    Constructor(){
        int a=2;
        int b=3;
        int c=a+b;
        System.out.println("sum of numbers:" +c);
    }
    Constructor( int a,String name){
        int num=a;
        String fname =name;
        System.out.println(num+" " + " "+name);
    }
    Constructor( int a,String name,int age){
        int num=a;
        String fname =name;
        int age1=age;
        System.out.println(num+" " + " "+name+" "+age);
    }
    public static void main(String[]args){
        Constructor a=new Constructor();
        Constructor a1=new Constructor(1,"ruchi");
        Constructor a2=new Constructor(2,"prachi",20);

    }


    
}
