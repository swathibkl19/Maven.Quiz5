package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {

  List<String> list ;



    public SimpleStringGroup() {
        this.list = new ArrayList<>();
        //if(list.)
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return list.size();
    }

    public void insert(String string) {
        list.add(string);
    }

    public Boolean has(String string) {
        return list.contains(string);
    }

    public String fetch(int indexOfValue) {

        return list.get(indexOfValue);
    }

    public void delete(String string) {
        list.remove(string);
    }

    public void clear() {
        list.clear();
    }


    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }
}
