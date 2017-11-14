package arrayprograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Array2DInversion {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		int[][] array2D = new int[size][size];

		for (int i = 0; i < size; i++) {

			String[] tokens = br.readLine().split(" ");
			for (int j = 0; j < size; j++) {

				array2D[i][j] = Integer.parseInt(tokens[j]);
			}
		}

		printArray(array2D, size);

	}

	private static void printArray(int[][] array2D, int size) {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
	}
}
