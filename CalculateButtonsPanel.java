import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class CalculateButtonsPanel {

	private static JPanel mainPanel = new JPanel(new BorderLayout(3,3));
	private JPanel buttonPanel = new JPanel(new GridLayout(3, 0, 2, 0));
	//private JTextArea textArea;
	//private JScrollPane scrollPane;
	private JButton linearRegressionButton = new JButton("Linear Regression");

	public CalculateButtonsPanel() {
		buttonPanel.add(linearRegressionButton);
	}


	public JPanel addPanel() {
		mainPanel.add(buttonPanel,BorderLayout.CENTER);
		return mainPanel;
	}


	// actions for buttons
	public void setLinearRegressionButtonAction(Action action) {
		linearRegressionButton.setAction(action);
	}
}