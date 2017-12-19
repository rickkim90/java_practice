package Exercise.hn;

import java.util.Scanner;

public class Boj10953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
			String str = sc.next();
			System.out.println((str.charAt(0)-'0') + (str.charAt(2)-'0'));
		}
	}
}