import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
	public static void main(String[] args){
		String champion = "";
		float i = 1;

		while (!StdIn.isEmpty()) {
			String next;
			next = StdIn.readString();

			if (StdRandom.bernoulli(1/i) == true) {
				champion = next;
			}
			i++;
		}
		StdOut.println(champion);
	}
}