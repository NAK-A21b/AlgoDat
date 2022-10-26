package sorting;

import algodat.sorting.ISort;

public class BubbleSort<E extends Comparable<E>> implements ISort<E> {

    @Override
    public E[] sort(E[] es) {
        for (int i = 0; i < es.length - 1; i++) {
            for (int j = 0; j < es.length - 1 - i; j++) {
                if (es[j].compareTo(es[j + 1]) > 0) {
                    swap(es, j, j + 1);
                }
            }
        }

        return es;
    }
}
