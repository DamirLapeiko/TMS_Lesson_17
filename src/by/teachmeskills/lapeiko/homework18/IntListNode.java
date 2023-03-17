package by.teachmeskills.lapeiko.homework18;

public class IntListNode {
    private int element;
    private IntListNode nextNode;

    public IntListNode(int element, IntListNode nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public IntListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(IntListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString(){
        return element + " ";
    }
}
