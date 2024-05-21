public class Duplicate3 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println("Duplicates aren't available:");
        for (int i=0;i<a.length;i++)
           { 
          for (int j=0;j<i;j++)
             if(a[i]==a[j])
                   // System.out.println("duplicates aren't available" +a[i]);    
               System.out.println("a[j]");
           }
              System.out.println("false");
                }
}
