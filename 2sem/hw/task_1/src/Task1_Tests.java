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
}
