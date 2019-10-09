/*Alexandra Kassis CSE360 assign1 
 * This class tests the isPalindrome() method and uses the base cases
 * and other tests to check if it correctly checks for palindrome strings*/
package assign1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

  /* Testing Palindrome object */
  @Test
  public void test() {
    Palindrome palindromeObject = new Palindrome("Test");
    assertNotNull(palindromeObject);
    
  }
  
  /* Testing method with odd number of chars */
  @Test
  public void testOddString() {
    Palindrome palindromeObject = new Palindrome("dld");
    assertTrue(palindromeObject.isPalindrome());
 
  }
  
  /* Testing method to ignore special characters */
  @Test
  public void testSpecialChars() {
    Palindrome palindromeObject = new Palindrome("$%^&*()");
    assertTrue(palindromeObject.isPalindrome());
   
  }
    
  /* Testing empty string */
  @Test
  public void testEmptyString() {
    Palindrome palindromeObject = new Palindrome(" ");
    assertTrue(palindromeObject.isPalindrome());
   
  }
  
  /* Testing numbers*/
  @Test
  public void testNumbers() {
    Palindrome palindromeObject = new Palindrome("134431");
    assertTrue(palindromeObject.isPalindrome());
   
  }
    
  /* Testing non-palindrome string */
  @Test
  public void testNonPal() {
    Palindrome palindromeObject = new Palindrome("Test");
    assertFalse(palindromeObject.isPalindrome());
   
  }
  
  /* Testing one character */
  @Test
  public void testOneChar() {
    Palindrome palindromeObject = new Palindrome("a");
    assertTrue(palindromeObject.isPalindrome());
 
  }
    
  /* Testing one character */
  @Test
  public void testNonPalAgain() {
    Palindrome palindromeObject = new Palindrome("sdfhsdh");
    assertFalse(palindromeObject.isPalindrome());
 
  }
    

}
