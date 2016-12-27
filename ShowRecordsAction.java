import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import javax.swing.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
class ShowRecordsAction extends AbstractAction {

	private View view;
	private Model model;

	public ShowRecordsAction(View view, Model model, String name) {
		super(name);
		this.view = view;
		this.model = model;
	}

	@Override
   	public void actionPerformed(ActionEvent evt) {
   		
   		model.getAllRecords();	// create variable for stringbuilder array 
   		// *** code to add records to scrollpan ***
   		view.addScrollPane();
   	}

}