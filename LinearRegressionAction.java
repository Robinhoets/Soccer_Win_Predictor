import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import javax.swing.*;

@SuppressWarnings("serial")
public class LinearRegressionAction extends AbstractAction {
	
	private View view;
	private Model model;

	public LinearRegressionAction(View view, Model model, String name) {
		super(name);
		this.view = view;
		this.model = model;
	}

	@Override
   	public void actionPerformed(ActionEvent evt) {

   		//System.out.println("Got to linear button");

   		model.runLinearRegression();
   	}

}