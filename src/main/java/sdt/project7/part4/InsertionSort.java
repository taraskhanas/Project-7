package sdt.project7.part4;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] a = {5, 2, 7, 0, 3, 9};
        System.out.println("Before: " + Arrays.toString(a));
        sort(a);
        System.out.println("After:  " + Arrays.toString(a));
    }
} 