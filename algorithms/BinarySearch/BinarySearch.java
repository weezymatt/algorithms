/**
* Implementation of the binary search algorithm inspired by code written in
* grokking's 'Algorithm 2 ed.' by Aditya Y. Bhargava
*
* @author Matthew Hernandez
**/
package algorithms.BinarySearch;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {

	public static int rank(int key, int[] arr) {
		System.out.println("Searching for " + key + "...");

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			System.out.println(mid);

			int guess = arr[mid];

			if (key < guess) hi = mid - 1;
			else if (key > guess) lo = mid + 1;
			else return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] whitelist = In.readInts(args[0]);

		Arrays.sort(whitelist);

		System.out.println("The whitelist is now sorted as: ");
		System.out.println(Arrays.toString(whitelist));

		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			int experiment = rank(key, whitelist);
			if (experiment == -1)
				StdOut.println(key);
			else StdOut.println("The key exists at: " + experiment);
		}
	}
}