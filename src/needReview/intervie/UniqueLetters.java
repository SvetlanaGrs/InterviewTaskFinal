package needReview.intervie;

public class UniqueLetters {
    public static void main(String[] args) {
        String input = "programming";  // Sample input string
        String result = uniqueChars(input);  // Get the unique characters from input

        // Print the unique characters
        System.out.println("Unique characters: " + result);  // Output: "progamin"
    }
    public static String uniqueChars(String str) {
        String unique = "";

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // If the character is not already in the 'unique' string
            if (!unique.contains("" + str.charAt(i))) {
                unique += str.charAt(i);  // Add the character to 'unique'
            }
        }
        // Return the string with only unique characters
        return unique;
    }
}
