package socgen_test.tenisKata;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String player1 = "John";
		String player2 = "Jack";
		Game game = new Game();	
		game.setPlayer1(player1);
		game.setPlayer2(player2);
		
		System.out.println("---------------------GAME 1 ----------------------------------------------");
		int[] table1Player1 = {1,1,1,0,1};
		int[] table1Player2 = {0,0,0,1,0};	
		game.playGame(table1Player1, table1Player2);
		

		
		System.out.println("---------------------GAME 2 ----------------------------------------------");
		int[] table2Player1 = {0,0,1,1,0,0};
		int[] table2Player2 = {1,1,0,0,1,1};
		game.playGame(table2Player1, table2Player2);
		System.out.println("Test");
	}


}
