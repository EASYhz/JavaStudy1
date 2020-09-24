package example1;

public class ex6 {

	public static void printTwoTimes(String text, String delimiter)
	{
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		//메소드를 배워봅시다.
		
		printTwoTimes("A", "!!");
		printTwoTimes("B", "@@");
		printTwoTimes("C", "##");
		
		//100,000,000 줄
		
		printTwoTimes("WOW", "$$");

	}
	
}
