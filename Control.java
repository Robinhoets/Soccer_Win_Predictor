public class Control {

	private View view;
	private Model model;

	public Control(View view, Model model) {	//*** change constructor to include control later
		this.view = view;
		this.model = model;


		view.setAddRecordAction(new AddRecordAction());	// create class Add Record Action
		view.setCalculateAction(new CalculateAction());	// create class Add Record Action
	}

	public void showView(boolean visible) {
      view.setVisible(visible);
   }
}