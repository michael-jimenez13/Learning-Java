//import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
      //sort a
      //sort b
      
      //if sorting equals ane another then blah
      
      Boolean retValue = false;
      if(a!=null && b!=null){
         char [] arrayA = a.toLowerCase().toCharArray();
         char [] arrayB = b.toLowerCase().toCharArray();
           
      
      Arrays.sort(arrayA);
      Arrays.sort(arrayB);
      retValue = Arrays.equals(arrayA, arrayB);
      
      }
      return retValue;
      
      
      
      
      
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
