package Algorithms.Sort.InsertionSort;

import Algorithms.Sort.SortingAlgorithm;

public class InsertionSort implements SortingAlgorithm {

    public InsertionSort() {

    }

    public void sort(int[] A) {
        for(int j = 1; j<A.length; j++) {
            int temp = A[j];
            int i=j-1;
            while( (i>=0) && (temp<A[i]) ) {
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = temp;
        }
    }

}
