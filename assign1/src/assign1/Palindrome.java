/* Alexandra Kassis CSE360 assign1 */
/* This class contains the isPalindrome() 
 * method to test whether a string reads the same forward and backward
 */

package assign1;

/* Contains isPalindrome method */
public class Palindrome {

private String testString;
  
    /* Class constructor, takes a string as an argument */
    public Palindrome(String string) {
      testString = string;
    }
    
    /* boolean method that returns true if a string is palindrome, false if its not*/
    public boolean isPalindrome() {

        /* Ignore cases, punctuation and white space */
        testString = testString.toLowerCase();
        testString = testString.replaceAll("[^0-9a-z]" , "" );
    

        /* Check base cases, empty string or one character */
        if((testString.length() == 0) || (testString.length() == 1)){
            return true;
        }

        /* Check if first and last character are NOT equivalent */
        else{
         
          int firstChar = 0;
          int lastChar = testString.length() - 1;
          
          while(lastChar > firstChar) {
            
            if(testString.charAt(lastChar) != testString.charAt(firstChar)) {
              /* if first and last char are not the same return false */
              return false;
            }
            
            /* Increment first and last chars */
            firstChar++;
            lastChar--;
            
          } 
          /* returns true if every first char checked is the same as every last char checked */
          return true;
       }
    }
}
