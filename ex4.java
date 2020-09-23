package example1;

public class ex4 {

	public static void main(String[] args) {
		
		String[][] users = {
				{"A", "111"},
				{"B", "222"},
				{"C", "333"}
		};
		
		
		for(int i = 0; i < users.length; i ++)
		{
			for(int j = 0; j < 2; j ++)
			{
				System.out.println(users[i][j]);
			}
		}
		
		

	}

}
