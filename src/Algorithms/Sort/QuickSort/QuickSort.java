package Algorithms.Sort.QuickSort;

import Algorithms.Sort.SortingAlgorithm;

public class QuickSort implements SortingAlgorithm {
    public int counter=0;
    public void swap(int[] A, int i, int j) {
        if( (i<0) || (j<0) || (i>= A.length) || (j>=A.length) ) {
            throw new IllegalArgumentException();
        }
        int mem = A[i];
        A[i] = A[j];
        A[j] = mem;
    }


    public int partition(int[] A, int l, int r) {
        int pivot = A[r];
        int i = l;
        for (int j = l; j<r; j++) {
            counter++;
            if(A[j] < pivot) {
                swap(A, j, i);
                i++;
            }
        }
        swap(A,i,r);
        return i;
    }


    public void quickSort(int[] A, int l, int r) {
        if(l>=r) {
            return;
        }
        int m = partition(A, l, r);
        if(l<m) {
            quickSort(A,l,m-1);
        }
        if(m<r){
            quickSort(A,m+1, r);
        }
    }

    public void sort(int[] Array) {
        quickSort(Array, 0, Array.length-1);
    }
}
