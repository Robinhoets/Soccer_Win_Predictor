public class Control {

	private View view;
	private Model model;

	public Control(View view, Model model) {	//*** change constructor to include control later
		this.view = view;
		this.model = model;


		view.setAddRecordAction(new AddRecordAction(view, model, "Add Record"));	// create class Add Record Action
		view.setCalculateAction(new CalculateAction(view, model, "Calculate"));	// create class Add Record Action

		//model.addPropertyChangeListener(new ModelListener(view, model));	// create class model Listener
	}

	public void showView(boolean visible) {
      view.setVisible(visible);
   }
}