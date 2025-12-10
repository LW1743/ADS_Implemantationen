package Datastructures.MinHeap;


public class MinHeap {
    public int[] minHeap;

    public MinHeap(int height) {
        int length = (1<<(height+1))-1;
        minHeap = new int[length];
    }

    public MinHeap(int[] A) {
        minHeap = A;
        BuildMinHeap(minHeap);
    }

    public int left(int i) {
        return 2*i;
    }

    public int right(int i) {
        return (2*i)+1;
    }

    public int parent(int i) {
        return i/2;
    }

    public void BuildMinHeap(int[] A) {
        for(int i = A.length/2; i>=0; i--) {
            MinHeapify(A,i);
        }
    }

    public void MinHeapify(int[] A, int i) {
        int l = left(i);
        int r = right(i);
        int min = i;
        if( (l < A.length) && (A[l] < A[i]) ) {
            min = l;
        }
        if( (r < A.length) && (A[r] < A[min]) ) {
            min = r;
        }
        if(min != i) {
            swap(A, i, min);
            MinHeapify(A, min);
        }
    }

    private void swap(int[] Array, int i, int j) {
        int temp = Array[i];
        Array[i] = Array[j];
        Array[j] = temp;
    }

    //Works better on smaller trees
    public void printAsTree() {
        int height = (int) ((int) Math.log(minHeap.length)/Math.log(2));
        int current = 0;
        for(int ebene = 0; ebene<height; ebene++) {
            int amount = 1<<ebene;
            printSpaces(2^(height-ebene)-1);
            while(amount>0) {
                System.out.print(minHeap[current]);
                printSpaces(2^(height-(ebene+1)-1));
                current++;
                amount--;
            }
            System.out.println();
        }
    }

    private void printSpaces(int amount) {
        for(int i = amount; i>0; i--) {
            System.out.print(" ");
        }
    }

}
