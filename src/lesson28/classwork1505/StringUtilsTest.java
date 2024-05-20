package lesson28.classwork1505;

import lesson27.classwork1305.StringUtils;
import lesson27.classwork1305.StringUtilsImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    private static StringUtils utils;

    @BeforeAll
    public static void init() {
        utils = new StringUtilsImpl();
    }

    @Test
    public void isPalindromeReturnsTrueForPalindromes() {
        assertTrue(utils.isPalindrome("12:21"));
        assertTrue(utils.isPalindrome("123321"));
        assertTrue(utils.isPalindrome("tenet"));

    }

    @Test
    public void isPalindromeReturnsFalseForNonPalindromes() {
        assertFalse(utils.isPalindrome("123456"));
        assertFalse(utils.isPalindrome("Hello"));
        assertFalse(utils.isPalindrome("How are you"));
    }

    @Test
    public void isPalindromeReturnsTrueFroSingleChar() {
        assertTrue(utils.isPalindrome("1"));
    }

    @Test
    public void isPalindromeReturnsTrueFroEmptyString() {
        assertTrue(utils.isPalindrome(""));
    }

    @Test
    public void isPangramReturnsTrueForPangrams() {
        assertTrue(utils.isPangram("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void isPangramReturnsFalseForNonPangrams() {
        assertFalse(utils.isPangram("Hello world!"));
    }

    @Test
    public void isPangramReturnsFalseForEmptyPangrams() {
        assertFalse(utils.isPangram(""));
    }

    @Test
    public void countOccurenciesCountsLetters() {
        assertEquals(3, utils.countOccurencies("Hello", 'l'));
        assertEquals(1, utils.countOccurencies("1234548", '2'));
    }

    @Test
    public void countOccurenciesReturnsZeroWhenCharNotPresent() {
        assertEquals(0, utils.countOccurencies("1234548", 'a'));
    }

    @Test
    public void countOccurenciesReturnsZeroForEmptyString() {
        assertEquals(0, utils.countOccurencies("", '1'));
    }

    @Test
    public void countOccurenciesReturnsZeroForNull() {
        assertEquals(0, utils.countOccurencies(null, '1'));
    }

    @Test
    public void reverseWorks() {
        assertEquals("dlorW olleH", utils.reverse("Hello world"));
    }

    @Test
    public void reverseReturnsSameStringForSingleLetter() {
        String s = "a";
        assertEquals(s, utils.reverse(s));
    }

    @Test
    public void reverseReturnsEmptyStringForEmptyString(){
        assertEquals("", utils.reverse(""));
    }

    @Test
    public void wordReverseWorks() {
        assertEquals("world hello", utils.wordReverse(""));
    }
}