package com.sigh.core.dataStructure;

/**
 * 稀疏数组
 *
 */
public class SparseArray {


	public static void main(String[] args) {
		//创建一个二维数组 11*11   0：没有棋子， 1：黑棋， 2：白棋
		int [][] a  = new int[11][11];
			a[1][2] = 1;
			a[2][3] = 2;
			a[3][3] = 2;
		System.out.println("原数组为：");

		for (int[] x : a) {
			for (int i : x) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}

		System.out.println("=============================");

		//获取有效个数
		int sum = 0;
		int n = 11;
		int m = 11;
		//双重循环处理办法
		for (int i = 0; i < n * m ; i++) {
			int temp1 = i/n;
			int temp2 = i%m;
 			if(a[temp1][temp2] != 0){
				sum++;
			}
		}
		System.out.println(sum);

		//创建稀疏数组
		int [][] array = new int[sum+1][3];
		array[0][0] = n;
		array[0][1] = m;
		array[0][2] = sum;

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != 0){
					count++;
					array[count][0] = i;
					array[count][1] = j;
					array[count][2] = a[i][j];
				}
			}
		}
		System.out.println("稀疏数组为：");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i][0] + "\t" + array[i][1] + "\t" + array[i][2] + "\t");
		}

		System.out.println("=============================");
		System.out.println("还原数组:");

		//读取稀疏数组
		int[][] c = new int[array[0][0]][array[0][1]];

		//还原数组的值
		for (int i = 1; i <array.length ; i++) {
			c[array[i][0]][array[i][1]] = array[i][2];
		}
		System.out.println("还原数组为：");
		for (int[] i: c) {
			for (int j:i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}


	}
}

