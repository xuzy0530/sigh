package com.sigh.sortingAlgorithm;

import com.sigh.core.service.BaseService;

import java.util.Arrays;

public class SelectionSort extends BaseService {
	public static void main(String[] args) {
		int[] a = {2,4,6,1,23,5,23123,1,123,12};
		System.out.println("排序前："+ Arrays.toString(a));
		System.out.println("排序后："+ Arrays.toString(selectSort(a)));
	}

	public static  int[] selectSort(int[] v){
		int temp, min;
		for (int i = 0; i < v.length; i++) {
			min = i;
			for (int j = i + 1; j < v.length ; j++) {
				if( v[j] < v[min]){
					min = j;
				}
			}
			if(min != i){
				temp = v[i];
				v[i] = v[min];
				v[min] = temp;
			}
		}
		return v;

	}
}
