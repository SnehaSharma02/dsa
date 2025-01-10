class Solution {
    public String mergeAlternately(String word1, String word2) {
       
        int len1 = word1.length();
        int len2 = word2.length();
        
        // Initialize StringBuilder with an estimated size for efficiency
        StringBuilder result = new StringBuilder(len1 + len2);

        int i = 0, j = 0;

        // Merge characters alternately from both strings
        while (i < len1 && j < len2) {
            result.append(word1.charAt(i++)); // Add character from word1
            result.append(word2.charAt(j++)); // Add character from word2
        }

        // Append any remaining characters from word1
        if (i < len1) {
            result.append(word1, i, len1);
        }

        // Append any remaining characters from word2
        if (j < len2) {
            result.append(word2, j, len2);
        }

        // Convert the result to a String and return
        return result.toString();
    }
}
