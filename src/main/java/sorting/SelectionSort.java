package sorting;

import algodat.sorting.ISort;

public class SelectionSort<E extends Comparable<E>> implements ISort<E> {

    @Override
    public E[] sort(E[] es) {
        for (int i = 0; i < es.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < es.length; j++) {
                if (es[smallest].compareTo(es[j]) > 0) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                swap(es, i, smallest);
            }
        }

        return es;
    }
}
