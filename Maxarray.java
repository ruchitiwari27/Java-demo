public class Maxarray
    {
         public static void main(String args[])
      {
         int arr[] = {3,5,4,1,9};
         int max = arr[0];
         for(int i=0; i<arr.length; i++)
         {
           if(max < arr[i])
           {
              max = arr[i];
           }
         }
        System.out.print(max); 
      }
    }