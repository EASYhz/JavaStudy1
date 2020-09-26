package example1;

import java.util.Scanner;

//메소드를 이용한 계산기.. -> +, -, /, x

public class ex11 {

	public static void add(int a, int b) {
		int result = a + b;
		
		System.out.println(result);
	}
	public static void sub(int a, int b) {
		int result = a - b;
		
		System.out.println(result);
	}
	public static void mul(int a, int b) {
		int result = a * b;
		
		System.out.println(result);
	}
	public static void div(int a, int b) {
		int result = a / b;
		
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		
		//숫자 입력 받기
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("수식을 입력하세요: ");
			//입력받기
			int num1 = scan.nextInt();
			char operator = scan.next().charAt(0); //연산자를 문자로 변환..
			int num2 = scan.nextInt();
			
			switch (operator) {
			case '+':
				add(num1, num2);
				break;
			case '-':
				sub(num1, num2);
				break;
			case '*':
				mul(num1, num2);
				break;
			case '/':
				div(num1, num2);
				break;
				default:
					System.out.println("잘못된 연산자입니다.");
			}	
			
			System.out.println("그만하시겠습니까? (Y:1/N:2)");
			int restart = scan.nextInt();
			if (restart == 1) {
				break;
			}
			else if (restart == 2) {
				continue;
			}
		}
		
	}

}
