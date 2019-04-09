package rocks.zipcode.io.quiz4.generics;

import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T> implements GroupInterface<T> {

    //List<T> list;
    @Override
    public void insert(T value) {
        super.insert(value);
    }

    @Override
    public void delete(T value) {
    super.delete(value);
    }

    public Integer indexOf(T value) {
        return super.indexOf(value);
    }
}
