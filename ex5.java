package example1;

public class ex5 {

	public static void printTwoTimes(String text)
	{
		System.out.println("--");
		System.out.println(text);
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		//�޼ҵ带 ������ô�.
		
		printTwoTimes("A");
		printTwoTimes("B");
		printTwoTimes("C");
		
		//100,000,000 ��
		
		printTwoTimes("WOW");

	}
	
	

}
