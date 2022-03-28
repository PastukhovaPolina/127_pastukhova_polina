import org.junit.Assert;
import org.junit.Test;

public class Task2_Tests extends Assert {
    static class ComparatorTest implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void bubbleSort_BubbleSort_checkElement() {
        Integer[] data = {5};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(data, new ComparatorTest());
        assertArrayEquals(new Integer[]{5}, data);
    }
    @Test
    public void bubbleSort_BubbleSort_sortingConsecutiveNumbersArray() {
        Integer[] data = {1, 2, 3, 4, 5, 6, 7};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(data, new ComparatorTest());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7}, data);
    }
    @Test
    public void bubbleSort_BubbleSort_sortingRandomNumbersArray() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] d = {577, 987654321, 900, 111, 123456789};
        bubbleSort.sort(d, new ComparatorTest());
        assertArrayEquals(new Integer[]{111, 577, 900, 987654321,123456789 }, d);
    }
    @Test
    public void bubbleSort_BubbleSort_firstS() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] d = {78, 10, 1};
        bubbleSort.sort(d, new ComparatorTest());
        assertArrayEquals(new Integer[]{1, 10, 78}, d);
    }


    @Test
    public void selectionSort_SelectionSort_checkElement() {
        Integer[] d = {5};
        Sort<Integer> selectionSort = new SelectionSort<>();
        selectionSort.sort(d, new ComparatorTest());
        assertArrayEquals(new Integer[]{5}, d);
    }
    @Test
    public void selectionSort_SelectionSort_sortingConsecutiveNumbersArray() {
        Sort<Integer> selectionSort = new SelectionSort<>();
        Integer[] d = {1, 2, 3, 4, 5};
        selectionSort.sort(d, new ComparatorTest());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, d);
    }
    @Test
    public void selectionSort_SelectionSort_sortingRandomNumbersArray() {
        Integer[] d = {577, 987654321,900,111, 123456789 };
        Sort<Integer> selectionSort = new SelectionSort<>();
        selectionSort.sort(d, new ComparatorTest());
        assertArrayEquals(new Integer[]{111, 577, 900, 987654321,123456789}, d);
    }
    @Test
    public void selectionSort_firstS() {
        Integer[] d = {78,10,1 };
        Sort<Integer> selectionSort = new SelectionSort<>();
        selectionSort.sort(d, new ComparatorTest());
        assertArrayEquals(new Integer[]{1,10,78 }, d);
    }


    @Test
    public void insertionSort_checkElement() {
        Integer[] d = {5};
        Sort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(d, new ComparatorTest());
        assertArrayEquals(new Integer[]{5}, d);
    }

}
