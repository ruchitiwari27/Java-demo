public class FindDuplicate {
    public static void main(String[] args) 
    {
        int[] a = {2,3,4,4,35,67,65,1,1,9,3};

        for (int i = 0; i < a.length; i++)
         {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] == a[j]) 
                {
                    System.out.println("Duplicate element found: " + a[i]);
                   //break;
                 } // Remove this break if you want to find all duplicates
                   if (i == j){
            System.out.print( a[i] + " ");
        }
                }
            }
        }
    }
 
    
