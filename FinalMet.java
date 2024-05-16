public class FinalMet
      { 
        final void ruchi()
        {
            System.out.println("running");
        }   
      class A extends FinalMet{  
         //void ruchi ()// it can't be same ...
         void ru()
         {
            System.out.println(" this will not override the method ");
        } 
        void prachi(){
            System.out.println(" this is  prachi method");
        } 
      }
    
     public static void main(String[] args)
         {  
     
            FinalMet a= new FinalMet();
         A r =  a.new A();
         r.ruchi();
         r.ru(); 
         r.prachi();
         } 
        }
     
    
      
