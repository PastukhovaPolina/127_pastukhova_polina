import org.junit.*;
public class Task1_Tests extends Assert{
    @Test
    public void isEmpty_DoubleLinkedList_checkIsEmpty(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty()); //проверка
    }
    @Test
    public void isEmpty_DoubleLinkedList_checkPushBack(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(5);
        assertFalse(list.isEmpty());
    }
    @Test
    public void getSize_DoubleLinkedList_checkGetSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }
    @Test
    public void pushFront_DoubleLinkedList_checkNumberGetSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(10);
        assertTrue(1 == list.getSize());
    }
    @Test
    public void get_DoubleLinkedList_checkAnNumber(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException x){ //ищем ошибку
            assertFalse(false);
        }
    }
    @Test
    public  void getHead_DoubleLinkedList_checkGetHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(5);
        list.pushFront(2);
        int y = ((Node<Integer>)list.getHead()).getData();
        assertEquals(5, y);
    }
    @Test
    public void getHead_DoubleLinkedList_checkGetHead2(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(6);
        list.pushBack(1);
        int y = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, y);
    }
    @Test
    public void getTail_DoubleLinkedList_checkGetTail(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(3);
        list.pushFront(2);
        int t = ((Node<Integer>)list.getTail()).getData();
        assertEquals(2, t);
    }
    

}
