package com.sigh.sortingAlgorithm;

import com.sigh.core.service.BaseService;

import java.util.Arrays;

public class InsertionSort extends BaseService {
	public static void main(String[] args) {
		int[] a = {2,4,6,1,23,5,23123,1,123,12};
		System.out.println("排序前："+ Arrays.toString(a));
		System.out.println("排序后："+ Arrays.toString(insertionSort(a)));
	}


	public static int[] insertionSort(int[] v){

		for (int i = 1; i < v.length; i++) {
			int insertValue = v[i];
			int insertIndex = i -1;

			while (insertIndex >= 0 && insertValue < v[insertIndex]){
				v[insertIndex + 1] = v[insertIndex];
				insertIndex--;
			}
			v[insertIndex + 1] = insertValue;
		}
 		return v;
	}
}
