package sorting;

import algodat.sorting.AbstractSortingTest;
import algodat.sorting.ISort;

class SelectionSortTest extends AbstractSortingTest {

    @Override
    protected ISort<Integer> createMethod() {
        return new SelectionSort<>();
    }
}