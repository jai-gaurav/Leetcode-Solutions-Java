import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Test {
    public static void main(String args[]) {

        String s = "anagrama";
        String t = "nagamaaa";

        if (s.length() != t.length()) {System.out.println("False");}

        HashMap<Character, Integer> charMap = new HashMap<>();
        HashSet<Character> charSet = new HashSet<>();

        for (int i=0; i<s.length(); i++) { 
            if (charMap.containsKey(s.charAt(i))) {
                charMap.put(s.charAt(i), charMap.get(s.charAt(i))+1);
            } else {
                charMap.put(s.charAt(i), 1);
            }
            
            if (charMap.containsKey(t.charAt(i))) {
                charMap.put(t.charAt(i), charMap.get(t.charAt(i))-1);
            } else {
                charMap.put(t.charAt(i), -1);
            }

            charSet.add(s.charAt(i));
            charSet.add(t.charAt(i));
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}