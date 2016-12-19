import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class View implements InterfaceView {

	// Create frame
    private static JFrame frame = new JFrame();

    final static boolean RIGHT_TO_LEFT = false;

    private Calculated calcSuccess = new Calculated();

    ViewDisplayText dislpayText = new ViewDisplayText();

	public View() {
		//Set up the content pane.
        //addComponentsToPane(frame.getContentPane());
        // close when exited
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//frame.getContentPane().add(calcSuccess.getComponent(), GridBagConstraints.HORIZONTAL);
		frame.getContentPane().add(dislpayText.getMainComponent(), BorderLayout.CENTER);
	}

	// set up our initial view
	public void addComponentsToPane(Container pane) {

		if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        // add title in top
      	frame.setTitle("Soccer Records");

		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

	    JLabel label;
	    JTextField textField;
	    JButton button;
	    String textTitle = "";
	    for(int i=0; i<=2; i++) {

	    	if(i==0)
	    		textTitle = "Possession: ";
	    	else if(i==1) {
	    		textTitle = "Shots:";

	    		// add 'add game' button
	    		button = new JButton("Add Game");
	    		c.fill = GridBagConstraints.HORIZONTAL;
	   			c.gridx = 0;
	    		c.gridy = 3;
	    		pane.add(button, c);
	    	}
	    	else if(i==2) {
	    		textTitle = "Pass Accuracy: ";

	    		// add 'add game' button
	    		button = new JButton("Calculate");
	    		c.fill = GridBagConstraints.HORIZONTAL;
	   			c.gridx = 1;
	    		c.gridy = 3;
	    		pane.add(button, c);
	    	}

	    	// Add Labels
		    label = new JLabel(textTitle);
			c.fill = GridBagConstraints.HORIZONTAL;
		    c.gridx = 0;
		    c.gridy = i;
		    pane.add(label, c);	
		    // Add text fields
		    textField = new JTextField(10);
	    	c.fill = GridBagConstraints.HORIZONTAL;
	    	c.gridx = 1;
	    	c.gridy = i;
	    	pane.add(textField, c);
	    }
	}


	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }


}


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

	public void setAddRecordAction(Action action) {
		addRecordButton.setAction(action);
	}

	public void setCalculateAction(Action action) {
		calculateButton.setAction(action);
	}

	public String getTextAreaText() {
      return textArea.getText();
    }

   	public void setTextAreaText(String text) {
   	   textArea.setText(text);
   	}


}
