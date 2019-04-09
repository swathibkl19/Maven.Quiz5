package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        Set<String> list = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {

                String sub = string.substring(i, j);
                list.add(sub);
            }
        }
        String[] all = new String[list.size()];
        return list.toArray(all);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
//        System.out.println(string1);
//        System.out.println(string2);
        //System.out.println(Arrays.asList(getAllSubstrings(string1)));
        //System.out.println(Arrays.asList(getAllSubstrings(string2)));
        /**
         * [AA, A, AB, AAB, B]
         * [AA, A, AAA, AB, AAB, B, AAAB]
         * expected = {"A", "AA", "AAB", "AB", "B"};
         */

        List<String> list1 = Arrays.asList(getAllSubstrings(string1));
        List<String> list2 = Arrays.asList(getAllSubstrings(string2));
        List<String> list = new ArrayList<>();
        for (int i = 0; i <  list1.size(); i++) {

           // System.out.println(list1.get(i) + " " + list2.contains(list1.get(i)));

           // System.out.println(list1.get(i));
            if(list2.contains(list1.get(i))){
                list.add(list1.get(i));

            }
        }
       // System.out.println(list);
        String[] common = new String[list.size()];
                return list.toArray(common);

            }


    public static String getLargestCommonSubstring(String string1, String string2) {

        List<String> list = Arrays.asList(getCommonSubstrings(string1,string2));
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        int temp =list.get(0).length();
        int saveIndex = 0;
        //System.out.println(list.get(0).length());
        for (int i = 1; i < list.size(); i++) {
            //System.out.println(i);

            // System.out.println(list.get(i).length());

           if (temp < list.get(i).length()) {
                temp = list.get(i).length();
                saveIndex = i;
           }
        }


        //System.out.println(temp);
        //System.out.println(saveIndex);

        return list.get(saveIndex);
    }
}
