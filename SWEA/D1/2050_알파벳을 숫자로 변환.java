package day1;

import java.util.Scanner;

public class SWEA_2050_D1_알파벳을숫자로변환 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			sb.append(input.charAt(i) - 'A' + 1).append(" ");
		}
		System.out.println(sb);
		sc.close();
	}
}
