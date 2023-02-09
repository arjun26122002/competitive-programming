class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int first = arr[s.charAt(0) - 97];

        for (int i = 1; i < s.length(); i++) {

            if (arr[s.charAt(i) - 'a'] != first) {
                return false;
            }
        }
        return true;
    }
}