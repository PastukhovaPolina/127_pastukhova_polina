import org.junit.Assert;
import org.junit.*;

public class Task3_Tests extends Assert {
    class TestComparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void quickSort_sortArray_sortTwoElements() {
        Integer[] array = new Integer[]{10, 4};
        QuickSort<Integer> quickSort = new QuickSort<>();
        quickSort.sort(array, new TestComparator());
        assertArrayEquals(new Integer[]{4, 10}, array);
    }
    @Test
    public void quickSort_sortArray_sortSameElements(){
        Integer[] array = new Integer[]{2,10,2,3};
        QuickSort<Integer> quickSort = new QuickSort();
        quickSort.sort(array, new TestComparator());
        assertArrayEquals(new Integer[]{2,2,3, 10}, array);
    }
}
