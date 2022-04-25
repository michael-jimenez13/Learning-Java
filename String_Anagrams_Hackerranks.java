import java.util.Scanner;
java.util.HashMap<Character, Integer> hm = new java.util.HashMap<>();


public class Solution {


    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        //checking for empty space
        if( a==null || b ==null || a.equals("") || b.equals("")){
            throw new  IllegalArgumentException();
        }
        
        //checking for non anagrams
        if(a.length() != b.length()){
            return false;
        }
        
        //lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        //populate a map with letters and frequencies of String b
        Map<Character, Integer> map = new HashMap<>();
        
        for(int k = 0; k < b.length(); k++){
            char letter = b.charAt(k);
             
             if(!map.constainsKey(letter)){
                 map.put(letter,1);
             }
             else{
                 Integer frequency = map.get(letter);
                 map.put(letter, ++frequency);
             }
        }
        
        //test each letter in string a against date in map
        for (int k =0;  k<a.length(); k++){
            char letter = a.charAt(k);
            
            if(!map.containskey(letter)){
            return false;
            }
            Integer frequency = map.get(letter);
            
            if(frequency ==0){
                return false;
            }
            else{
                map.put(letter, --frequency);
            }
        }
        
        //code got this far
        return true;
    
             
             
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
