import java.util.*;
public class Arraylist3 {
    public static void main(String[] args) {
        Deque <String> r=new ArrayDeque<String>();
        r.add("ruchi");
        r.add("pratibha");
        r.add("anurag");
        r.add("bhanu");
        for (String s:r)
        System.out.println(s);
        r.remove("bhanu");
        System.out.println(r);
    }

    
}
