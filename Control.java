public class Control {

	private View view;
	private Model model;

	public Control(View view, Model model) {	//*** change constructor to include control later
		this.view = view;
		this.model = model;


		view.setAddRecordAction(new AddRecordAction(view, model, "Add Record"));
		view.setCalculateAction(new CalculateAction(view, model, "Calculate"));
		view.setShowRecordsAction(new ShowRecordsAction(view, model, "Show Records"));
		view.setDeleteRecordAction(new DeleteRecordAction(view, model, "Delete Record"));
		view.setGraphAction(new GraphAction(view, model, "Graph"));

		//model.addPropertyChangeListener(new ModelListener(view, model));	// create class model Listener
	}

	public void showView(boolean visible) {
      view.setVisible(visible);
   }
}