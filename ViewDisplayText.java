import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import javax.swing.JScrollPane;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.lang.NumberFormatException;

class ViewDisplayText {

	private static JPanel mainPanel = new JPanel(new BorderLayout(3,3));
	// create buttons
	private JButton addRecordButton = new JButton("Add Record");
	private JButton calculateButton = new JButton("Calculte");
	private JButton showRecordsButton = new JButton("Show Records");
	private JButton graphButton = new JButton("Graph");
	private JButton deleteRecordButton = new JButton("Delete Record");

	//create scrollpane that can be added
	JTextArea textArea = new JTextArea(5, 70);
	JScrollPane scrollPane = new JScrollPane(textArea);

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
		JPanel buttonPanel = new JPanel(new GridLayout(3, 0, 2, 0));
		buttonPanel.add(addRecordButton);
		buttonPanel.add(calculateButton);
		buttonPanel.add(showRecordsButton);
		buttonPanel.add(graphButton);
		buttonPanel.add(deleteRecordButton);

		JPanel textPanel = new JPanel(new GridLayout(0,1));
		JPanel labelPanel = new JPanel(new GridLayout(0,1));

		// add labels
		labelPanel.add(yellowCardsLabel);
		labelPanel.add(redCardsLabel);
		labelPanel.add(foulsLabel);

		labelPanel.add(cornersLabel);
		labelPanel.add(offsidesLabel);
		labelPanel.add(possessionPercentAccuracyLabel);
		labelPanel.add(passAccuracyPercentLabel);

		labelPanel.add(formationLabel);
		labelPanel.add(opponentsFormationLabel);
	
		labelPanel.add(goalsLabel);
		labelPanel.add(goalsScoredCounterAttackLabel);
		labelPanel.add(goalsScoredOpenPlayLabel);
		labelPanel.add(goalsScoredSetPieceLabel);
		labelPanel.add(goalsScoredPenaltyLabel);
		labelPanel.add(ownGoalLabel);

		labelPanel.add(shotsLabel);
		labelPanel.add(shotsOnTargetLabel);
		labelPanel.add(dribblesWonLabel);

		labelPanel.add(foulsWonLabel);

		labelPanel.add(tacklesLabel);
		labelPanel.add(interceptionsLabel);
		labelPanel.add(clearanceLabel);
		labelPanel.add(shotsBlockedLabel);
		labelPanel.add(shotsConcededLabel);

		labelPanel.add(totalPassesLabel);
		labelPanel.add(passSuccessPercentLabel);
		labelPanel.add(crossPassLabel);

		labelPanel.add(throughBallPassLabel);
		labelPanel.add(longBallPassLabel);
		labelPanel.add(shortPassLabel);

		labelPanel.add(winLabel);

		// text boxes
		textPanel.add(yellowCardsText);
		textPanel.add(redCardsText);
		textPanel.add(foulsText);

		textPanel.add(cornersText);
		textPanel.add(offsidesText);
		textPanel.add(possessionPercentAccuracyText);
		textPanel.add(passAccuracyPercentText);

		textPanel.add(formationText);
		textPanel.add(opponentsFormationText);

		textPanel.add(goalsText);
		textPanel.add(goalsScoredCounterAttackText);
		textPanel.add(goalsScoredOpenPlayText);
		textPanel.add(goalsScoredSetPieceText);
		textPanel.add(goalsScoredPenaltyText);
		textPanel.add(ownGoalText);

		textPanel.add(shotsText);
		textPanel.add(shotsOnTargetText);
		textPanel.add(dribblesWonText);

		textPanel.add(foulsWonText);

		textPanel.add(tacklesText);
		textPanel.add(interceptionsText);
		textPanel.add(clearanceText);
		textPanel.add(shotsBlockedText);
		textPanel.add(shotsConcededText);

		textPanel.add(totalPassesText);
		textPanel.add(passSuccessPercentText);
		textPanel.add(crossPassText);

		textPanel.add(throughBallPassText);
		textPanel.add(longBallPassText);
		textPanel.add(shortPassText);

		textPanel.add(winText);


		// add panels to main panel
		mainPanel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(labelPanel, BorderLayout.WEST);
		mainPanel.add(textPanel, BorderLayout.CENTER);
      	mainPanel.add(buttonPanel, BorderLayout.PAGE_END);
	}

	public JComponent getMainComponent() {
		return mainPanel;
	}

	// actions for buttons
	public void setAddRecordButtonAction(Action action) {
		addRecordButton.setAction(action);
	}

	public void setShowRecordsButtonAction(Action action) {
		showRecordsButton.setAction(action);
	}

	public void setDeleteRecordButtonAction(Action action) {
		deleteRecordButton.setAction(action);
	}

	public void setCalculateButtonAction(Action action) {
		calculateButton.setAction(action);
	}

	public void setGraphButtonAction(Action action) {
		graphButton.setAction(action);
	}




   	// text from text boxes
   	// Cards and fouls section
	public int getYellowCardsTextAreaText() {
		return textToInteger(yellowCardsText.getText());
	}
	public int getRedCardsTextAreaText() {
		return textToInteger(redCardsText.getText());
	}
	public int getFoulsTextAreaText() {
		return textToInteger(foulsText.getText());
	}

	// corners, offsides, possession, passing
	public int getCornersTextAreaText() {
		return textToInteger(cornersText.getText());
	}
	public int getOffsidesTextAreaText() {
		return textToInteger(offsidesText.getText());
	}
	public int getPossessionPercentTextAreaText() {
		return textToInteger(possessionPercentAccuracyText.getText());
	}
	public int getPassAccuracyPercentTextAreaText() {
		return textToInteger(passAccuracyPercentText.getText());
	}

	// tactical formation
	public int getFormationTextAreaText() {
		return textToInteger(formationText.getText());
	}
	public int getOpponentsFormationTextAreaText() {
		return textToInteger(opponentsFormationText.getText());
	}

	// goals formation
	public int getGoalsTextAreaText() {
		return textToInteger(goalsText.getText());
	}
	public int getGoalsScoredCounterAttackTextAreaText() {
		return textToInteger(goalsScoredCounterAttackText.getText());
	}
	public int getGoalsScoredOpenPlayTextAreaText() {
		return textToInteger(goalsScoredOpenPlayText.getText());
	}
	public int getGoalsScoredSetPieceTextAreaText() {
		return textToInteger(goalsScoredSetPieceText.getText());
	}
	public int getGoalsScoredPenaltyTextAreaText() {
		return textToInteger(goalsScoredPenaltyText.getText());
	}
	public int getOwnGoalsTextAreaText() {
		return textToInteger(ownGoalText.getText());
	}

	// offensive moves
	public int getShotsTextAreaText(){
		return textToInteger(shotsText.getText());
	}
	public int getShotsOnTargetTextAreaText() {
		return textToInteger(shotsOnTargetText.getText());
	}
	public int getDribblesWonTextAreaText() {
		return textToInteger(dribblesWonText.getText());
	}
	public int getFoulsWonTextAreaText() {
		return textToInteger(foulsWonText.getText());
	}

	// defensive moves
	public int getTacklesTextAreaText() {
		return textToInteger(tacklesText.getText());
	}
	public int getInterceptionsTextAreaText() {
		return textToInteger(interceptionsText.getText());
	}
	public int getClearanceTextAreaText() {
		return textToInteger(clearanceText.getText());
	}
	public int getShotsBlockedTextAreaText() {
		return textToInteger(shotsBlockedText.getText());
	}
	public int getShotsConcededTextAreaText() {
		return textToInteger(shotsConcededText.getText());
	}

	// passing
	public int getTotalPassesTextAreaText() {
		return textToInteger(totalPassesText.getText());
	}
	public int getPassSuccessPercentTextAreaText() {
		return textToInteger(passSuccessPercentText.getText());
	}
	public int getCrossPassTextAreaText() {
		return textToInteger(crossPassText.getText());
	}
	public int getThroughBallPassTextAreaText() {
		return textToInteger(throughBallPassText.getText());
	}
	public int getLongBallPassTextAreaText() {
		return textToInteger(longBallPassText.getText());
	}
	public int getShortPassTextAreaText() {
		return textToInteger(shortPassText.getText());
	}

	//win or loss
	public int getWinTextAreaText() {
		return textToInteger(winText.getText());
	}


	// turn text gathered from text box and turns into an integer
    public static int textToInteger(String text) {
    	return Integer.parseInt(text);
    }

    // resets all text boxes after record added
    public void resetTextBoxes() {
    	yellowCardsText.setText("");
    	redCardsText.setText("");
    	foulsText.setText("");

		cornersText.setText("");
		offsidesText.setText("");
		possessionPercentAccuracyText.setText("");
		passAccuracyPercentText.setText("");

		formationText.setText("");
		opponentsFormationText.setText("");

		goalsText.setText("");
		goalsScoredCounterAttackText.setText("");
		goalsScoredOpenPlayText.setText("");
		goalsScoredSetPieceText.setText("");
		goalsScoredPenaltyText.setText("");
		ownGoalText.setText("");

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

    public void  addGameListToScrollPane(ArrayList<String> gameList) {

    	textArea.setText("");
    	for(int i=0; i<gameList.size(); i++) {  		
    		textArea.append(gameList.get(i));	
    	}

    }

    public void addScrollPane(){

    	scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
   	 	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    	mainPanel.add(scrollPane, BorderLayout.EAST);
    }

    public static int getRecordNumber() {

    	int intRecordNumber=0;
    	String recordNumber = JOptionPane.showInputDialog(mainPanel,
                        "Which game number do you want to delete?", "(Game Number)");

    	if(recordNumber == null) {
    		JOptionPane.showMessageDialog(null, "User pressed cancel");	
		} 
		else {

			try {

				intRecordNumber = textToInteger(recordNumber);

			} catch(NumberFormatException e) {

				JOptionPane.showMessageDialog(null, "Value must be an integer!");

			}
		}

    	return intRecordNumber;
    }

}
