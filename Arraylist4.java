import java.util.*;
public class Arraylist4 {
    public static void main(String[] args) {
        
        List <Integer> s=new ArrayList<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        int element = s.get(0);
        s.set(2,2);
        System.out.println(s.size());
        System.out.println(s);
        System.err.println(element);
        s.clear();
        System.out.println(s);
    }
    
}