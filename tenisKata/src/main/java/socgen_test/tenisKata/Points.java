package socgen_test.tenisKata;

public class Points {
	private String dueceType;
	private boolean isAdvantage;
	public boolean isDuece;
	String[] scores = { "0", "15", "30", "40", Constants.WIN };
	String[] scoresDuece = {"40","Advantage" ,"Win" };
	
	
	public Points() {
		super();
		this.isAdvantage = false;
		this.isDuece = false;
	}
	
	public String calculatePoints(int totalPoint , int point ) {	
		String result;
        if(isDuece) {
			result = pointsWithDuece(point);
		}
		else {
			result = pointsNoDuece(totalPoint);
		}
		return result;
	}
	
	
	public String pointsNoDuece(int totalPoints) {
		return scores[totalPoints];
	}
	
	
	
	
	
	public int setAdvantage(int point) {
		if(point == 1) {
			dueceType = Constants.ADVANTAGE;
			return 1;
		}
		else {
			dueceType = Constants.NO_ADVANTAGE;		
			return 0;
		}
	}
	
	public String pointsWithDuece(int point) {
		int i =setAdvantage(point);
				
		if(dueceType.equals(Constants.ADVANTAGE) ) {
			i= dueceBreaker(point);
		}		
		return scoresDuece[i];
	}
	
	
	public int dueceBreaker(int point) {
		if( isAdvantage && point == 1) {
			isAdvantage = false;
			return 0;
		}
		else if(point == 0) {
			dueceType = Constants.NO_ADVANTAGE;	
			isAdvantage = false;
			return 0;
		}
		else if(!isAdvantage && point ==1){
			isAdvantage = true;
			return 1;		
		}
		else {				
			return 2;
		}
		
	}



	public boolean isDuece() {
		return isDuece;
	}



	public void setDuece(boolean isDuece) {
		this.isDuece = isDuece;
	}
	
	

}
