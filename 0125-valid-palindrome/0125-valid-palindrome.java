class Solution {
  
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
           
            while (left < right && !isAlphaNumeric(s.charAt(left))) {
                left++;
            }

           
            while (left < right && !isAlphaNumeric(s.charAt(right))) {
                right--;
            }

            char c1 = toLower(s.charAt(left));
            char c2 = toLower(s.charAt(right));

            if (c1 != c2) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

  
    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9');
    }

    
    private char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32); 
        }
        return c;
    }
}

    
