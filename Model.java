import java.util.ArrayList;

import java.beans.PropertyChangeListener;
import javax.swing.event.SwingPropertyChangeSupport;

public class Model implements InterfaceModel {

	private ArrayList<Game> gameList = new ArrayList<Game>();
	
	private SwingPropertyChangeSupport propChangeSupport = new SwingPropertyChangeSupport(this);



	// Database section
	DataAccessObject dataAccessObject = new DataAccessObject();

	public void addRecord(Game game) {
		dataAccessObject.addRecord(game);
	}
	// End of database section



	
	@Override
	public void addGame(Game game) {
		gameList.add(game);
	}

	@Override
	public ArrayList<Game> getGameList() {
		return gameList;
	}

	@Override
   	public void addPropertyChangeListener(PropertyChangeListener listener) {
     	 propChangeSupport.addPropertyChangeListener(listener);
  	}

   	@Override
   	public void removePropertyChangeListener(PropertyChangeListener listener) {
     	 propChangeSupport.removePropertyChangeListener(listener);
  	}


}