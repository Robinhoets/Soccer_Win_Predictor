

public class Game{

	private int yellowCards, redCards, fouls, 
				corners, offsides, possessionPercent, passAccuracyPercent, 
				formation, opponentsFormation,
				goals, goalsScoredCounterAttack, goalsScoredOpenPlay, goalsScoredSetPiece, goalsScoredPenalty, ownGoals, 
				shots, shotsOnTarget, dribblesWon, foulsWon,
				tackles, interceptions, clearance, shotsBlocked, shotsConceded,
				totalPasses, passSuccessPercent, crossPass, throughBallPass, longBallPass, shortPass
				win;
	

	public Game(int yellowCards, int redCards, int fouls,
				int corners, int offsides, int possessionPercent, int passAccuracyPercent,
				int formation, int opponentsFormation,
				int goals, int goalsScoredCounterAttack, int goalsScoredOpenPlay, int goalsScoredSetPiece, int goalsScoredPenalty, int ownGoals,
				int shots, int shotsOnTarget, int dribblesWon, int foulsWon,
				int tackles, int interceptions, int clearance, int shotsBlocked, int shotsConceded,
				int totalPasses, int passSuccessPercent, int crossPass, int throughBallPass, int longBallPass, int shortPass
				int win) 
	{
		this.yellowCards = yellowCards;
		this.redCards = redCards;
		this.fouls = fouls;

		this.corners = corners;
		this.offsides = offsides;
		this.possessionPercent = possessionPercent;
		this.passAccuracyPercent = passAccuracyPercent;

		this.formation = formation;
		this.opponentsFormation = opponentsFormation;

		this.goals = goals;
		this.goalsScoredCounterAttack = goalsScoredCounterAttack;
		this.goalsScoredOpenPlay = goalsScoredOpenPlay;
		this.goalsScoredSetPiece = goalsScoredSetPiece;
		this.goalsScoredPenalty = goalsScoredPenalty;
		this.ownGoals = ownGoals;

		this.shots = shots;
		this.shotsOnTarget = shotsOnTarget;
		this.dribblesWon = dribblesWon;
		this.foulsWon = foulsWon;

		this.tackles = tackles;
		this.interceptions = interceptions;
		this.clearance = clearance;
		this.shotsBlocked = shotsBlocked;
		this.shotsConceded = shotsConceded;

		this.totalPasses = totalPasses;
		this.passSuccessPercent = passSuccessPercent;
		this.crossPass = crossPass;
		this.throughBallPass = throughBallPass;
		this.longBallPass = longBallPass;
		this.shortPass = shortPass;

		this.win = win;
	}

	// Cards and fouls section
	public int getYellowCards() {
		return yellowCards;
	}
	public int getRedCards() {
		return redCards;
	}
	public int getFouls() {
		return fouls;
	}

	// corners, offsides, possession, passing
	public int getCorners() {
		return corners;
	}
	public int getOffsides() {
		return offsides;
	}
	public int getPossessionPercent() {
		return possessionPercent;
	}
	public int getPassAccuracyPercent() {
		return passAccuracyPercent;
	}

	// tactical formation
	public int getFormation() {
		return formation;
	}
	public int getOpponentsFormation() {
		return opponentsFormation;
	}

	// goals formation
	public int getGoals() {
		return goals;
	}
	public int getGoalsScoredCounterAttack() {
		return goalsScoredCounterAttack;
	}
	public int getGoalsScoredOpenPlay() {
		return goalsScoredOpenPlay;
	}
	public int getGoalsScoredSetPiece() {
		return goalsScoredSetPiece;
	}
	public int getGoalsScoredPenalty() {
		return getGoalsScoredPenalty;
	}

	// offensive moves
	public int getShots(){
		return shots;
	}
	public int getShotsOnTarget() {
		return shotsOnTarget;
	}
	public int getDribblesWon() {
		return dribblesWon;
	}
	public int getFoulsWon() {
		return foulsWon;
	}

	// defensive moves
	public int getTackles() {
		return tackles;
	}
	public int getInterceptions() {
		return interceptions;
	}
	public int getClearance() {
		return clearance;
	}
	public int getShotsBlocked() {
		return shotsBlocked;
	}
	public int getShotsConceded() {
		return shotsConceded;
	}

	// passing
	public int getTotalPasses() {
		return totalPasses;
	}
	public int getPassSuccessPercent() {
		return passSuccessPercent;
	}
	public int getCrossPass() {
		return crossPass;
	}
	public int getThroughBallPass() {
		return throughBallPass;
	}
	public int getLongBallPass() {
		return longBallPass;
	}
	public int getShortPass() {
		return shortPass;
	}

	//win or loss
	public int getWin() {
		return win;
	}

	public String toString() {
		return yellowCards + " " + redCards + " " + fouls + "\n" + 
				corners + " " + offsides + " " + possessionPercent + " " + passAccuracyPercent + "\n" + 
				formation + " " + opponentsFormation + "\n" + 
				goals + " " + goalsScoredCounterAttack + " " + goalsScoredOpenPlay + " " + goalsScoredSetPiece + " " + goalsScoredPenalty + " " + ownGoals + "\n" + 
				shots + " " + shotsOnTarget + " " + dribblesWon + " " + foulsWon + "\n" + 
				tackles + " " + interceptions + " " + clearance + " " + shotsBlocked + " " + shotsConceded + "\n" + 
				totalPasses + " " + passSuccessPercent + " " + crossPass + " " + throughBallPass + " " + longBallPass + " " + shortPass + "\n" +
				win;
	}
	
}