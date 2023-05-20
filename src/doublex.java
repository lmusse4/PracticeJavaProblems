public class doublex {
        public boolean doubleX(String str) {
            // Use the indexOf() method to find the first "x" in the string.
            int index = str.indexOf('x');

            // Check if 'x' is not found or if it's at the end of the string
            if (index == -1 || index == str.length() - 1) {
                // Return false if 'x' is not found or if it's at the end
                return false;
            }

            // Check if the character immediately following 'x' is 'x'
            return str.charAt(index + 1) == 'x';
        }

}
