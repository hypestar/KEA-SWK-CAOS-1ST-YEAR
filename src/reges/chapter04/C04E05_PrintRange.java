package reges.chapter04;

import java.util.*;

public class C04E05_PrintRange {

	public static void main(String[] args) {
		int start, end;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the 1st number in the range : ");
		start = console.nextInt();
		System.out.print("Enter the last number in the range : ");
		end = console.nextInt();
		printRange(start, end);
	}

	public static void printRange(int start, int end) {

		System.out.print("[");
		if (start < end) {
			int i = start;
			for (; i < end; i++) {
				System.out.print(i + ", ");
			}
			System.out.print(i + "]");
		} else if (start > end) {
			int i = start;
			for (; i > end; i--) {
				System.out.print(i + ", ");
			}
			System.out.print(i + "]");
		} else if (start == end){
			System.out.print(start + "]");
		}

	}

}
