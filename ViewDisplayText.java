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

	private JLabel possessionLabel = new JLabel("   POSSESSION");
	private JLabel shotsLabel = new JLabel("        SHOTS");
	private JLabel passAccLabel = new JLabel("PASS ACCURACY");

	private JTextField possessionText = new JTextField(10);
	private JTextField shotsText = new JTextField(10);
	private JTextField passAccuracyText = new JTextField(10);

	public ViewDisplayText() {
		JPanel buttonPanel = new JPanel(new GridLayout(1, 0, 2, 0));
		buttonPanel.add(addRecordButton);
		buttonPanel.add(calculateButton);

		JPanel textAndLabelPanel = new JPanel(new GridLayout(2, 0, 2, 0));
		textAndLabelPanel.add(possessionLabel);
		textAndLabelPanel.add(shotsLabel);
		textAndLabelPanel.add(passAccLabel);

		textAndLabelPanel.add(possessionText);
		textAndLabelPanel.add(shotsText);
		textAndLabelPanel.add(passAccuracyText);

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


}
