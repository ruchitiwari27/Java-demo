public class Duplicate {
    public static void main(String[] args) {
        int a[]={1,2,3,1};
        for (int i = 0; i <a.length; i++)
       {
           for ( int j = 0; j < i; j++)
           {
           if (a[i] == a[j])//check duplicates
               System.out.println("Duplicate element found: " + a[i]); 
             // System.out.println("true");
        }
       //System.out.println("true");
       }
       System.out.println("true");
    }
    
}
