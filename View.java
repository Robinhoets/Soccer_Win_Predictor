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


	public View(String title) {

		
		panel.add(possessionTextField);
		panel.add(shotsTextField);

		panel.add(addRecord);

		// add title in top
      	frame.setTitle(title);
      	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      	//frame.getContentPane().add(displayText.getMainComponent(), BorderLayout.CENTER);
      	//frame.getContentPane().add(statusBar.getComponent(), BorderLayout.PAGE_END);
     
     	frame.add(panel);



	}

	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }


}