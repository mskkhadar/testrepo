package com.hr.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arrays {
	/**
	 * @param arr
	 * @return
	 */
	public static int hourGlassSum(int[][]arr) {
		
		int max=-1000;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int temp=0;
				//System.out.print(arr[i][j]+" ");
				for(int k=0;k<3;k++) {
					for(int l=0;l<3;l++) { 
						if(!(k==1 && (l==0 || l==2))) {
							try {
							System.out.print(arr[i+k][j+l]);
							temp+=arr[i+k][j+l];}catch(Exception e) {
								
							}
						}else {
							System.out.print(0);
						}
						System.out.print(" ");
					}
					System.out.println();
				}
				if(temp>max) {
					max=temp;
				}
				System.out.println();
			}
			System.out.println();
		}
		
		return max;
	}
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		int [][]arr3=new int[][] {
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0}
		};
		int[][] arr2=new int [][]{{-1 ,-1, 0 ,-9 ,-2, -2},
		{-2 ,-1 ,-6, -8 ,-2, -5},
		{-1, -1, -1, -2, -3, -4},
		{-1, -9, -2, -4, -4 ,-5},
		{-7, -3, -3, -2 ,-9, -9},
		{-1, -3, -1 ,-2}};
		int [][]arr1=new int[][] {
			{1, 2, 3, 4, 5, 6},
			{7, 8, 9, 10, 11, 12},
			{13, 14, 15, 16, 17, 18},
			{19, 20, 21, 22, 23, 24},
			{25, 26, 27, 28, 29, 30},
			{31, 32, 33, 34, 35, 36}
		};
		//System.out.println(hourGlassSum(arr2));
		String OUTPUT_PATH="/Users/kshaik2/git/temp-repo/Hecko/src/input/input.txt";
	
		  //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv(OUTPUT_PATH)));
			Scanner sc= new Scanner(System.in);
			
	        int[][] arr = new int[6][6];

	        for (int i = 0; i < 6; i++) {
	            String[] arrRowItems = sc.nextLine().split(" ");
	            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 6; j++) {
	                
	                try {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	                }catch(Exception e){
	                   arr[i][j] = 0; 
	                } 
	                
	            }
	        }

	        int result = hourGlassSum(arr);

	       System.out.println(result);

	        scanner.close();
	}
	
}
