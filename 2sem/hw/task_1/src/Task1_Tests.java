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
    public void insertListAfter_TwoListsAndUnite_сheckSize(){
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
    @Test
    public void insertListAfter_TwoListsAndUnite_сheckHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        list1.insertListAfter(list.get(0), list1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void insertListAfter_TwoListsAndUnite_сheckValues(){
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(5);
        list1.pushFront(6);
        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(2);
        list2.pushFront(3);
        list2.pushFront(4);
        list1.insertListAfter(list1.get(0), list2);
        int n = ((Node<Integer>)list1.get(0)).getData();
        assertEquals(1, n);
        n = ((Node<Integer>)list1.get(1)).getData();
        assertEquals(2, n);
        n = ((Node<Integer>)list1.get(2)).getData();
        assertEquals(3, n);
        n = ((Node<Integer>)list1.get(3)).getData();
        assertEquals(4, n);
        n = ((Node<Integer>)list1.get(4)).getData();
        assertEquals(5, n);
        n = ((Node<Integer>)list1.get(5)).getData();
        assertEquals(6, n);
    }
    @Test
    public void pushFront_PushFrontDoubleLinkedList_checkValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        int n = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, n);
        n = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, n);
        n = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, n);
        n = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, n);
    }
    @Test
    public void remove_RemoveAnyElement_checkValue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(2, num);
    }
    @Test
    public void insertListAfter_TwoListsAndUnite2_сheckValues(){ //перепутала русскую "с"
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(2), list2);
        int n = ((Node<Integer>)list1.get(0)).getData();
        assertEquals(1, n);
        n = ((Node<Integer>)list1.get(1)).getData();
        assertEquals(2, n);
        n = ((Node<Integer>)list1.get(2)).getData();
        assertEquals(3, n);
        n = ((Node<Integer>)list1.get(3)).getData();
        assertEquals(4, n);
        n = ((Node<Integer>)list1.get(4)).getData();
        assertEquals(5, n);
        n = ((Node<Integer>)list1.get(5)).getData();
        assertEquals(6, n);
    }
    @Test
    public void insertListBefore_DoubleLinkedList_checkSize(){
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(1);
        list2.pushFront(2);
        list2.pushFront(3);
        list1.insertListBefore(list1.get(0), list2);
        assertEquals(6, list1.getSize());
    }
    @Test
    public void insertListBefore_DoubleLinkedList_checkValues(){
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(1);
        list2.pushFront(2);
        list2.pushFront(3);
        list1.insertListBefore(list1.get(0), list2);
        int n = ((Node<Integer>)list1.get(0)).getData();
        assertEquals(1, n);
        n = ((Node<Integer>)list1.get(1)).getData();
        assertEquals(2, n);
        n = ((Node<Integer>)list1.get(2)).getData();
        assertEquals(3, n);
        n = ((Node<Integer>)list1.get(3)).getData();
        assertEquals(4, n);
        n = ((Node<Integer>)list1.get(4)).getData();
        assertEquals(5, n);
        n = ((Node<Integer>)list1.get(5)).getData();
        assertEquals(6, n);
    }
    @Test
    public void array_fillArray_checkSize(){
        DynamicArray<Integer> array = new DynamicArray<>(10);
        assertEquals(10, array.getSize());
    }
    @Test
    public void array_isEmptyArray_checkSize(){
        DynamicArray<Integer> array = new DynamicArray<>();
        assertEquals(1024, array.getSize());
    }
    @Test
    public void resize_DynamicArray_checkSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.resize(10);
        assertEquals(10, array.getSize());
    }
    @Test
    public void get_Index_exception(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(7);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void get_Index2_exception(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(5);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void set_Index_checkException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void set_Index_checkException2(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(5,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void insert_DynamicArray_checkException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void insert_DynamicArray_checkException2(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(5,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void set_SetNumbers_checkValues(){
        DynamicArray<Integer> array = new DynamicArray<>(3);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
    }
    @Test
    public void insert_DynamicArray_checkValues2(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.insert(4, 100);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(100, array.get(4).intValue());
    }
    @Test
    public void pushBack_DynamicArray_checkValues(){
        DynamicArray<Integer> array = new DynamicArray<>(3);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);

        array.pushBack(4);
        array.pushBack(5);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
    }
    @Test
    public void popBack_DynamicArray_checkException(){
        DynamicArray<Integer> array = new DynamicArray<>(0);
        try {
            array.popBack();
            fail();
        }
        catch (Exception some) {
            assertEquals("Array is empty", some.getMessage());
        }
    }
    @Test
    public void popBack_DynamicArray_checkArray(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.popBack();
        assertEquals(4, array.getSize());
    }
    @Test
    public void remove_DynamicArray_checkException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.remove(6);
            fail();
        }
        catch (Exception some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void remove_DynamicArray_checkException2(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.remove(5);
            fail();
        }
        catch (Exception some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }










}