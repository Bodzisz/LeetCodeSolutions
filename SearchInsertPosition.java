public class SearchInsertPosition {

    public static int strStr(String haystack, String needle) {
        if(needle.equals("")) {
            return 0;
        }
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                if(haystack.startsWith(needle, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }
}
