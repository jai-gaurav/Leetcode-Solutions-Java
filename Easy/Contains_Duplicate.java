import java.util.HashSet;

class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            } 
            numSet.add(num);
        }

        return false;
    }

    public static void main(String args[]) {return;}
}