//Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//
//
//        stringBits("Hello") → "Hlo"
//        stringBits("Hi") → "H"
//        stringBits("Heeololeo") → "Hello"
public class stringBits {
    public String stringBits(String str) {
        String result = "";

        // Iterate through each character in the string, incrementing i by 2 each time taking every other character.
        for (int i = 0; i < str.length(); i += 2) {
            // taking each character one by one from the original string and adding it to the result string.
            result = result + str.substring(i, i + 1);
        }

        return result;
    }

}
