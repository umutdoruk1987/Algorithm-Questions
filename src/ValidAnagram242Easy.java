import java.util.Arrays;


public class ValidAnagram242Easy {

    public static boolean isAnagramSolution1(String s, String t) {

        if (s.length()!=t.length()) return false;

        char [] string1 = s.toCharArray();
        char [] string2 = t.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        for (int i=0;i<string1.length;i++){

            if (string1[i]!=string2[i])return false;
        }
      return true;
    }

    /*public static boolean isAnagramSolution2(String s, String t){

    }*/


    public static void main(String[] args) {

        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";


        System.out.println(isAnagramSolution1(s1,t1));
        System.out.println(isAnagramSolution1(s2,t2));
    }

}

    /* Given two strings s and t, return true if t is an anagram of s, and false otherwise.
       An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
       typically using all the original letters exactly once.

        Example 1:
        Input: s = "anagram", t = "nagaram"
        Output: true

        Example 2:
        Input: s = "rat", t = "car"
        Output: false

        Constraints:
        1 <= s.length, t.length <= 5 * 104
        s and t consist of lowercase English letters.*/
