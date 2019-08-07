package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in  );
		
		System.out.print( "금액: " );
		int money = sc.nextInt();
		int[] money_arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] count_arr = new int[10];
		int start = 0;
		
		while(money > 0) {
			count_arr[start] = money / money_arr[start];
			money %= money_arr[start];
			start++;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(money_arr[i] + "원 : " + count_arr[i] + "개");
		}
		
		sc.close();
 	}
}