package example1;

//초 -> 분으로 바꿈 , 분 -> 초로 바꿈

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
		
		//240초를 분으로 바꾸고싶다.
		int s240 = changeMinutes(240);
		System.out.println("240초 = " + s240 + "분");
		
		//240분을 초로 바꾸고싶다.
		int m240 = changeSeconds(240);
		System.out.println("240분 = " + m240 + "초");
		

	}

}
