package sorting;

import algodat.sorting.AbstractSortingTest;
import algodat.sorting.ISort;

class BubbleSortTest extends AbstractSortingTest {

    @Override
    protected ISort<Integer> createMethod() {
        return new BubbleSort<>();
    }
}