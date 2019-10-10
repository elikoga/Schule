/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingplayground.sorters;

/**
 *
 * @author coafin
 */
public class Quicksort implements Sorter {

    @Override
    public int[] sort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
        return arr;
    }

    public void quicksort(int[] arr, int lEdge, int rEdge) {
        int pIdx = (lEdge + rEdge) / 2;
        int lIdx = lEdge;
        int rIdx = rEdge;

        System.out.println("Beg:   " + "lEdge:" + lEdge + " rEdge:" + rEdge + " pdix:" + pIdx + " lIdx:" + lIdx + " rIdx:" + rIdx);

        while (lIdx < rIdx) {
            while (arr[lIdx] < arr[pIdx]) {
                lIdx++;
            }
            while (arr[pIdx] < arr[rIdx]) {
                rIdx--;
            }
            if (lIdx <= rIdx) {
                swap(arr, lIdx, rIdx);
                lIdx++;
                rIdx--;
            }
        }

        System.out.println("End:   " + "lEdge:" + lEdge + " rEdge:" + rEdge + " pdix:" + pIdx + " lIdx:" + lIdx + " rIdx:" + rIdx);

        if (lEdge < rIdx) {
            quicksort(arr, lEdge, rIdx);
        }
        if (lIdx < rEdge) {
            quicksort(arr, lIdx, rEdge);
        }
    }

    public static final void swap(int[] arr, int aIdx, int bIdx) {
        int temp = arr[aIdx];
        arr[aIdx] = arr[bIdx];
        arr[bIdx] = temp;
    }
}
