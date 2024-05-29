import java.util.Arrays;
public class Copyofarray {
    
    public static void main(String[] args) {
        int []a={1,2,3,4};
        System.out.println("An array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
        int[] copy=Arrays.copyOf(a,6);
        copy[4]=5;
        copy[5]=6;
        System.out.println("new copied array");
        for(int i=0;i<copy.length;i++){

            System.out.println(copy[i]);
        }
    }
}
