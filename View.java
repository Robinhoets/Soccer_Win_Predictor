import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class View implements InterfaceView {


	protected static final String possessionFieldString = "Possession: ";
	protected static final String shotFieldString = "Shots: ";

	
	
	// Text fields to add records
	private JTextField possessionTextField = new JTextField(10);
	private JTextField shotsTextField = new JTextField(10);

	// Text field labels
	JLabel possessionLabel = new JLabel(possessionFieldString);
	JLabel shotsLabel = new JLabel(shotFieldString);

	// JPanel
	private JPanel panel = new JPanel();
	private GridBagLayout gridbag = new GridBagLayout();
    private GridBagConstraints c = new GridBagConstraints();

    // Create frame
    private JFrame frame = new JFrame();

    protected JLabel actionLabel;
	
	public View(String title) {

		// set text labels to their text field
		possessionLabel.setLabelFor(possessionTextField);
		shotsLabel.setLabelFor(shotsTextField);

		//set panel layout
		panel.setLayout(gridbag);

		JLabel[] labels = {possessionLabel, shotsLabel};
		JTextField[] textFields = {possessionTextField, shotsTextField};
		addLabelTextRows(labels, textFields, gridbag, panel);


		//Create a label to put messages during an action event.
        actionLabel = new JLabel("Type text");
        actionLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

		c.gridwidth = GridBagConstraints.REMAINDER; //last
        c.anchor = GridBagConstraints.WEST;
        c.weightx = 1.0;

        panel.add(actionLabel, c);

		panel.setBorder(new BevelBorder(BevelBorder.RAISED));
		panel.add(possessionTextField);
		panel.add(shotsTextField);

		

		// add title in top
      	frame.setTitle(title);
      	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      	//frame.getContentPane().add(displayText.getMainComponent(), BorderLayout.CENTER);
      	//frame.getContentPane().add(statusBar.getComponent(), BorderLayout.PAGE_END);
      	

      	//add panel to frame
      	frame.add(panel);

	}

	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }


    private void addLabelTextRows(JLabel[] labels,
                                  JTextField[] textFields,
                                  GridBagLayout gridbag,
                                  Container container) {

        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.EAST;
        int numLabels = labels.length;
 
        for (int i = 0; i < numLabels; i++) {
            c.gridwidth = GridBagConstraints.RELATIVE; //next-to-last
            c.fill = GridBagConstraints.NONE;      //reset to default
            c.weightx = 0.0;                       //reset to default
            container.add(labels[i], c);
 
            c.gridwidth = GridBagConstraints.REMAINDER;     //end row
            c.fill = GridBagConstraints.HORIZONTAL;
            c.weightx = 1.0;
            container.add(textFields[i], c);
        }
    }

}