package by.teachmeskills.lapeiko.homework18;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntLinkedNodeIterator implements Iterator<Integer> {
    private IntListNode node;
    public IntLinkedNodeIterator(IntListNode headNode) {
        this.node = headNode;
    }

    @Override
    public boolean hasNext() {
        return node != null;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        int element = node.getElement();
        node = node.getNextNode();
        return element;
    }
}
