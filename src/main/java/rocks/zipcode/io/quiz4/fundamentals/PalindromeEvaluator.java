package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        StringEvaluator stringEvaluator = new StringEvaluator();
        List<String> list = new ArrayList<>();
        List<String> list1 = Arrays.asList(stringEvaluator.getAllSubstrings(string));
        for (int i = 0; i < list1.size(); i++) {

            if (isPalindrome(list1.get(i))) {
                list.add(list1.get(i));

            }
        }        return list.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {

        if (reverseString(string).equals(string)) {
            return true;
        }
        return false;
    }

    public static String reverseString(String string) {

        String revString = "";
        for (int i = string.length() - 1; i < string.length() && i >= 0; i--) {
            revString += string.charAt(i);
        }
        return revString;
    }
}
