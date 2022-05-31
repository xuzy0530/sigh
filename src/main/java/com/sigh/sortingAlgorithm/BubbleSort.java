package com.sigh.sortingAlgorithm;


import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {


	public static void main(String[] args) {
		int[] a = {1,2,4,6,1,23,5,23123,123,12};
		System.out.println("排序前："+ Arrays.toString(a));
		System.out.println("排序后："+ Arrays.toString(BubbleSort(a)));
	}
	public static int[] BubbleSort(int[] v){
		int length = v.length;
		int temp;
		for (int i = 0; i < length -1  ; i++) {
			for (int j = 0; j < v.length - 1 -i; j++) {
				if(v[j] > v[j + 1]){
					 temp = v[j];
					v[j] = v[j + 1];
					v[j + 1] = temp;
				}
			}
		}
		return v;
	}
}
