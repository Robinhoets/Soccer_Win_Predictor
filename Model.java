import java.util.ArrayList;

import java.beans.PropertyChangeListener;
import javax.swing.event.SwingPropertyChangeSupport;

public class Model implements InterfaceModel {

	private ArrayList<String> gameList = new ArrayList<String>();
	
	private SwingPropertyChangeSupport propChangeSupport = new SwingPropertyChangeSupport(this);



	// Database section
	DataAccessObject dataAccessObject = new DataAccessObject();

	public void addRecord(Game game) {
		dataAccessObject.addRecord(game);
	}

	public ArrayList<String> getAllRecords() {		// turn into return type arraylist of stringbuilder and return to ShowRecordsAction
		try {

			gameList = dataAccessObject.readDatabaseAndCreateArrayList();

		} catch (Exception e)
          {
              System.err.println("Got an exception!");
              System.err.println(e.getMessage());
          }
		return gameList;

	}
	

	public void deleteRecord(int recordNumber) {
		dataAccessObject.deleteRecord(recordNumber);
		
	}
	// End of database section

	public void testRModel() {
		RFunctions rf = new RFunctions();
		rf.testR();
	}



	/*
	@Override
	public void addGame(Game game) {
		gameList.add(game);
	}

	@Override
	public ArrayList<Game> getGameList() {
		return gameList;
	}
	*/

	@Override
   	public void addPropertyChangeListener(PropertyChangeListener listener) {
     	 propChangeSupport.addPropertyChangeListener(listener);
  	}

   	@Override
   	public void removePropertyChangeListener(PropertyChangeListener listener) {
     	 propChangeSupport.removePropertyChangeListener(listener);
  	}


}