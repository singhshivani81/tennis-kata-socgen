package socgen_test.tenisKata;

public class Game {
	private String player1;
	private String player2;
	private Points points;

	public Game() {
		super();
		points = new Points();
	}

	public void playGame(int[] pointTablePlayer1, int[] pointTablePlayer2) {	
		int pointPlayer1=0;
		int pointPlayer2=0;
		 for(int i=0 ; i<= pointTablePlayer1.length-1; i++) {
			 pointPlayer1 += pointTablePlayer1[i]; 
			 pointPlayer2 += pointTablePlayer2[i];
			 System.out.println(Constants.POINTS_WON + getPlayer1() + ":" + calculateScore(pointPlayer1) + " --- " +
					 Constants.POINTS_WON + getPlayer2() + ":" + calculateScore(pointPlayer2) + Constants.ROUNDS + (i+1) );
		 }
	}
	
	public String calculateScore(int totalPoints) {
		return points.pointsNoDuece(totalPoints);
	}


	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	

}
