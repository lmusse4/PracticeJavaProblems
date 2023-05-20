//Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
//
//
//        frontTimes("Chocolate", 2) → "ChoCho"
//        frontTimes("Chocolate", 3) → "ChoChoCho"
//        frontTimes("Abc", 3) → "AbcAbcAbc"
public class frontTimes {
        public String frontTimes(String str, int n) {
            // Ternary operator to get the front substring of the string
            String front = str.length() < 3 ? str : str.substring(0, 3);

            // Create an empty string to store the result
            String result = "";

            // Repeat the front substring n times
            for (int i = 0; i < n; i++) {
                result += front; // Concatenate the front substring to the result
            }

            // Return the final result
            return result;
        }
}
