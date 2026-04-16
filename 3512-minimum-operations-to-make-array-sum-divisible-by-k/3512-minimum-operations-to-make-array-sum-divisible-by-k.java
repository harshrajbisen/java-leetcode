class Solution {
    public int minOperations(int[] nums, int k) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        // The remainder is the number of -1 operations needed
        return (int) (sum % k);
    }
}