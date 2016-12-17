import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class View implements InterfaceView {

	// Create frame
    private JFrame frame = new JFrame();
	
	// Text fields to add records
	private JTextField possessionTextField = new JTextField(10);
	private JTextField shotsTextField = new JTextField(10);

	private JButton addRecord = new JButton("Add Record");

	// JPanel
	private JPanel panel = new JPanel();
	private JPanel fieldPanel = new JPanel(new GridLayout(2, 1));
	private JPanel labelPanel = new JPanel(new GridLayout(2, 1));

	private JLabel jlbl1 = new JLabel();
	private JLabel jlbl2 = new JLabel();

	public View(String title) {

		//Set up the content pane.
        addComponentsToPane(frame.getContentPane());

		/*

		jlbl1.setText("possession: ");
		jlbl1.setVerticalTextPosition(JLabel.BOTTOM);
        jlbl1.setHorizontalTextPosition(JLabel.CENTER);

        jlbl2.setText("shots: ");
		jlbl2.setVerticalTextPosition(JLabel.BOTTOM);
        jlbl2.setHorizontalTextPosition(JLabel.CENTER);

        panel.add(jlbl1);
        panel.add(jlbl2);

		panel.add(possessionTextField);
		panel.add(shotsTextField);

		panel.add(addRecord);


		// add title in top
      	frame.setTitle(title);
      	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      	//frame.getContentPane().add(displayText.getMainComponent(), BorderLayout.CENTER);
      	//frame.getContentPane().add(statusBar.getComponent(), BorderLayout.PAGE_END);
     
     	frame.add(panel);
		*/
	}
	final static boolean RIGHT_TO_LEFT = false;

	public static void addComponentsToPane(Container pane) {

		if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

		pane.setLayout(new GridLayout());

		 JButton button;
		 GridBagConstraints c = new GridBagConstraints();
	    if (false) {
	    //natural height, maximum width
	    c.fill = GridBagConstraints.NORTH;
	    }
	 
	    button = new JButton("Button 1");
	    if (true) {
	    c.weightx = 0.5;
	    }
	    c.fill = GridBagConstraints.NORTH;
	    c.gridx = 0;
	    c.gridy = 0;
	    pane.add(button, c);

	    button = new JButton("Button 2");
	    c.fill = GridBagConstraints.NORTH;
	    c.weightx = 0.5;
	    c.gridx = 1;
	    c.gridy = 0;
	    pane.add(button, c);
	 
	    button = new JButton("Button 3");
	    c.fill = GridBagConstraints.NORTH;
	    c.weightx = 0.5;
	    c.gridx = 2;
	    c.gridy = 0;
	    pane.add(button, c);
	 
	    button = new JButton("Long-Named Button 4");
	    c.fill = GridBagConstraints.NORTH;
	    c.ipady = 40;      //make this component tall
	    c.weightx = 0.0;
	    c.gridwidth = 3;
	    c.gridx = 0;
	    c.gridy = 1;
	    pane.add(button, c);
	 
	    button = new JButton("5");
	    c.fill = GridBagConstraints.NORTH;
	    c.ipady = 0;       //reset to default
	    c.weighty = 1.0;   //request any extra vertical space
	    c.anchor = GridBagConstraints.PAGE_END; //bottom of space
	    c.insets = new Insets(10,0,0,0);  //top padding
	    c.gridx = 1;       //aligned with button 2
	    c.gridwidth = 2;   //2 columns wide
	    c.gridy = 2;       //third row
	    pane.add(button, c);

	}


	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }


}