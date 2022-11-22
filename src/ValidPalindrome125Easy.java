public class ValidPalindrome125Easy {

    public static boolean isPalindrome(String s) {

        String toLover = s.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<toLover.length(); i++){

            if(Character.isLetterOrDigit(toLover.charAt(i))) {
                stringBuilder.append(toLover.charAt(i));
            }
        }

        return  (stringBuilder.toString().equals(stringBuilder.reverse().toString()));


    }
    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));

        String s2 = "race a car";
        System.out.println(s2);

        String s3 = " ";
        System.out.println(s3);

    }
}

   /* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
   and removing all non-alphanumeric characters, it reads the same forward and backward.
   Alphanumeric characters include letters and numbers.

   Given a string s, return true if it is a palindrome, or false otherwise.

        Example 1:
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.

        Example 2:
        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.

        Example 3:
        Input: s = " "
        Output: true
        Explanation: s is an empty string "" after removing non-alphanumeric characters.
        Since an empty string reads the same forward and backward, it is a palindrome.


        Constraints:
        1 <= s.length <= 2 * 105
        s consists only of printable ASCII characters.
*/

