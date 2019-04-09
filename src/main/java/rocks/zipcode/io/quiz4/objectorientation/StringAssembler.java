package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    List<Character> list;
    private Character delimiter;

    public StringAssembler(Character delimeter) {
        list = new ArrayList<>();
        this.delimiter = delimeter;
    }

    public StringAssembler append(String str) {
        for (char c : str.toCharArray()) {
            // System.out.println(str.toCharArray());
            list.add(c);
            // System.out.println(list);
        }
        list.add(delimiter);
        System.out.println(delimiter);
        System.out.println(list);
        return this;
    }

    public String assemble() {

        String result = list
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        return result.substring(0, result.length() - 1);
    }
}
