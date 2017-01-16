import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import javax.swing.*;

@SuppressWarnings("serial")
class CheckBoxAction extends AbstractAction {

	private View view;
	private Model model;
	private int boxClassifier;

	public CheckBoxAction(View view, Model model, String name, int boxClassifier) {
		super(name);
		this.view = view;
		this.model = model;
		this.boxClassifier = boxClassifier;
	}

	@Override
   	public void actionPerformed(ActionEvent evt) {

   		if(boxClassifier == 1)
   			System.out.println("yellow card checked");
   		if(boxClassifier == 2)
   			System.out.println("red card checked");
   		
   	}

}