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

	public View() {
		//Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        // close when exited
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(calcSuccess.getComponent(), GridBagConstraints.HORIZONTAL);
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

	public ViewDisplayText() {

	}


}


class Calculated {

	private static final String CALC = "Calculated: ";
	private JLabel lab = new JLabel(CALC);

	public Calculated () {
		lab.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	public JComponent getComponent() {
		return lab;
	}

	public void  setText(String text) {
		lab.setText(CALC);
	}
}