package by.teachmeskills.lapeiko.homework18;

public class IntLinkedList implements IntList {
    private IntListNode headNode;
    public IntLinkedList() {
        this.headNode = null;
    }

    @Override
    public String toString() {
            if (headNode == null) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder("[");
            IntListNode node = headNode;
            while (node.getNextNode() != null) {
                sb.append(node.getElement()).append(", ");
                node = node.getNextNode();
            }
            return sb.append(node.getElement()).append("]").toString();
        }

    private IntListNode getNode(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        IntListNode node = headNode;
        int i = 0;
        while (i < index) {
            if (node == null) {
                throw new IndexOutOfBoundsException();
            }
            node = node.getNextNode();
            i++;
        }
        return node;
    }

    @Override
    public int get(int index) {
        IntListNode node = getNode(index);
        return node.getElement();
    }

    @Override
    public int set(int index, int element) {
        IntListNode node = getNode(index);
        int previousNode = node.getElement();
        node.setElement(element);
        return previousNode;
    }

    @Override
    public int size() {
        int counterSize = 0;
        IntListNode node = headNode;
        while (node != null) {
            counterSize++;
            node = node.getNextNode();
        }
        return counterSize;
    }

    @Override
    public void add(int element) {
        if (headNode == null) {
            headNode = new IntListNode(element, null);
        } else {
            IntListNode lastNode = headNode;
            while (lastNode.getNextNode() != null) {
                lastNode = lastNode.getNextNode();
            }
            lastNode.setNextNode(new IntListNode(element, null));
        }
    }

    @Override
    public int remove(int index) {
        if (headNode == null) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            int deletedElem = headNode.getElement();
            headNode = headNode.getNextNode();
            return deletedElem;

        } else {
            IntListNode preDeletedNode = getNode(index - 1);
            IntListNode deletedNode = preDeletedNode.getNextNode();
            if (deletedNode == null) {
                throw new IndexOutOfBoundsException();
            }
            preDeletedNode.setNextNode(deletedNode);
            return deletedNode.getElement();
        }
    }

    @Override
    public int lastIndexOf(int element) {
        int elementIndex = -1;
        IntListNode node = headNode;
        int i = 0;
        while (node != null) {
            if (node.getElement() == element) {
                elementIndex = i;
            }
            node = node.getNextNode();
            i++;
        }
        return elementIndex;
    }
}

