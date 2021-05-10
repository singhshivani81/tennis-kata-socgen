package socgen_test.tenisKata;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Game game = new Game();	
	
		
		System.out.println("---------------------GAME 1 ----------------------------------------------");
		int[] table1Player1 = {1,1,1,0,1};
		int[] table1Player2 = {0,0,0,1,0};	
		game.playGame(table1Player1, table1Player2);
		

		
		System.out.println("---------------------GAME 2 ----------------------------------------------");
		int[] table2Player1 = {0,0,1,1,0,0};
		int[] table2Player2 = {1,1,0,0,1,1};
		game.playGame(table2Player1, table2Player2);
		
		
		System.out.println("---------------------GAME 3 (DUECE- ADVANTAGE) ----------------------------------------------");
		int[] table3Player1 = {1,1,1,0,0,0,1,0,1,1};
		int[] table3Player2 = {0,0,0,1,1,1,0,1,0,0};
		game.playGame(table3Player1, table3Player2);
		
		System.out.println("---------------------GAME 4 (DUECE- ADVANTAGE) ----------------------------------------------");
		int[] table4Player1 = {1,1,1,0,0,0,1,1};
		int[] table4Player2 = {0,0,0,1,1,1,0,0};
		game.playGame(table4Player1, table4Player2);
	}


}
