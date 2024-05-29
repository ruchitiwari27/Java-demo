public class Stringmethods {
    public static void main(String[] args) {
        String a="     hello ruchi";
        String a2="hello ruchiii";
        System.out.println(a);
     // char result= a.charAt(0);
        System.out.println(a.charAt(1));
        System.out.println(a.contains("Hel"));
    System.out.println(a.contains("e"));
    //System.out.println(a.indexOf("hello"));
    System.out.println(a.indexOf("ruchi"));
    System.out.println(a.compareTo(a2));//if strings are equal then give 0 
    System.out.println(a.replace('l', 'p'));
    System.out.println(a.concat(a2));
    System.out.println(a.contentEquals("Hello"));//content is not equal it will give false
    System.out.println(a.startsWith("Hello"));   // true  
    System.out.println(a.endsWith("llo"));
    System.out.println(a.endsWith("chi"));
    System.out.println(a.equals(a2)); 
    System.out.println(String.join(a,a2));
    System.out.println(a.length());
    System.out.println(a.subSequence(7, 11));
    System.out.println(a.toUpperCase());
    System.out.println(a.toLowerCase());
    System.out.println(a.toString());
    System.out.println(a.trim());
  }

    //System.out.println(a.split(.s));
    }
    

