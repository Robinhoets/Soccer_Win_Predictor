public class Control {

	private View view;
	private Model model;

	public Control(View view, Model model) {	//*** change constructor to include control later
		this.view = view;
		this.model = model;


		view.setAddRecordAction(new AddRecordAction(view, model, "Add Record"));
		view.setCalculateAction(new CalculateAction(view, model, "Calculate Options"));
		view.setShowRecordsAction(new ShowRecordsAction(view, model, "Show Records"));
		view.setDeleteRecordAction(new DeleteRecordAction(view, model, "Delete Record"));
		view.setGraphAction(new GraphAction(view, model, "Graph"));

		view.setLinearRegressionAction(new LinearRegressionAction(view, model, "Linear Regression"));
		view.setGoBackToMainPageAction(new GoBackToMainPageAction(view, model, "Main Page"));

		view.setYellowCardAction(new CheckBoxAction(view, model, "Yellow Cards", 1));
		view.setRedCardAction(new CheckBoxAction(view, model, "Red Cards", 2));



		//model.addPropertyChangeListener(new ModelListener(view, model));	// create class model Listener
	}

	public void showView(boolean visible) {
      view.setVisible(visible);
   }
}