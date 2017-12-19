package Exercise.hn;

import java.util.*;

public class Boj13699 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(t(n));

	}

	static int t(int n) {

		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		} else {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += t(n - i - 1) * t(i);
			}
			return sum;
		}
	}
}