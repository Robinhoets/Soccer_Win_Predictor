import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import javax.swing.*;
import java.util.ArrayList;


@SuppressWarnings("serial")
class AddRecordAction extends AbstractAction {

	private View view;
	private Model model;

	public AddRecordAction(View view, Model model, String name) {
		super(name);
		this.view = view;
		this.model = model;
	}

	@Override
   	public void actionPerformed(ActionEvent evt) {

		int yellowCards = view.getYellowCardsTextAreaText();
		int redCards = view.getRedCardsTextAreaText();
		int fouls = view.getFoulsTextAreaText();
		// corners, offsides, possession, passing
		int corners = view.getCornersTextAreaText();
		int offsides = view.getOffsidesTextAreaText();
		int possessionPercent = view.getPossessionPercentTextAreaText();
		int passAccuracyPercent = view.getPassAccuracyPercentTextAreaText();
		// tactical formation
		int formation = view.getFormationTextAreaText();
		int opponentsFormation = view.getOpponentsFormationTextAreaText();
		// goals formation
		int goals = view.getGoalsTextAreaText();
		int goalsScoredCounterAttack = view.getGoalsScoredCounterAttackTextAreaText();
		int goalsScoredOpenPlay = view.getGoalsScoredOpenPlayTextAreaText();
		int goalsScoredSetPiece = view.getGoalsScoredSetPieceTextAreaText();
		int goalsScoredPenalty = view.getGoalsScoredPenaltyTextAreaText();
		int ownGoals = view.getOwnGoalTextAreaText();
		// offensive moves
		int shots = view.getShotsTextAreaText();
		int shotsOnTarget = view.getShotsOnTargetTextAreaText();
		int dribblesWon = view.getDribblesWonTextAreaText();
		int foulsWon = view.getFoulsWonTextAreaText();
		// defensive moves
		int tackles = view.getTacklesTextAreaText();
		int interceptions = view.getInterceptionsTextAreaText();
		int clearance = view.getClearanceTextAreaText();
		int shotsBlocked = view.getShotsBlockedTextAreaText();
		int shotsConceded = view.getShotsConcededTextAreaText();
		// passing
		int totalPasses = view.getTotalPassesTextAreaText();
		int passSuccessPercent = view.getPassSuccessPercentTextAreaText();
		int crossPass = view.getCrossPassTextAreaText();
		int throughBallPass = view.getThroughBallPassTextAreaText();
		int longBallPass = view.getLongBallPassTextAreaText();
		int shortPass = view.getShortPassTextAreaText();
		//win or loss
		int win = view.getWinTextAreaText();
		

		Game game = new Game(yellowCards, redCards, fouls, 
				corners, offsides, possessionPercent, passAccuracyPercent, 
				formation, opponentsFormation,
				goals, goalsScoredCounterAttack, goalsScoredOpenPlay, goalsScoredSetPiece, goalsScoredPenalty, ownGoals, 
				shots, shotsOnTarget, dribblesWon, foulsWon,
				tackles, interceptions, clearance, shotsBlocked, shotsConceded,
				totalPasses, passSuccessPercent, crossPass, throughBallPass, longBallPass, shortPass,
				win);
		
		//model.addGame(game);
		
		
		// database part
		model.addRecord(game);

		view.resetTextBoxes();

   	}
	
}