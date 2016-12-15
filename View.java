import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.*;

public class View implements InterfaceView {

	private JFrame frame = new JFrame();
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileMenu = new JMenu();
	
	
	public View(String title) {
		menuBar.add(fileMenu);

      	frame.setTitle(title);
      	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      	//frame.getContentPane().add(displayText.getMainComponent(), BorderLayout.CENTER);
      	//frame.getContentPane().add(statusBar.getComponent(), BorderLayout.PAGE_END);
      	frame.setJMenuBar(menuBar);
	}

	@Override
   	public void setVisible(boolean visible) {
    	frame.pack();
      	frame.setLocationRelativeTo(null);
      	frame.setVisible(true);
    }

}