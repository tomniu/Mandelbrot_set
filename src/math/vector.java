package math;

import java.util.Arrays;

public class vector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] start = { 0, 0, 0 };
		int[] end = { -2, 4, -4 };
		int[] trap1 = { -5, -1, -1 };
		int[] trap2 = { 5, 2, -1 };
		int[] p = { -7 ,+ 2 ,- 3 };
		int[] q = { 2, -1 , 4 };
		int[] r = { 2 ,- 3 ,+ 2 };
		int[] s = { 3 ,+ 5 ,- 3 };
		// s, p, r OK or p, s, r OKare both correct sequences
		// p, q, r OK or s, q, r are both correct sequences
		// p, r, q or s, r, q are both correct sequences

		start[0] = start[0] + p[0];
		start[1] = start[1] + p[1];
		start[2] = start[2] + p[2];
		System.out.println(Arrays.toString(start));
		start[0] = start[0] + q[0];
		start[1] = start[1] + q[1];
		start[2] = start[2] + q[2];
		System.out.println(Arrays.toString(start));

		if (start[0] == trap1[0] && start[0] == trap2[0]
				&& start[1] == trap1[1] && start[1] == trap2[1]
				&& start[2] == trap1[2] && start[2] == trap2[2]) {
				System.out.println("bad.");
				System.out.println(Arrays.toString(start));
		} 
		else {
			start[0] = start[0] + r[0];
			start[1] = start[1] + r[1];
			start[2] = start[2] + r[2];
			System.out.println("good.");
			System.out.println(Arrays.toString(start));
		}

	}

}
