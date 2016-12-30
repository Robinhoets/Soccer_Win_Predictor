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
    private ViewDisplayText dislpayText = new ViewDisplayText();

	public View() {
        // close when exited
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(dislpayText.getMainComponent(), BorderLayout.CENTER);
	}

	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }

    @Override
    public void setAddRecordAction(Action action) {
    	dislpayText.setAddRecordButtonAction(action);
    }

    @Override
    public void setShowRecordsAction(Action action) {
    	dislpayText.setShowRecordsButtonAction(action);
    }

    @Override
    public void setDeleteRecordAction(Action action) {
    	dislpayText.setDeleteRecordButtonAction(action);
    }

    @Override
    public void setCalculateAction(Action action) {
    	dislpayText.setCalculateButtonAction(action);
    }

    @Override
    public void setGraphAction(Action action) {
    	dislpayText.setGraphButtonAction(action);
    }


    // Cards and fouls section
	public int getYellowCardsTextAreaText() {
		return dislpayText.getYellowCardsTextAreaText();
	}
	public int getRedCardsTextAreaText() {
		return dislpayText.getRedCardsTextAreaText();
	}
	public int getFoulsTextAreaText() {
		return dislpayText.getFoulsTextAreaText();
	}

	// corners, offsides, possession, passing
	public int getCornersTextAreaText() {
		return dislpayText.getCornersTextAreaText();
	}
	public int getOffsidesTextAreaText() {
		return dislpayText.getOffsidesTextAreaText();
	}
	public int getPossessionPercentTextAreaText() {
		return dislpayText.getPossessionPercentTextAreaText();
	}
	public int getPassAccuracyPercentTextAreaText() {
		return dislpayText.getPassAccuracyPercentTextAreaText();
	}

	// tactical formation
	public int getFormationTextAreaText() {
		return dislpayText.getFormationTextAreaText();
	}
	public int getOpponentsFormationTextAreaText() {
		return dislpayText.getOpponentsFormationTextAreaText();
	}

	// goals formation
	public int getGoalsTextAreaText() {
		return dislpayText.getGoalsTextAreaText();
	}
	public int getGoalsScoredCounterAttackTextAreaText() {
		return dislpayText.getGoalsScoredCounterAttackTextAreaText();
	}
	public int getGoalsScoredOpenPlayTextAreaText() {
		return dislpayText.getGoalsScoredOpenPlayTextAreaText();
	}
	public int getGoalsScoredSetPieceTextAreaText() {
		return dislpayText.getGoalsScoredSetPieceTextAreaText();
	}
	public int getGoalsScoredPenaltyTextAreaText() {
		return dislpayText.getGoalsScoredPenaltyTextAreaText();
	}
	public int getOwnGoalTextAreaText() {
		return dislpayText.getOwnGoalsTextAreaText();
	}

	// offensive moves
	public int getShotsTextAreaText(){
		return dislpayText.getShotsTextAreaText();
	}
	public int getShotsOnTargetTextAreaText() {
		return dislpayText.getShotsOnTargetTextAreaText();
	}
	public int getDribblesWonTextAreaText() {
		return dislpayText.getDribblesWonTextAreaText();
	}
	public int getFoulsWonTextAreaText() {
		return dislpayText.getFoulsWonTextAreaText();
	}

	// defensive moves
	public int getTacklesTextAreaText() {
		return dislpayText.getTacklesTextAreaText();
	}
	public int getInterceptionsTextAreaText() {
		return dislpayText.getInterceptionsTextAreaText();
	}
	public int getClearanceTextAreaText() {
		return dislpayText.getClearanceTextAreaText();
	}
	public int getShotsBlockedTextAreaText() {
		return dislpayText.getShotsBlockedTextAreaText();
	}
	public int getShotsConcededTextAreaText() {
		return dislpayText.getShotsConcededTextAreaText();
	}

	// passing
	public int getTotalPassesTextAreaText() {
		return dislpayText.getTotalPassesTextAreaText();
	}
	public int getPassSuccessPercentTextAreaText() {
		return dislpayText.getPassSuccessPercentTextAreaText();
	}
	public int getCrossPassTextAreaText() {
		return dislpayText.getCrossPassTextAreaText();
	}
	public int getThroughBallPassTextAreaText() {
		return dislpayText.getThroughBallPassTextAreaText();
	}
	public int getLongBallPassTextAreaText() {
		return dislpayText.getLongBallPassTextAreaText();
	}
	public int getShortPassTextAreaText() {
		return dislpayText.getShortPassTextAreaText();
	}

	//win or loss
	public int getWinTextAreaText() {
		return dislpayText.getWinTextAreaText();
	}


    @Override
    public void resetTextBoxes() {
    	dislpayText.resetTextBoxes();
    }


    public void addGameListToScrollPane(ArrayList<String> gameList) {
    	dislpayText.addGameListToScrollPane(gameList);
    }

    public void addScrollPane(){
    	dislpayText.addScrollPane();
    	setVisible(true);
    }

    public static int getRecordNumber() {
    	int recordNumber = ViewDisplayText.getRecordNumber();
    	return recordNumber;
    }


}
