import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

class ViewDisplayText {

	private JPanel mainPanel = new JPanel();
	private JButton addRecordButton = new JButton("Add Record");
	private JButton calculateButton = new JButton("Calculte");
	private JTextArea textArea = new JTextArea(20,20);

	// labels section
	private JLabel yellowCardsLabel = new JLabel("Yellow Cards");
	private JLabel redCardsLabel = new JLabel("Red Cards");
	private JLabel foulsLabel = new JLabel("Fouls");

	private JLabel cornersLabel = new JLabel("Corners");
	private JLabel offsidesLabel = new JLabel("Offsides");
	private JLabel possessionPercentAccuracyLabel = new JLabel("Possession");
	private JLabel passAccuracyPercentLabel = new JLabel("Pass Accuracy");

	private JLabel formationLabel = new JLabel("Formation");
	private JLabel opponentsFormationLabel = new JLabel("Opponents Formation");

	private JLabel goalsLabel = new JLabel("Goals");
	private JLabel goalsScoredCounterAttackLabel = new JLabel("Goals-Counter Attack");
	private JLabel goalsScoredOpenPlayLabel = new JLabel("Goals-Open Play");
	private JLabel goalsScoredSetPieceLabel = new JLabel("Goals-Set Piece");
	private JLabel goalsScoredPenaltyLabel = new JLabel("Goals-Penalty");
	private JLabel ownGoalLabel = new JLabel("Own Goals");

	private JLabel shotsLabel = new JLabel("Shots");
	private JLabel shotsOnTargetLabel = new JLabel("Shots On Target");
	private JLabel dribblesWonLabel = new JLabel("Dribbles Won");
	private JLabel foulsWonLabel = new JLabel("Fouls Won");

	private JLabel tacklesLabel = new JLabel("Tackles");
	private JLabel interceptionsLabel = new JLabel("Interceptions");
	private JLabel clearanceLabel = new JLabel("Clearances");
	private JLabel shotsBlockedLabel = new JLabel("Shots Blocked");
	private JLabel shotsConcededLabel = new JLabel("Shots Conceded");

	private JLabel totalPassesLabel = new JLabel("Total Passes");
	private JLabel passSuccessPercentLabel = new JLabel("Pass Success Percent");
	private JLabel crossPassLabel = new JLabel("Cross Pass");
	private JLabel throughBallPassLabel = new JLabel("Through Balls");
	private JLabel longBallPassLabel = new JLabel("Long Ball Passes");
	private JLabel shortPassLabel = new JLabel("Short Passes");

	private JLabel winLabel = new JLabel("Win");

	
	// JTextFields
	private JTextField yellowCardsText = new JTextField(10);
	private JTextField redCardsText = new JTextField(10);
	private JTextField foulsText = new JTextField(10);

	private JTextField cornersText = new JTextField(10);
	private JTextField offsidesText = new JTextField(10);
	private JTextField possessionPercentAccuracyText = new JTextField(10);
	private JTextField passAccuracyPercentText = new JTextField(10);

	private JTextField formationText = new JTextField(10);
	private JTextField opponentsFormationText = new JTextField(10);
	private JTextField goalsText = new JTextField(10);
	private JTextField goalsScoredCounterAttackText = new JTextField(10);
	private JTextField goalsScoredOpenPlayText = new JTextField(10);
	private JTextField goalsScoredSetPieceText = new JTextField(10);
	private JTextField goalsScoredPenaltyText = new JTextField(10);
	private JTextField ownGoalText = new JTextField(10);

	private JTextField shotsText = new JTextField(10);
	private JTextField shotsOnTargetText = new JTextField(10);
	private JTextField dribblesWonText = new JTextField(10);
	private JTextField foulsWonText = new JTextField(10);

	private JTextField tacklesText = new JTextField(10);
	private JTextField interceptionsText = new JTextField(10);
	private JTextField clearanceText = new JTextField(10);
	private JTextField shotsBlockedText = new JTextField(10);
	private JTextField shotsConcededText = new JTextField(10);

	private JTextField totalPassesText = new JTextField(10);
	private JTextField passSuccessPercentText = new JTextField(10);
	private JTextField crossPassText = new JTextField(10);
	private JTextField throughBallPassText = new JTextField(10);
	private JTextField longBallPassText = new JTextField(10);
	private JTextField shortPassText = new JTextField(10);

	private JTextField winText = new JTextField(10);

	public ViewDisplayText() {
		JPanel buttonPanel = new JPanel(new GridLayout(1, 0, 2, 0));
		buttonPanel.add(addRecordButton);
		buttonPanel.add(calculateButton);

		JPanel textAndLabelPanel = new JPanel(new GridLayout(2, 0, 2, 0));
		// add labels
		textAndLabelPanel.add(yellowCardsLabel);
		textAndLabelPanel.add(redCardsLabel);
		textAndLabelPanel.add(foulsLabel);

		textAndLabelPanel.add(cornersLabel);
		textAndLabelPanel.add(offsidesLabel);
		textAndLabelPanel.add(possessionPercentAccuracyLabel);
		textAndLabelPanel.add(passAccuracyPercentLabel);

		textAndLabelPanel.add(formationLabel);
		textAndLabelPanel.add(opponentsFormationLabel);

		textAndLabelPanel.add(goalsLabel);
		textAndLabelPanel.add(goalsScoredCounterAttackLabel);
		textAndLabelPanel.add(goalsScoredOpenPlayLabel);
		textAndLabelPanel.add(goalsScoredSetPieceLabel);
		textAndLabelPanel.add(goalsScoredPenaltyLabel);
		textAndLabelPanel.add(ownGoalLabel);

		textAndLabelPanel.add(shotsLabel);
		textAndLabelPanel.add(shotsOnTargetLabel);
		textAndLabelPanel.add(dribblesWonLabel);
		textAndLabelPanel.add(foulsWonLabel);

		textAndLabelPanel.add(tacklesLabel);
		textAndLabelPanel.add(interceptionsLabel);
		textAndLabelPanel.add(clearanceLabel);
		textAndLabelPanel.add(shotsBlockedLabel);
		textAndLabelPanel.add(shotsConcededLabel);

		textAndLabelPanel.add(totalPassesLabel);
		textAndLabelPanel.add(passSuccessPercentLabel);
		textAndLabelPanel.add(crossPassLabel);
		textAndLabelPanel.add(throughBallPassLabel);
		textAndLabelPanel.add(longBallPassLabel);
		textAndLabelPanel.add(shortPassLabel);

		textAndLabelPanel.add(winLabel);


		// add text boxes
		textAndLabelPanel.add(yellowCardsText);
		textAndLabelPanel.add(redCardsText);
		textAndLabelPanel.add(foulsText);

		textAndLabelPanel.add(cornersText);
		textAndLabelPanel.add(offsidesText);
		textAndLabelPanel.add(possessionPercentAccuracyText);
		textAndLabelPanel.add(passAccuracyPercentText);

		textAndLabelPanel.add(formationText);
		textAndLabelPanel.add(opponentsFormationText);

		textAndLabelPanel.add(goalsText);
		textAndLabelPanel.add(goalsScoredCounterAttackText);
		textAndLabelPanel.add(goalsScoredOpenPlayText);
		textAndLabelPanel.add(goalsScoredSetPieceText);
		textAndLabelPanel.add(goalsScoredPenaltyText);
		textAndLabelPanel.add(ownGoalText);

		textAndLabelPanel.add(shotsText);
		textAndLabelPanel.add(shotsOnTargetText);
		textAndLabelPanel.add(dribblesWonText);
		textAndLabelPanel.add(foulsWonText);

		textAndLabelPanel.add(tacklesText);
		textAndLabelPanel.add(interceptionsTextl);
		textAndLabelPanel.add(clearanceText);
		textAndLabelPanel.add(shotsBlockedText);
		textAndLabelPanel.add(shotsConcededText);

		textAndLabelPanel.add(totalPassesText);
		textAndLabelPanel.add(passSuccessPercentText);
		textAndLabelPanel.add(crossPassText);
		textAndLabelPanel.add(throughBallPassText);
		textAndLabelPanel.add(longBallPassText);
		textAndLabelPanel.add(shortPassText);

		textAndLabelPanel.add(winText);


		// add panels to main panel
		mainPanel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(textAndLabelPanel, BorderLayout.PAGE_START);
      	mainPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
      	mainPanel.add(buttonPanel, BorderLayout.PAGE_END);
	}

	public JComponent getMainComponent() {
		return mainPanel;
	}

	public void setAddRecordButtonAction(Action action) {
		addRecordButton.setAction(action);
	}

	public void setCalculateButtonAction(Action action) {
		calculateButton.setAction(action);
	}

	public String getTextAreaText() {
      return textArea.getText();
    }

   	public void setTextAreaText(String text) {
   	   textArea.setText(text);
   	}




   	// text from text boxes
   	// Cards and fouls section
	public int getYellowCardsTextAreaText() {
		return yellowCardsText;
	}
	public int getRedCardsTextAreaText() {
		return redCardsText;
	}
	public int getFoulsTextAreaText() {
		return foulsText;
	}

	// corners, offsides, possession, passing
	public int getCornersTextAreaText() {
		return cornersText;
	}
	public int getOffsidesTextAreaText() {
		return offsidesText;
	}
	public int getPossessionPercentTextAreaText() {
		return possessionPercentText;
	}
	public int getPassAccuracyPercentTextAreaText() {
		return passAccuracyPercentText;
	}

	// tactical formation
	public int getFormationTextAreaText() {
		return formationText;
	}
	public int getOpponentsFormationTextAreaText() {
		return opponentsFormationText;
	}

	// goals formation
	public int getGoalsTextAreaText() {
		return goalsText;
	}
	public int getGoalsScoredCounterAttackTextAreaText() {
		return goalsScoredCounterAttackText;
	}
	public int getGoalsScoredOpenPlayTextAreaText() {
		return goalsScoredOpenPlayText;
	}
	public int getGoalsScoredSetPieceTextAreaText() {
		return goalsScoredSetPieceText;
	}
	public int getGoalsScoredPenaltyTextAreaText() {
		return getGoalsScoredPenaltyText;
	}

	// offensive moves
	public int getShotsTextAreaText(){
		return shotsText;
	}
	public int getShotsOnTargetTextAreaText() {
		return shotsOnTargetText;
	}
	public int getDribblesWonTextAreaText() {
		return dribblesWonText;
	}
	public int getFoulsWonTextAreaText() {
		return foulsWonText;
	}

	// defensive moves
	public int getTacklesTextAreaText() {
		return tacklesText;
	}
	public int getInterceptionsTextAreaText() {
		return interceptionsText;
	}
	public int getClearanceTextAreaText() {
		return clearanceText;
	}
	public int getShotsBlockedTextAreaText() {
		return shotsBlockedText;
	}
	public int getShotsConcededTextAreaText() {
		return shotsConcededText;
	}

	// passing
	public int getTotalPassesTextAreaText() {
		return totalPassesText;
	}
	public int getPassSuccessPercentTextAreaText() {
		return passSuccessPercentText;
	}
	public int getCrossPassTextAreaText() {
		return crossPassText;
	}
	public int getThroughBallPassTextAreaText() {
		return throughBallPassText;
	}
	public int getLongBallPassTextAreaText() {
		return longBallPassText;
	}
	public int getShortPassTextAreaText() {
		return shortPassText;
	}

	//win or loss
	public int getWinTextAreaText() {
		return winText;
	}


	// turn text gathered from text box and turns into an integer
    public int textToInteger(String text) {
    	return Integer.parseInt(text);
    }

    // resets all text boxes after record added
    public void resetTextBoxes() {
    	yellowCardsText.setText("");
    	redCardsText.setText("");
    	foulsText.setText("");

		cornersText.setText("");
		offsidesText.setText("");
		possessionPercentText.setText("");
		passAccuracyPercentText.setText("");

		formationText.setText("");
		opponentsFormationText.setText("");

		goalsText.setText("");
		goalsScoredCounterAttackText.setText("");
		goalsScoredOpenPlayText.setText("");
		goalsScoredSetPieceText.setText("");
		goalsScoredPenaltyText.setText("");
		ownGoalsText.setText("");

		shotsText.setText("");
		shotsOnTargetText.setText("");
		dribblesWonText.setText("");
		foulsWonText.setText("");

		tacklesText.setText("");
		interceptionsText.setText("");
		clearanceText.setText("");
		shotsBlockedText.setText("");
		shotsConcededText.setText("");

		totalPassesText.setText("");
		passSuccessPercentText.setText("");
		crossPassText.setText("");
		throughBallPassText.setText("");
		longBallPassText.setText("");
		shortPassText.setText("");
		
		winText.setText("");
    }
}
