class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();

        // Split words by spaces
        String[] words = s.split("\\s+");

        // Reverse the order of words using StringBuilder
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) { // Add space between words
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        // Create an object of Solution
        Solution solution = new Solution();

        // Call the reverseWords method
        System.out.println(solution.reverseWords("the sky is blue")); // Output: "blue is sky the"
        System.out.println(solution.reverseWords("  hello world  ")); // Output: "world hello"
        System.out.println(solution.reverseWords("a good   example")); // Output: "example good a"
    }
}
