import java.util.Arrays;
public class Fill {
    public static void main(String[] args) {
        String [] a={"Banana", "Orange", "Apple", "Mango"};
        Arrays.fill( a,"ruchi");//it changes all the array value to a specific string value "ruchi"
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
      