import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int length = s.length();

        int lastStart = 0;
        int lastEnd = 0;
        int start = 0;
        int end = 1;

        int longest = 0;

        while(lastEnd != length) {
            if(lastStart != start) {
                chars.remove(s.charAt(lastStart));
                lastStart++;
            }
            if(lastEnd != end) {
                chars.add(s.charAt(lastEnd));
                lastEnd++;
            }

            int charsSize = chars.size();
            if(charsSize > longest) {
                longest = charsSize;
            }

            if(lastEnd != length && chars.contains(s.charAt(lastEnd))) {
                start++;
            } else {
                end++;
            }
        }

        return longest;
    }
}
