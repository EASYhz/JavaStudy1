package example1;

//�� -> ������ �ٲ� , �� -> �ʷ� �ٲ�

public class ex8 {

	public static int seconds;
	public static int minutes;
	
	public static int changeMinutes(int seconds) {
		
		minutes = seconds / 60;
		
		return minutes;
	}
	
	public static int changeSeconds(int minutes) {
		
		seconds = minutes * 60;
		
		return seconds;
	}
	
	public static void main(String[] args) {
	
		
		// 60s => 1m
		//seconds = 60 * minutes;
		//minutes = seconds / 60;
		
		//240�ʸ� ������ �ٲٰ�ʹ�.
		int s240 = changeMinutes(240);
		System.out.println("240�� = " + s240 + "��");
		
		//240���� �ʷ� �ٲٰ�ʹ�.
		int m240 = changeSeconds(240);
		System.out.println("240�� = " + m240 + "��");
		

	}

}
