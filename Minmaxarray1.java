   class Minmaxarray 
    {
        public void minmax()
        {
            int arr1[]={3,5,4,1,9};
            int max = arr1[0];
            for(int i=0; i<arr1.length; i++)
            {
              if(max > arr1[i])
              {
                 max = arr1[i];
                // System.out.println(max); 
              }
            }
             System.out.println("Minimum number of arr1 is :" +max);
             for (int j=0;j<arr1.length;j++)
            {
               if(max < arr1[j])
              {
                 max = arr1[j];
                // System.out.println(max);
              }
            }
           System.out.println("Miximum number of arr1 is :" +max); 
         }
      
         public void minmax1()
         {
            int arr2[] = {22,14,8,17,35,3};
            int max1 = arr2[0];
            for(int i=0; i<arr2.length; i++)
            {
              if(max1 > arr2[i])
              {
                 max1 = arr2[i];
                // System.out.println(max1); 
              }
            }
            System.out.println("Minimum number of arr2 is :" +max1);

            for (int j=0;j<arr2.length;j++){
               if(max1 < arr2[j])
              {
                 max1 = arr2[j];
                 //System.out.println(max1);
              }

            }
           System.out.println("Miximum number of arr2 is :" +max1);
             }
           }
         
        
            public class Minmaxarray1 
         {
            public static void main(String[]args)
            {
                Minmaxarray m1=new Minmaxarray();
                m1.minmax();
                Minmaxarray m2 = new Minmaxarray();
                m2.minmax1();
            }
        }
        
