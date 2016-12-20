import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import javax.swing.*;


@SuppressWarnings("serial")
class AddRecordAction extends AbstractAction {

	private View view;
	private Model model;

	public AddRecordAction(View view, Model model, String name) {
		super(name);
		this.view = view;
		this.model = model;
	}

	@Override
   	public void actionPerformed(ActionEvent evt) {

		view.setTextAreaText("Button worked");

		String poss = view.getPossessionTextAreaText();
		String shot = view.getShotTextAreaText();
		String passAcc = view.getPassAccTextAreaText();

		view.setTextAreaText(poss + "\n" + shot + "\n" + passAcc);

   	}
	
}