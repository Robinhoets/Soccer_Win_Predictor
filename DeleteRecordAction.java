import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import javax.swing.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
class DeleteRecordAction extends AbstractAction {

	private View view;
	private Model model;

	public DeleteRecordAction(View view, Model model, String name) {
		this.view = view;
		this.model = model;
		this.name = name;
	}

	@Override
   	public void actionPerformed(ActionEvent evt) {

   	}

}