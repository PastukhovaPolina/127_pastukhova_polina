import org.junit.*;
public class Task1_Tests extends Assert{
    @Test
    public void isEmpty_DoubleLinkedList_checkIsEmpty(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        assertTrue(list.isEmpty()); //проверка
    }
}