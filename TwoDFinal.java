package com.anvesh.basic.datatype;

public class TwoDFinal {
	public static void main(String args[]) {
		int twoD[][] = new int[2][3];
		int i, j, k =0;
		
		for(i=0; i<2; i++) {
			for(j=0; j<3; j++) {
				twoD[i][j] = k;
				k++;
			}
		}
		
		for(i=0; i<2; i++) {
			for(j=0; j<3; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
	}
}
