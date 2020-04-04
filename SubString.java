
package java_and_strings;


public class SubString {
     public static void main(String[] args) {
        
         String s1="Hello world";
         System.out.println(s1.substring(4));//from 4(including 4)-->
         System.out.println(s1.substring(2, 5));//from 2(including 2) to 5(excluding 5)
         System.out.println(s1.substring(1, 11));
         System.out.println(s1.substring(10));
         
     }
    
}
