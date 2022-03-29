import org.junit.Assert;
import org.junit.*;

public class Task3_Tests extends Assert {
    class ComparatorTest implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void quickSort_sortArray_twoElements() {
        Integer[] array = new Integer[]{10, 4};
        QuickSort<Integer> quickSort = new QuickSort();
        quickSort.sort(array, new ComparatorTest() );
        assertArrayEquals(new Integer[]{4, 10}, array) ;
    }
}
