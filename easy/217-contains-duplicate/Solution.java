import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        for(int num: nums) {
            // If the addition fails, the number is already in the set (duplicate found)
            if (!numbers.add(num)) {
                return true;
            };
        }
        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        boolean result = solution.containsDuplicate(nums);
        System.out.println(result); 
    }
    
}