package example1;

import java.util.Scanner;

//�޼ҵ带 �̿��� ����.. -> +, -, /, x

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
		
		//���� �Է� �ޱ�
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("������ �Է��ϼ���: ");
			//�Է¹ޱ�
			int num1 = scan.nextInt();
			char operator = scan.next().charAt(0); //�����ڸ� ���ڷ� ��ȯ..
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
					System.out.println("�߸��� �������Դϴ�.");
			}	
			
			System.out.println("�׸��Ͻðڽ��ϱ�? (Y:1/N:2)");
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
