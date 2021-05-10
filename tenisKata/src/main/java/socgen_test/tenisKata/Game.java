package socgen_test.tenisKata;

public class Game {
	private Player player1;
	private Player player2;
	private Points points;
	private SetScore setScore;

	public Game() {
		super();
		this.player1 = new Player();
		this.player2 = new Player();
		this.points = new Points();
		this.setScore = new SetScore();
	}

	public void playGame(int[] pointTablePlayer1, int[] pointTablePlayer2) {	
		int pointPlayer1=0;
		int pointPlayer2=0;
		 for(int i=0 ; i<= pointTablePlayer1.length-1; i++) {
			 pointPlayer1 += pointTablePlayer1[i]; 
			 pointPlayer2 += pointTablePlayer2[i];
			 if(points.isDuece && Math.abs(pointPlayer1-pointPlayer2)==2) {
				 if(pointPlayer1>pointPlayer2) {
					 System.out.println(" Player1  is the winner " +  Constants.ROUNDS + (i+1));
				 }
				 else {
					 System.out.println(" Player2 is the winner " +  Constants.ROUNDS + (i+1));
				 }
				 break;
			 }
			 if(player1.getScore() == "40" && player2.getScore() == "40") { points.setDuece(true); }
			 
			 player1.setScore(calculateScore(pointPlayer1 ,pointTablePlayer1[i]));
			 player2.setScore(calculateScore(pointPlayer2 ,pointTablePlayer2[i])); 
			 System.out.println("Player1 score is:"+ player1.getScore() +
					  " and Player1 score is:"+player2.getScore()+ Constants.ROUNDS + (i+1));
		 }
	}
	
	public String calculateScore(int totalPoints , int point) {		
		return points.calculatePoints(totalPoints , point);
	}
	
	
	public void getMatchSetScore(int[] matchSetTablePlayer1, int[] matchSetTablePlayer2, int setScore6 , int setScore4) {
		int matchScorePlayer1=0;
		int matchScorePlayer2=0;
		for(int i=0 ; i<= matchSetTablePlayer1.length-1; i++) {
			matchScorePlayer1 += matchSetTablePlayer1[i]; 
			matchScorePlayer2 += matchSetTablePlayer2[i];
			player1.setSetScore(matchScorePlayer1);
			player2.setSetScore(matchScorePlayer2);
			if(player1.getSetScore() >= setScore6 || player2.getSetScore()>= setScore6) {
				String result = setScore.compareResults(player1.getSetScore(),player2.getSetScore(),setScore6 ,setScore4);
				if(result != Constants.REMATCH) {	
					System.out.println("Player1 score is:"+ player1.getSetScore()+ " and P2 score is:"+player2.getSetScore()+ " at the end of "+(i+1) +" matches");
					System.out.println(result);
					break;
				}
				else {									
					continue;
				}				
			}
			System.out.println("P1 score is:"+ player1.getSetScore()+ " and P2 score is:"+player2.getSetScore()+ " at the end of "+(i+1) +" matches");
			
		}
		
	}



	
	

}
