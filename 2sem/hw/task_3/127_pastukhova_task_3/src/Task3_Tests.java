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
    @Test
    public void quickSort_array_sort(){
        Integer[] array = new Integer[]{1,5,1,3,5};
        QuickSort<Integer>quickSort = new QuickSort();
        quickSort.sort(array, new TestComparator());
        assertArrayEquals(new Integer[]{1,1,3,5, 5}, array);
    }
    @Test
    public void mergeSort_sortArray_sortTwoElements(){
        Integer[] array = new Integer[]{10,2};
        MergeSort<Integer> mergeSort = new MergeSort();
        mergeSort.sort(array, new TestComparator());
        assertArrayEquals(new Integer[]{2, 10}, array);
    }
    @Test
    public void mergeSort_array_sortFirstEl(){
        Integer[] array = new Integer[]{6,5,8};
        MergeSort<Integer> mergeSort = new MergeSort();
        mergeSort.sort(array, new TestComparator());
        assertArrayEquals(new Integer[]{5,6, 8}, array);
    }
    @Test
    public void mergeSort_sortedArray_array(){
        Integer[] array = new Integer[]{1,2,3,4};
        MergeSort<Integer> mergeSort = new MergeSort();
        mergeSort.sort(array, new TestComparator());
        assertArrayEquals(new Integer[]{1,2,3,4}, array);
    }
    @Test
    public void mergeSort_array_sortTwoSameElem(){
        Integer[] array = new Integer[]{1,5,4,1};
        MergeSort<Integer> mergeSort = new MergeSort();
        mergeSort.sort(array, new TestComparator());
        assertArrayEquals(new Integer[]{1,1,4,5}, array);
    }
    @Test
    public void mergeSort_array_sort(){
        Integer[] array = new Integer[]{1,5,2,5,3,2};
        MergeSort<Integer> mergeSort = new MergeSort();
        mergeSort.sort(array, new TestComparator());
        assertArrayEquals(new Integer[]{1,2,2,3,5,5}, array);
    }
    @Test
    public void heapSort_sortArray_sortTwoElem(){
        Integer[] array = new Integer[]{3,2};
        HeapSort<Integer> heapSort = new HeapSort();
        heapSort.sort(array, new TestComparator());
        assertArrayEquals(new Integer[]{2, 3}, array);
    }

}
