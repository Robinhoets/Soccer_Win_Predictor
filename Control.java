public class Control {

	private View view;
	

	public Control(View view) {	//*** change constructor to include control later
		this.view = view;
	}

	public void showView(boolean visible) {
      view.setVisible(visible);
   }
}