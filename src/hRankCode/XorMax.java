package hRankCode;

import java.util.Scanner;

public class XorMax {

	static int maxXor(int l, int r) {
		int maxVal = 0;
		int prev = 0;

		for (int i = l; i <= r; i++) {
			for (int j = (i); j <= r; j++) {
				int xorVal = (i ^ j);
				maxVal = Math.max(prev, xorVal);
				prev = maxVal;
			}
		}
		return maxVal;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		int _l;
		_l = Integer.parseInt(in.nextLine());

		int _r;
		_r = Integer.parseInt(in.nextLine());

		res = maxXor(_l, _r);
		System.out.println(res);

		in.close();
	}
}
