import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import javax.swing.*;

@SuppressWarnings("serial")
class GoBackToMainPageAction extends AbstractAction {

	private View view;
	private Model model;

	View mainPageDisplayText;

	public GoBackToMainPageAction(View view, Model model, String name) {
		super(name);
		this.view = view;
		this.model = model;
	}

	@Override
   	public void actionPerformed(ActionEvent evt) {

   		System.out.println("got to main page button");
   		view.removeAllPanels();
   		mainPageDisplayText = new View();

   	}

}