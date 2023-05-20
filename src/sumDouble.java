//Given two int values, return their sum. Unless the two values are the same, then return double their sum.


//        sumDouble(1, 2) → 3
//        sumDouble(3, 2) → 5
//        sumDouble(2, 2) → 8
public class sumDouble {
        public int sumDouble(int a, int b) {
            if (a == b) {
                return 2 * (a + b); // If the values are the same, return double their sum
            } else {
                return a + b; // Otherwise, return the normal sum
            }
        }

}
