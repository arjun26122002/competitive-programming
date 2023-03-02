class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the input array in ascending order
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // Sum the elements in even indices (pairs with smallest numbers)
        }
        return sum;
    }
}