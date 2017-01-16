import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;

public class CalculateButtonsPanel {

	private static JPanel mainPanel = new JPanel(new BorderLayout(3,3));
	private JPanel buttonPanel = new JPanel(new GridLayout(3, 0, 2, 0));
	private JPanel checkBoxesPanel = new JPanel(new GridLayout(10, 0, 4, 0));

	private JButton goBackToMainPageButton = new JButton("Main Page");
	private JButton linearRegressionButton = new JButton("Linear Regression");

	private JCheckBox yellowCardsBox;
	private JCheckBox redCardsBox;
	private JCheckBox foulsBox;

	private JCheckBox cornersBox;
	private JCheckBox offsidesBox;
	private JCheckBox possessionPercentBox;
	private JCheckBox passAccuracyPercentBox;

	private JCheckBox formationBox;
	private JCheckBox opponentsFormationBox;

	private JCheckBox goalsBox;
	private JCheckBox goalsScoredCounterAttackBox;
	private JCheckBox goalsScoredOpenPlayBox;
	private JCheckBox goalsScoredSetPieceBox;
	private JCheckBox goalsScoredPenaltyBox;
	private JCheckBox ownGoalsBox;

	private JCheckBox shotsBox;
	private JCheckBox shotsOnTargetBox;
	private JCheckBox dribblesWonBox;
	private JCheckBox foulsWonBox;

	private JCheckBox tacklesBox;
	private JCheckBox interceptionsBox;
	private JCheckBox clearanceBox;
	private JCheckBox shotsBlockedBox;
	private JCheckBox shotsConcededBox;

	private JCheckBox totalPassesBox;
	private JCheckBox passSuccessPercentBox;
	private JCheckBox crossPassBox;
	private JCheckBox throughBallPassBox;
	private JCheckBox longBallPassBox;
	private JCheckBox shortPassBox;


	public CalculateButtonsPanel() {
		buttonPanel.add(goBackToMainPageButton);
		buttonPanel.add(linearRegressionButton);

		yellowCardsBox = new JCheckBox("Yellow Cards");
		redCardsBox = new JCheckBox("Red Cards");
        foulsBox = new JCheckBox("Fouls");

        cornersBox = new JCheckBox("Corners");
		offsidesBox = new JCheckBox("Offsides");
		possessionPercentBox = new JCheckBox("Possession Percent");
		passAccuracyPercentBox = new JCheckBox("Pass Accuracy");
		formationBox = new JCheckBox("Formation");
		opponentsFormationBox = new JCheckBox("Opponents Formation");
		goalsBox = new JCheckBox("Goals");
		goalsScoredCounterAttackBox = new JCheckBox("Goals Scored Counter");
		goalsScoredOpenPlayBox = new JCheckBox("Goals Scored Open Play");
		goalsScoredSetPieceBox = new JCheckBox("Goals Scored Set Piece");
		goalsScoredPenaltyBox = new JCheckBox("Goals Scored Penalty");
		ownGoalsBox = new JCheckBox("Own Goals");

		shotsBox = new JCheckBox("Shots");
		shotsOnTargetBox = new JCheckBox("Shots On Target");
		dribblesWonBox = new JCheckBox("Dribbles Won");
		foulsWonBox = new JCheckBox("Fouls Won");
		tacklesBox = new JCheckBox("Tackles");
		interceptionsBox = new JCheckBox("Interceptions");
		clearanceBox = new JCheckBox("Clearances");
		shotsBlockedBox = new JCheckBox("Shots Blocked");
		shotsConcededBox = new JCheckBox("Shots Conceded");
		totalPassesBox = new JCheckBox("Total Passes");
		passSuccessPercentBox = new JCheckBox("Pass Success Percent");
		crossPassBox = new JCheckBox("Cross Passes");
		throughBallPassBox = new JCheckBox("Through Ball Passes");
		longBallPassBox = new JCheckBox("Long Ball Passes");
		shortPassBox = new JCheckBox("Short Passes");


        //yellowCardsBox.addItemListener(this);
        //redCardsBox.addItemListener(this);

        checkBoxesPanel.add(yellowCardsBox);
        checkBoxesPanel.add(redCardsBox);
        checkBoxesPanel.add(foulsBox);

        checkBoxesPanel.add(cornersBox);
        checkBoxesPanel.add(offsidesBox);
        checkBoxesPanel.add(possessionPercentBox);
        checkBoxesPanel.add(passAccuracyPercentBox);

        checkBoxesPanel.add(formationBox);
        checkBoxesPanel.add(opponentsFormationBox);

        checkBoxesPanel.add(goalsBox);
        checkBoxesPanel.add(goalsScoredCounterAttackBox);
        checkBoxesPanel.add(goalsScoredOpenPlayBox);
        checkBoxesPanel.add(goalsScoredSetPieceBox);
        checkBoxesPanel.add(goalsScoredPenaltyBox);
        checkBoxesPanel.add(ownGoalsBox);

        checkBoxesPanel.add(shotsBox);
        checkBoxesPanel.add(shotsOnTargetBox);
        checkBoxesPanel.add(dribblesWonBox);
        checkBoxesPanel.add(foulsWonBox);

        checkBoxesPanel.add(tacklesBox);
        checkBoxesPanel.add(interceptionsBox);
        checkBoxesPanel.add(clearanceBox);
        checkBoxesPanel.add(shotsBlockedBox);
        checkBoxesPanel.add(shotsConcededBox);

        checkBoxesPanel.add(totalPassesBox);
        checkBoxesPanel.add(passSuccessPercentBox);
        checkBoxesPanel.add(crossPassBox);
        checkBoxesPanel.add(throughBallPassBox);
        checkBoxesPanel.add(longBallPassBox);
        checkBoxesPanel.add(shortPassBox);

	}


	public JPanel addPanel() {
		mainPanel.add(buttonPanel,BorderLayout.CENTER);
		mainPanel.add(checkBoxesPanel, BorderLayout.SOUTH);
		return mainPanel;
	}

	// actions for buttons
	public void setLinearRegressionButtonAction(Action action) {
		linearRegressionButton.setAction(action);
	}

	public void setGoBackToMainPageButtonAction(Action action) {
		goBackToMainPageButton.setAction(action);
	}

	// actions for boxes
	public void setYellowCardCheckBoxAction(Action action) {
		yellowCardsBox.setAction(action);
	}

	public void setRedCardCheckBoxAction(Action action) {
		redCardsBox.setAction(action);
	}
}