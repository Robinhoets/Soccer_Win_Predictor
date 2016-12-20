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


	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }


}
