import org.junit.*;
public class Task1_Tests extends Assert {
    private int value(ListNode<Integer> item) {

        return ((Node<Integer>)item).getData();
    }
    @Test
    public void PushFront_DoubleLinkedList_oneNumber() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertFalse(list.isEmpty());
    }
    
}
