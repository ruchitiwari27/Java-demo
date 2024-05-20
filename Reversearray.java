public class Reversearray {
    public static void main(String[] args) {
        int a[]= {1,2,3} ;
        System.out.print("original array is:");
       for (int  i=0; i<a.length;i++)
        {
        System.out.print(a[i]+ " ");
        }
        System.out.println("\n");
        System.out.print("Reversed_array is:");
        for(int i=a.length-1; i>=0; i--)
       // System.out.print("Reversed_array is:");
        {
            System.out.print(a[i]+ " ");
        }
    }
    
}
