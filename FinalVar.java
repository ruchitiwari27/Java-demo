public class FinalVar {  
        final int a=90;//final variable  
        void ruchi()
        {  
         a=400;//we cant re-assign the value of final  var a 
         System.out.println(a);  
        }  
        public static void main(String args[]){  
            FinalVar obj=new  FinalVar();  
        obj.ruchi();  
        }  
       
}

