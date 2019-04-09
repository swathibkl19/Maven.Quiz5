package rocks.zipcode.io.quiz4.generics;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<T> implements Iterable<T> {

    private Stack<T> myStack;

    public MyStack() {
        //throw new UnsupportedOperationException("Method not yet implemented");
        myStack = new Stack<>();
    }

    public int size() {
        return myStack.size();
    }


    public boolean isEmpty() {
        return myStack.isEmpty();
    }


    public boolean contains(Object o) {
        return myStack.contains(o);
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    public boolean add(T t) {
        return myStack.add(t);
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    public void push(T i) {
        myStack.push(i);
    }

    public T peek() {
        if (myStack.isEmpty()) {
            return null;
        }

        return myStack.peek();
    }

    public T pop() {
        return myStack.pop();
    }


    public Iterator<T> iterator() {
        return myStack.iterator();
    }
}
