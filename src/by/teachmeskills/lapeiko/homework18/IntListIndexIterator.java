package by.teachmeskills.lapeiko.homework18;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntListIndexIterator implements Iterator<Integer> {
    private IntList list;
    private int i;

    public IntListIndexIterator(IntList list) {
        this.list = list;
        this.i = i;
    }

    @Override
    public boolean hasNext() {
        return i < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        Integer element = list.get(i);
        i++;
        return element;
    }
}
