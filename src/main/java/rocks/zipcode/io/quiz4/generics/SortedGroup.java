package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable > extends Group<T>{



    public SortedGroup() {

    }

    public SortedGroup(List<T> list) {
        super.list = list;
        Collections.sort(list);
    }

    public void insert(T value) {

        super.insert(value);
        Collections.sort(list);
    }


    public void delete(T value) {
        super.delete(value);
        Collections.sort(list);
    }

    public Integer indexOf(T value) {
        return super.indexOf(value);

    }


}
