import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

import java.util.ArrayList;

public class View implements InterfaceView {

	// Create frame
    private static JFrame frame = new JFrame();
    final static boolean RIGHT_TO_LEFT = false;
    private ViewDisplayText displayText = new ViewDisplayText();

	public View() {
        // close when exited
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(displayText.getMainComponent(), BorderLayout.CENTER);
	}

	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }

    @Override
    public void setAddRecordAction(Action action) {
    	displayText.setAddRecordButtonAction(action);
    }

    @Override
    public void setShowRecordsAction(Action action) {
    	displayText.setShowRecordsButtonAction(action);
    }

    @Override
    public void setDeleteRecordAction(Action action) {
    	displayText.setDeleteRecordButtonAction(action);
    }

    @Override
    public void setCalculateAction(Action action) {
    	displayText.setCalculateButtonAction(action);
    }

    @Override
    public void setGraphAction(Action action) {
    	displayText.setGraphButtonAction(action);
    }


    // Cards and fouls section
	public int getYellowCardsTextAreaText() {
		return displayText.getYellowCardsTextAreaText();
	}
	public int getRedCardsTextAreaText() {
		return displayText.getRedCardsTextAreaText();
	}
	public int getFoulsTextAreaText() {
		return displayText.getFoulsTextAreaText();
	}

	// corners, offsides, possession, passing
	public int getCornersTextAreaText() {
		return displayText.getCornersTextAreaText();
	}
	public int getOffsidesTextAreaText() {
		return displayText.getOffsidesTextAreaText();
	}
	public int getPossessionPercentTextAreaText() {
		return displayText.getPossessionPercentTextAreaText();
	}
	public int getPassAccuracyPercentTextAreaText() {
		return displayText.getPassAccuracyPercentTextAreaText();
	}

	// tactical formation
	public int getFormationTextAreaText() {
		return displayText.getFormationTextAreaText();
	}
	public int getOpponentsFormationTextAreaText() {
		return displayText.getOpponentsFormationTextAreaText();
	}

	// goals formation
	public int getGoalsTextAreaText() {
		return displayText.getGoalsTextAreaText();
	}
	public int getGoalsScoredCounterAttackTextAreaText() {
		return displayText.getGoalsScoredCounterAttackTextAreaText();
	}
	public int getGoalsScoredOpenPlayTextAreaText() {
		return displayText.getGoalsScoredOpenPlayTextAreaText();
	}
	public int getGoalsScoredSetPieceTextAreaText() {
		return displayText.getGoalsScoredSetPieceTextAreaText();
	}
	public int getGoalsScoredPenaltyTextAreaText() {
		return displayText.getGoalsScoredPenaltyTextAreaText();
	}
	public int getOwnGoalTextAreaText() {
		return displayText.getOwnGoalsTextAreaText();
	}

	// offensive moves
	public int getShotsTextAreaText(){
		return displayText.getShotsTextAreaText();
	}
	public int getShotsOnTargetTextAreaText() {
		return displayText.getShotsOnTargetTextAreaText();
	}
	public int getDribblesWonTextAreaText() {
		return displayText.getDribblesWonTextAreaText();
	}
	public int getFoulsWonTextAreaText() {
		return displayText.getFoulsWonTextAreaText();
	}

	// defensive moves
	public int getTacklesTextAreaText() {
		return displayText.getTacklesTextAreaText();
	}
	public int getInterceptionsTextAreaText() {
		return displayText.getInterceptionsTextAreaText();
	}
	public int getClearanceTextAreaText() {
		return displayText.getClearanceTextAreaText();
	}
	public int getShotsBlockedTextAreaText() {
		return displayText.getShotsBlockedTextAreaText();
	}
	public int getShotsConcededTextAreaText() {
		return displayText.getShotsConcededTextAreaText();
	}

	// passing
	public int getTotalPassesTextAreaText() {
		return displayText.getTotalPassesTextAreaText();
	}
	public int getPassSuccessPercentTextAreaText() {
		return displayText.getPassSuccessPercentTextAreaText();
	}
	public int getCrossPassTextAreaText() {
		return displayText.getCrossPassTextAreaText();
	}
	public int getThroughBallPassTextAreaText() {
		return displayText.getThroughBallPassTextAreaText();
	}
	public int getLongBallPassTextAreaText() {
		return displayText.getLongBallPassTextAreaText();
	}
	public int getShortPassTextAreaText() {
		return displayText.getShortPassTextAreaText();
	}

	//win or loss
	public int getWinTextAreaText() {
		return displayText.getWinTextAreaText();
	}


    @Override
    public void resetTextBoxes() {
    	displayText.resetTextBoxes();
    }


    public void addGameListToScrollPane(ArrayList<String> gameList) {
    	displayText.addGameListToScrollPane(gameList);
    }

    public void addScrollPane(){
    	displayText.addScrollPane();
    	setVisible(true);
    }

    public static int getRecordNumber() {
    	int recordNumber = ViewDisplayText.getRecordNumber();
    	return recordNumber;
    }

    public void testR() {
    	displayText.testR();
    }

}
