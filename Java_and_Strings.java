
package java_and_strings;


public class Java_and_Strings {

   
    public static void main(String[] args) {
        
        String example="Java is fun to learn";
        String s1="JAVA";
        String s2="Java";
        String s3=("  Hello Java  ");
        
        
        System.out.println("Char at index 2(third position): " + example.charAt(2));
        System.out.println("After concat: " + example.concat("-Enjoy"));
        System.out.println("Checking equals ignoring case: " + s1.equalsIgnoreCase(s2));
        System.out.println("Checking equals with case: " + s1.equals(s2));
        System.out.println("Checking length: " + example.length());
        System.out.println("Replace function: " + example.replace("fun","easy"));
        System.out.println("Substring of Java is fun to learn: " + example.substring(3));
        System.out.println("Substring of Java is fun to learn: " + example.substring(3, 7));
        System.out.println("Converting to lower case: " + example.toLowerCase());
        System.out.println("Converting to upper case: " + example.toUpperCase());
        System.out.println("Triming string " + s3.trim());
        System.out.println("Searching s1 in exampple " + example.contains(s1));
        System.out.println("Searching s2 in example " + example.contains(s2));
        
        
        char [] charArray=s2.toCharArray();
        System.out.println("Size of array is " + charArray.length);
        System.out.println("Printing the last element of the array: " + charArray[3] );
                
                
    }
    
}
