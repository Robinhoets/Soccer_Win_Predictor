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
	//private JTextField possessionTextField = new JTextField(10);
	//private JTextField shotsTextField = new JTextField(10);

	private JButton addRecord = new JButton("Add Record");

	// JPanel
	private JPanel panel = new JPanel();
	private JPanel fieldPanel = new JPanel(new GridLayout(2, 1));
	private JPanel labelPanel = new JPanel(new GridLayout(2, 1));

	//private JLabel jlbl1 = new JLabel();
	//private JLabel jlbl2 = new JLabel();

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

		pane.setLayout(new GridBagLayout());

		 JButton button;
		 GridBagConstraints c = new GridBagConstraints();
	    if (false) {
	    //natural height, maximum width
	    c.fill = GridBagConstraints.NORTH;
	    }
	 
	    button = new JButton("Button 1");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 0;
	    pane.add(button, c);

	    button = new JButton("Button 2");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 1;
	    pane.add(button, c);
	 
	    button = new JButton("Button 3");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 2;
	    pane.add(button, c);

	    JLabel jlbl1 = new JLabel("possession: ");
		c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 3;
	    pane.add(jlbl1, c);	 

	    JLabel jlbl2 = new JLabel("Shots: ");   
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 4;
	    pane.add(jlbl2, c);	

	    JTextField possessionTextField = new JTextField(10);
		c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 3;
	    pane.add(possessionTextField, c);

	    JTextField shotsTextField = new JTextField(10);
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 1;
	    c.gridy = 4;
	    pane.add(shotsTextField, c);
	}


	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }


}