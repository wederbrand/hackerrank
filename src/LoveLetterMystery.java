import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoveLetterMystery {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		int nbrOfTests = in.nextInt();
		in.nextLine();
		for (int i = 0; i < nbrOfTests; i++) {
			System.out.println(solveIt(in.nextLine()));
		}
	}

	public static int solveIt(String line) {
		int moves = 0;
		char[] chars = line.toCharArray();
		for (int i = 0; i < chars.length / 2; i++) {
			int j = chars.length - 1 - i;
			if (chars[i] < chars[j]) {
				moves += chars[j] - chars[i];
			} else {
				moves += chars[i] - chars[j];
			}
		}
		return moves;
	}
}


