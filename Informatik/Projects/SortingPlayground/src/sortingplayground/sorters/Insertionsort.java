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
public class Insertionsort implements Sorter {

    @Override
    public void sort(int[] arr) {
        for (int srtd = 0; srtd < arr.length; srtd++) {
            int iSrtd = arr[srtd];
            int idx;
            for (idx = srtd; idx > 0; idx--) {
                if (iSrtd > arr[idx - 1]) {
                    break;
                }
                arr[idx] = arr[idx - 1];
            }
            arr[idx] = iSrtd;
        }
    }

    public static final void swap(int[] arr, int aIdx, int bIdx) {
        int temp = arr[aIdx];
        arr[aIdx] = arr[bIdx];
        arr[bIdx] = temp;
    }
}
