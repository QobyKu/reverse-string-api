package kobyqu;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {
    // the empty string
    private ReverseString emptyString = new ReverseString("");
    // random string
    private ReverseString rString0 = new ReverseString("god");
    // same lettered string
    private ReverseString rString1 = new ReverseString("aaa");
    // integers in a string
    private ReverseString rString2 = new ReverseString("123");
    // string as a palindrome
    private ReverseString rString3 = new ReverseString("pop");
    // long string
    private ReverseString rString4 = new ReverseString("abcdefghijklmnopqrstuvwxyz");
    // null
    private ReverseString rString5 = new ReverseString(null);

    @Test
    public void stringReversed() {
        assertThat(emptyString.getReverseString(), equalTo(""));
    }

    @Test
    public void stringReversed1(){
        assertThat(rString0.getReverseString(), equalTo("dog"));
    }

    @Test
    public void stringReversed2(){
        assertThat(rString1.getReverseString(), equalTo("aaa"));
    }

    @Test
    public void stringReversed3(){
        assertThat(rString2.getReverseString(), equalTo("321"));
    }

    @Test
    public void stringReversed4(){
        assertThat(rString3.getReverseString(), equalTo("pop"));
    }

    @Test
    public void stringReversed5(){
        assertThat(rString4.getReverseString(), equalTo("zyxwvutsrqponmlkjihgfedcba"));
    }

    @Test
    public void stringReversed6(){
        assertThat(rString5.getReverseString(), equalTo(null));
    }

}
