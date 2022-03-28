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
}
