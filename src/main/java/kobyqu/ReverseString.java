package kobyqu;

public class ReverseString {

    private String string;

    public ReverseString(String string) {
        this.string = string;
    }

    // method to reverse a given string
    public String getReverseString() {

        if (string == null) {
            return null;
        } else {

            // set up local vars
            int len = string.length();
            char[] tempArray = new char[len];
            char[] reversedArray = new char[len];

            // store string parameter in tempArray as array of chars
            for (int i = 0; i < len; i++) {
                tempArray[i] = string.charAt(i);
            }

            // reverse tempString and store in reversedArray
            for (int j = 0; j < len; j++) {
                reversedArray[j] = tempArray[len - 1 - j];
            }

            // create and return new string from reversedArray
            return new String(reversedArray);
        }
    }
}
