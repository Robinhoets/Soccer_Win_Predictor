import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public interface InterfaceModel {
	
	//void addGame(Game game);

	//ArrayList<Game> getGameList();

	void addPropertyChangeListener(PropertyChangeListener listener);

	void removePropertyChangeListener(PropertyChangeListener listener);
}