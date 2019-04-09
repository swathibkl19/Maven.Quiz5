package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet<T> implements Comparable<T> {

    Set<T> list;

    public ComparableTreeSet(T... arr) {
        list = new TreeSet<>();
        list.addAll(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<T> o) {
        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
