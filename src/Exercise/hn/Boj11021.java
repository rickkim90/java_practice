package Exercise.hn;

import java.util.*;

public class Boj11021 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i = 1;
		while(t-->0){
			String[] s = sc.nextLine().split(" ");
			System.out.println("Case #"+i+": "+(Integer.parseInt(s[0])+Integer.parseInt(s[1])));
			i = ++i;
		}
	}
}
