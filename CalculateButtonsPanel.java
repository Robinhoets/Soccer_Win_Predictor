import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;

public class CalculateButtonsPanel {

	private static JPanel mainPanel = new JPanel(new BorderLayout(3,3));
	private JPanel buttonPanel = new JPanel(new GridLayout(3, 0, 2, 0));
	private JPanel checkBoxesPanel = new JPanel(new GridLayout(3, 0, 2, 0));

	private JButton goBackToMainPageButton = new JButton("Main Page");
	private JButton linearRegressionButton = new JButton("Linear Regression");

	private JCheckBox yellowCardsBox;
	private JCheckBox redCardsBox;

	public CalculateButtonsPanel() {
		buttonPanel.add(goBackToMainPageButton);
		buttonPanel.add(linearRegressionButton);

		yellowCardsBox = new JCheckBox("Yellow Cards");
		yellowCardsBox.setMnemonic(KeyEvent.VK_Y);
        yellowCardsBox.setSelected(true);

		redCardsBox = new JCheckBox("Red Cards");
		redCardsBox.setMnemonic(KeyEvent.VK_R);
        redCardsBox.setSelected(true);

        //yellowCardsBox.addItemListener(this);
        //redCardsBox.addItemListener(this);

        checkBoxesPanel.add(yellowCardsBox);
        checkBoxesPanel.add(redCardsBox);

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
}