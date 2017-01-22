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
    private RecordText recordsText = new RecordText();
    private CalculateButtonsPanel calculationsPanel = new CalculateButtonsPanel();

    private JPanel scrollPanel;
    private JPanel calculateButtonsPanel;

	public View() {
        // close when exited
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(displayText.getMainComponent(), BorderLayout.CENTER);
		//frame.getContentPane().add(recordsText.getMainComponent(), BorderLayout.EAST);
	}

	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }
    // buttons from initial view
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

    // buttons from Calculate buttons panel
    public void setGoBackToMainPageAction(Action action) {
    	calculationsPanel.setGoBackToMainPageButtonAction(action);
    }

    public void setLinearRegressionAction(Action action) {
    	calculationsPanel.setLinearRegressionButtonAction(action);
    }


    // check boxes
    public void setYellowCardAction(Action action) {
    	calculationsPanel.setYellowCardCheckBoxAction(action);
    }
    public void setRedCardAction(Action action) {
    	calculationsPanel.setRedCardCheckBoxAction(action);
    }
    public void setFoulsAction(Action action) {
    	calculationsPanel.setFoulsCheckBoxAction(action);
    }


	public void setCornersAction(Action action) {
		calculationsPanel.setCornersCheckBoxAction(action);
	}
	public void setOffsidesAction(Action action) {
		calculationsPanel.setOffsidesCheckBoxAction(action);
	}
	public void setPossessionPercentAction(Action action) {
		calculationsPanel.setPossessionPercentCheckBoxAction(action);
	}
	public void setPassAccuracyPercentAction(Action action) {
		calculationsPanel.setPassAccuracyPercentCheckBoxAction(action);
	}
	public void setFormationAction(Action action) {
		calculationsPanel.setFormationCheckBoxAction(action);
	}
	public void setOpponentsFormationAction(Action action) {
		calculationsPanel.setOpponentsFormationCheckBoxAction(action);
	}

	public void setGoalsAction(Action action) {
		calculationsPanel.setGoalsCheckBoxAction(action);
	}
	public void setGoalsScoredCounterAttackAction(Action action) {
		calculationsPanel.setGoalsScoredCounterAttackCheckBoxAction(action);
	}
	public void setGoalsScoredOpenPlayAction(Action action) {
		calculationsPanel.setGoalsScoredOpenPlayCheckBoxAction(action);
	}
	public void setGoalsScoredSetPieceAction(Action action) {
		calculationsPanel.setGoalsScoredSetPieceCheckBoxAction(action);
	}
	public void setGoalsScoredPenaltyAction(Action action) {
		calculationsPanel.setGoalsScoredPenaltyCheckBoxAction(action);
	}
	public void setOwnGoalsAction(Action action) {
		calculationsPanel.setOwnGoalsCheckBoxAction(action);
	}

	public void setShotsAction(Action action) {
		calculationsPanel.setShotsCheckBoxAction(action);
	}
	public void setShotsOnTargetAction(Action action) {
		calculationsPanel.setShotsOnTargetCheckBoxAction(action);
	}
	public void setDribblesWonAction(Action action) {
		calculationsPanel.setDribblesWonCheckBoxAction(action);
	}
	public void setFoulsWonAction(Action action) {
		calculationsPanel.setFoulsCheckBoxAction(action);
	}

	public void setTacklesAction(Action action) {
		calculationsPanel.setTacklesCheckBoxAction(action);
	}
	public void setInterceptionsAction(Action action) {
		calculationsPanel.setInterceptionsCheckBoxAction(action);
	}
	public void setClearanceAction(Action action) {
		calculationsPanel.setClearanceCheckBoxAction(action);
	}
	public void setShotsBlockedAction(Action action) {
		calculationsPanel.setShotsBlockedCheckBoxAction(action);
	}
	public void setShotsConcededAction(Action action) {
		calculationsPanel.setShotsCheckBoxAction(action);
	}

	public void setTotalPassesAction(Action action) {
		calculationsPanel.setTotalPassesCheckBoxAction(action);
	}
	public void setPassSuccessPercentAction(Action action) {
		calculationsPanel.setPassSuccessPercentCheckBoxAction(action);
	}
	public void setCrossPassAction(Action action) {
		calculationsPanel.setCrossPassCheckBoxAction(action);
	}
	public void setThroughBallPassAction(Action action) {
		calculationsPanel.setThroughBallPassCheckBoxAction(action);
	}
	public void setLongBallPassAction(Action action) {
		calculationsPanel.setLongBallPassCheckBoxAction(action);
	}
	public void setShortPassAction(Action action) {
		calculationsPanel.setShortPassCheckBoxAction(action);
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


    // Record Text area
    public void addGameListToScrollPane(ArrayList<String> gameList) {
    	recordsText.addGameListToScrollPane(gameList);
    }

    public void addScrollPane(){

    	scrollPanel = recordsText.addScrollPane();
    	frame.add(scrollPanel);
    	setVisible(true);
    }

    public static int getRecordNumber() {
    	int recordNumber = ViewDisplayText.getRecordNumber();
    	return recordNumber;
    }

    public void removeAllPanels() {
    	frame.getContentPane().removeAll();
		//frame.getContentPane().add(new JPanel());
		frame.pack();
    }

    public void addCalculateButtonPanel() {
    	calculateButtonsPanel = calculationsPanel.addPanel();
    	frame.add(calculateButtonsPanel);
    	setVisible(true);
    }

}
