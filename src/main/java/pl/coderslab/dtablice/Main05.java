package pl.coderslab.dtablice;

public class Main05 {

	public static void main(String[] args) {
		int[] numbers = {4, 643, 112, 9999, -69};
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) ;

			min = numbers[i];
		}
			System.out.println("MIN:"+" "+min);
	}
}
