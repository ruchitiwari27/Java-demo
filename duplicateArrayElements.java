 public class duplicateArrayElements
{
   //int a[]={2,3,4,4,35,67,65,1,1,9,3};
   
  // static void Duplicates()
   static void Duplicates(int a[])
   {
      for (int i = 0; i <a.length; i++)
      //{
        //System.out.println(a[i]);
      //}
       {
         int j;
           for (j = 0; j < i; j++)
           if (a[i] == a[j])//check duplicates
               break;
           if (i == j)// no duplicstes then print ...
           System.out.print( a[i] + " ");
       }

   }
   public static void main (String[] args) 
   {
       int a[]={2,3,4,4,35,67,65,1,1,9,3};
       duplicateArrayElements.Duplicates(a);
     // Duplicates();
   }
}

