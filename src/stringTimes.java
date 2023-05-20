//Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
//
//stringTimes("Hi", 2) → "HiHi"
//stringTimes("Hi", 3) → "HiHiHi"
//stringTimes("Hi", 1) → "Hi
public class stringTimes {
    public String stringTimes(String str, int n) {
        // An empty string to store the result
        String result = "";

        // Repeat the concatenation of the original string n times
        for (int i = 0; i < n; i++) {
            result += str; // Concatenate the original string to the result
        }

        // Return final result
        return result;
    }
}
