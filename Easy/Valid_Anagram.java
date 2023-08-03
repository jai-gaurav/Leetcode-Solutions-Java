class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {return false;}

        int[] charMap = new int[26];

        for (int i=0; i<s.length(); i++) {
            charMap[s.charAt(i) - 'a']++;
            charMap[t.charAt(i) - 'a']--;
        }

        for (int count : charMap) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {return;}   
}