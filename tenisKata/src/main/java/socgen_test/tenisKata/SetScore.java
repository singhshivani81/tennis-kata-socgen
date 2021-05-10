package socgen_test.tenisKata;

public class SetScore {
	public String compareResults(int player1GameScore, int player2GameScore, int setScore6 , int setScore4) {		
		if(player1GameScore == setScore6 && player2GameScore <= setScore4) {
			return Constants.PLAYER1_WINS;
		}
		else if(player1GameScore == setScore6 && player2GameScore <= setScore4){
			return Constants.PLAYER2_WINS;
		}	
		else {
			return reMatch(player1GameScore, player2GameScore , setScore6);
		}
	}

	
	public String reMatch(int player1GameScore, int player2GameScore,int setScore6) {		
		if(player1GameScore ==(setScore6+1) && player2GameScore <setScore6) {
			return Constants.PLAYER1_WINS;
		}
		else if(player2GameScore==(setScore6+1) && player1GameScore<setScore6) {
			return Constants.PLAYER2_WINS;
		}	
		else if(player1GameScore >= setScore6 && player2GameScore>= setScore6) {
			return tieBreaker(player1GameScore,player2GameScore);
		}
		else {
			return Constants.REMATCH;
		}
	}
	
	public String tieBreaker(int player1GameScore, int player2GameScore) {	
		if(Math.abs(player1GameScore - player2GameScore)==2) {
			if(player1GameScore > player2GameScore ) {
				return Constants.PLAYER1_WINS;
			}
			else {
				return Constants.PLAYER2_WINS;
			}
		}
		else {
			return Constants.REMATCH;
		}
	}
	


}
