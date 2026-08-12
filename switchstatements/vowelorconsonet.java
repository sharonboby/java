package switchstatements;

import java.util.Scanner;

public class vowelorconsonet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It is a Vowel.");
			break;
		default:
			System.out.println("It is a Consonant.");
		}
		sc.close();
	}
}