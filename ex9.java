package example1;

//�ζ� ��ȣ ��÷��
// 1 ~ 45 ���� ��ȣ. �ߺ� X 

public class ex9 {

	public static void main(String[] args) {
		
		int[] myLotto = new int[6];
		
		for(int i = 0; i < myLotto.length; i++ )
		{
			myLotto[i] = (int) (Math.random()*45 + 1); // ���� ����
			
			//�ߺ� üũ
			for(int j = 0; j < i; j++) 
			{
				if(myLotto[j] == myLotto[i])
				{
					i--;
					break;
				}
				
			}
		}
		
		for(int i = 0; i < myLotto.length; i++) {
			System.out.println(myLotto[i] + "      ");
		}
		
		int temp;
		
		for(int i = 0; i < myLotto.length; i++) {
            for (int j = 0; j < myLotto.length - i - 1; j++){
                if (myLotto[j] > myLotto[j+1]){
                    temp = myLotto[j];
                    myLotto[j] = myLotto[j + 1];
                    myLotto[j + 1] = temp;
                }
            }

        }
		for(int i = 0; i < myLotto.length; i++) {
			System.out.println(myLotto[i] + "      ");
		}
		
	}

}
