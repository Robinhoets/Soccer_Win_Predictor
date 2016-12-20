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
    private ViewDisplayText dislpayText = new ViewDisplayText();

	public View() {
        // close when exited
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(dislpayText.getMainComponent(), BorderLayout.CENTER);
	}

	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }

    @Override
    public void setAddRecordAction(Action action) {
    	dislpayText.setAddRecordButtonAction(action);
    }

    @Override
    public void setCalculateAction(Action action) {
    	dislpayText.setCalculateButtonAction(action);
    }

    @Override
    public void setTextAreaText(String text) {
    	dislpayText.setTextAreaText(text);
    }

    @Override
    public void getTextAreaText() {
    	dislpayText.getTextAreaText();
    }

}
