import java.io.FileNotFoundException;
import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		int laneLength = in.nextInt();
		int nbrOfTests = in.nextInt();

		int[] lane = new int[laneLength];
		for (int i = 0; i < laneLength; i++) {
			lane[i] = in.nextInt();
		}

		for (int i = 0; i < nbrOfTests; i++) {
			int enter = in.nextInt();
			int exit = in.nextInt();
			System.out.println(solveIt(lane, enter, exit));
		}
	}

	public static int solveIt(int[] lane, int enter, int exit) {
		int min = 3;
		for (int i = enter; i <= exit; i++) {
			min = Math.min(min, lane[i]);
			if (min == 1) {
				return min;
			}
		}

		return min;
	}
}


