package psk;

public class P1 {
	public static void P() {
		int i, j, s = 5;
		for (i = 0; i<s; i++) {
			for (j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i=s-1; i>=0; i--) {
			for (j = 0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int a = 5;
		for (int i=0; i<a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	System.out.println();
		P();
	}
}
