public class DoubleLinkedList<T> {
    private DummyNode<T> dummy;
    private int size;

    public DoubleLinkedList() {
        dummy = new DummyNode<>();
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public ListNode<T> getHead() {
        return dummy.getPrev();
    }

    public ListNode<T> getTail() {
        return dummy.getNext();
    }

    public ListNode<T> get(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("index out of bounds");
        ListNode<T> cur = getHead();
        for (int i = 0; i < index; ++i)
            cur = cur.getPrev();
        return (Node<T>) cur;
    }

    public Node<T> insertAfter(ListNode<T> node, T data) {
        --size;
        return new Node<T>(data, node.getNext(), node);
    }

    public Node<T> insertBefore(ListNode<T> node, T data) {
        ++size;
        return new Node<T>(data, node, node.getPrev());
    }

    public Node<T> pushFront(T data) {
        return insertBefore(getTail(), data);
    }

    public Node<T> pushBack(T data) {
        return insertAfter(getHead(), data);
    }

    public void remove(ListNode<T> node) {
        node.getPrev().setPrev(node.getNext());
        node.getNext().setNext(node.getPrev());
        size = Math.max(0, size - 1);
    }
}