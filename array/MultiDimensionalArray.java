package com.array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//2D Array declaration and initialization 
		
		int[][] matrix= {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				};
		
		//Accessing elements
		System.out.println(matrix[0][0]);
		System.out.println(matrix[1][2]);
		
		//printing 2D array
		for(int i = 0; i<matrix.length; i++) {
			for(int j =0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// Alternative declaration
		int[][] grid = new int[3][3]; //3x3 matrix
		
		//initializing elements
		int value = 1;
		for(int i = 0; i < grid.length; i++) {
			for(int j =0; j<grid[i].length; j++) {
				grid[i][j] = value++;
			}
			
		}
		// Jagged array (array with different column sizes)
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
        
        int[][][] cube = new int[2][2][2];
        System.out.println("\n3D Array dimensions: " + 
                          cube.length + "x" + 
                          cube[0].length + "x" + 
                          cube[0][0].length);
		
	
		

	}

}
