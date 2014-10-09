import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nbrOfTests = in.nextInt();
		for (int i = 0; i < nbrOfTests; i++) {
			System.out.println(solveIt(in.nextInt()));
		}
	}

	public static int solveIt(int n) {
		int h = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				h *= 2;
			} else {
				h++;
			}
		}

		return h;
	}
}


