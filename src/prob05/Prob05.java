package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		Random rnd = new Random();
		int max = 100;
		int min = 1;
		int ans = rnd.nextInt(max) + 1;
		int count = 1;
		
		System.out.println("수를 결정하였습니다. 맞추어보세요");
		
		while(true) {
			System.out.println(min + "-" + max);
			System.out.print(count + ">>");
			
			int input = sc.nextInt();
			
			if(input == ans) {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n) : ");
				
				String s = sc.next();
				
				if(s.equals("y")) {
					count = 1;
					min = 1;
					max = 100;
					ans = rnd.nextInt(max) + 1;
					System.out.println("");
					System.out.println("수를 결정하였습니다. 맞추어보세요");
					continue;
				} else if(s.equals("n")) {
					System.out.println("종료.");
					break;
				}
			} else {
				if(input > ans) {
					max = Math.min(max, input);
					System.out.println("더낮게");
				} else if(input < ans) {
					min = Math.max(min, input);
					System.out.println("더높게");
				}
				count++;
			}
		}
		
		sc.close();
	}

}