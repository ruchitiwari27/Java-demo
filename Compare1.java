import java.util.Arrays;
public class Compare1 {
    public static void main(String[] args) {
        String [] s1={"ruchi","anurag","pratibha","umang","bhanu","rahul"};
        String [] s2={"ruchi","anurag","prachi","umang","bhanu","rahul"};
        System.out.println( Arrays.compare(s1,s2));
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++)
       {
        System.out.println(s1[i]);
       }
        for(int i=0;i<s2.length;i++)
        {
            System.out.println(s2[i]);
        }
    }   
}
