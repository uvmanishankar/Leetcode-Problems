class Solution {
    public String reverseVowels(String s) {
        char[] v = s.toCharArray();

        int left = 0;
        int right = v.length - 1;

        while (left < right) {

           
            if (v[left] != 'a' && v[left] != 'e' && v[left] != 'i' &&
                v[left] != 'o' && v[left] != 'u' &&
                v[left] != 'A' && v[left] != 'E' && v[left] != 'I' &&
                v[left] != 'O' && v[left] != 'U') {

                left++;
            }

            
            else if (v[right] != 'a' && v[right] != 'e' && v[right] != 'i' &&
                     v[right] != 'o' && v[right] != 'u' &&
                     v[right] != 'A' && v[right] != 'E' && v[right] != 'I' &&
                     v[right] != 'O' && v[right] != 'U') {

                right--;
            }

            
            else {
                char temp = v[left];
                v[left] = v[right];
                v[right] = temp;

                left++;
                right--;
            }
        }

        return new String(v);
    }
}