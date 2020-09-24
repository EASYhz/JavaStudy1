package example1;

public class ex10 {

	public static int[] myLotto = new int[6];
	
	public static void main(String[] args) {
		
		RandomNumber();

        //Bubble sort
        BubbleSort();
        
        for(int i = 0; i < myLotto.length; i++) {
			System.out.println(myLotto[i] + "      ");
		}
        
	}

	public static int[] RandomNumber() {
        for(int i = 0; i < myLotto.length; i++ )
        {
            myLotto[i] = (int) (Math.random()*45 + 1); // 난수 생성

            //중복 체크
            for(int j = 0; j < i; j++)
            {
                if(myLotto[j] == myLotto[i])
                {
                    i--;
                    break;
                }

            }
        }
		return myLotto;
    }

    public static int[] BubbleSort(){
        for(int i = 0; i < myLotto.length; i++) {
            for (int j = 0; j < myLotto.length - i - 1; j++){
                if (myLotto[j] > myLotto[j+1]){
                    int temp = myLotto[j];
                    myLotto[j] = myLotto[j + 1];
                    myLotto[j + 1] =temp;
                }
            }
        }

        return myLotto;
    }
}
