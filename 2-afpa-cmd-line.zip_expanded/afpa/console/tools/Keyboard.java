package afpa.console.tools;

import java.util.Scanner;

public abstract class Keyboard {

	private static final Scanner scanner = new Scanner(System.in);

	public static int readInt() {
		return scanner.nextInt();
	}

	public static String readLine() {
		return scanner.nextLine();
	}

	public static String readWord() {
		return scanner.next();
	}

	private Keyboard() {
	}

}