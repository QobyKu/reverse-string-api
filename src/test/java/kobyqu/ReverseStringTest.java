package kobyqu;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void stringReversed() {
        // the empty string
        String emptyString = "";
        ReverseString rString = new ReverseString();
        assertThat(rString.getReverseString(emptyString), equalTo(""));
    }

    @Test
    public void stringReversed1() {
        // random string
        String randomString = "god";
        ReverseString rString = new ReverseString();
        assertThat(rString.getReverseString(randomString), equalTo("dog"));
    }

    @Test
    public void stringReversed2() {
        // same lettered string
        String sameLetteredString = "aaa";
        ReverseString rString = new ReverseString();
        assertThat(rString.getReverseString(sameLetteredString), equalTo("aaa"));
    }

    @Test
    public void stringReversed3() {
        // number as string
        String numberAsString = "123";
        ReverseString rString = new ReverseString();
        assertThat(rString.getReverseString(numberAsString), equalTo("321"));
    }

    @Test
    public void stringReversed4() {
        // palindrome
        String palindrome = "pop";
        ReverseString rString = new ReverseString();
        assertThat(rString.getReverseString(palindrome), equalTo("pop"));
    }

    @Test
    public void stringReversed5() {
        // long string
        String longString = "abcdefghijklmnopqrstuvwxyz";
        ReverseString rString = new ReverseString();
        assertThat(rString.getReverseString(longString), equalTo("zyxwvutsrqponmlkjihgfedcba"));
    }

    @Test
    public void stringReversed6() {
        // null
        String nullString = null;
        ReverseString rString = new ReverseString();
        assertThat(rString.getReverseString(nullString), equalTo(null));
    }

}
