import org.junit.*;
public class Task1_Tests extends Assert {
    @Test
    public void isEmpty_DoubleLinkedList_checkIsEmpty() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty()); //проверка
    }
    @Test
    public void isEmpty_DoubleLinkedList_checkPushBack() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(5);
        assertFalse(list.isEmpty());
    }
    @Test
    public void getSize_DoubleLinkedList_checkGetSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }
    @Test
    public void pushFront_DoubleLinkedList_checkNumberGetSize() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        assertTrue(1 == list.getSize());
    }
    @Test
    public void get_DoubleLinkedList_checkAnNumber() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e) { //ищем ошибку
            assertFalse(false);
        }
    }
    @Test
    public void getHead_DoubleLinkedList_checkGetHead() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(5);
        list.pushFront(2);
        int y = ((Node<Integer>) list.getHead()).getData();
        assertEquals(5, y);
    }
    @Test
    public void getHead_DoubleLinkedList_checkGetHead2() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(6);
        list.pushBack(1);
        int y = ((Node<Integer>) list.getHead()).getData();
        assertEquals(1, y);
    }
    @Test
    public void getTail_DoubleLinkedList_checkGetTail() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(3);
        list.pushFront(2);
        int t = ((Node<Integer>) list.getTail()).getData();
        assertEquals(2, t);
    }
    @Test
    public void getTail_PushBackDoubleLinkedList_checkGetTail() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        int t = ((Node<Integer>) list.getTail()).getData();
        assertEquals(1, t);
    }
    @Test
    public void get_PushFrontDoubleLinkedList_сheckGet(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        int n = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, n);
    }
    @Test
    public void get_PushBackDoubleLinkedList_сheckGet(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);

        int n = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, n);
    }
    @Test
    public void remove_PushFrontDoubleLinkedList_сheckSizeRemove(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }
    @Test
    public void insertListAfter_CreateTwoListsAndUnite_сheckSize(){
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(0), list2);
        assertEquals(6, list1.getSize());
    }

}