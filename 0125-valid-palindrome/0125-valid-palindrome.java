class Solution {
    public boolean isPalindrome(String s) {
        // Initialize pointers at the beginning and end of the string
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer forward if it's not an alphanumeric character
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            // Move right pointer backward if it's not an alphanumeric character
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            // If both are alphanumeric, convert to lowercase and compare
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false; // Not a palindrome
                }
                left++;
                right--;
            }
        }
        
        return true; // Valid palindrome
    }
}
