package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 개수 : ");
		
		int size = sc.nextInt();
		double sum = 0;
		
		for(int i = 0; i < size; i++) {
			int input = sc.nextInt();
			sum += input;
		}
		
		System.out.println("평균은 " + sum / size + " 입니다.");
		
		sc.close();
	}
}
