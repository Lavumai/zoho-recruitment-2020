import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Enter the string");
        Scanner a = new Scanner(System.in);
        String inp = a.nextLine();
        System.out.println("Given string is "+ inp);
        int l = inp.length();
        System.out.println(l);
        int m = inp.length()/2;
        System.out.println(m);
        System.out.println(inp.substring(0, m));
        System.out.println(inp.substring(m));
        char midchar = inp.charAt(m);
        System.out.println(midchar);
        char o = inp.charAt(m+1);
        //String de = midchar + o;
        System.out.println( midchar + o);
    
        
     }
}