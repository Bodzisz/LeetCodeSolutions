public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String numberString = String.valueOf(x);
        int length = numberString.length();
        for(int i = 0; i < length; i++) {
            if(numberString.charAt(i) != numberString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
