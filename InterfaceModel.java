import java.beans.PropertyChangeListener;

public interface InterfaceModel {
	


	void addPropertyChangeListener(PropertyChangeListener listener);

	void removePropertyChangeListener(PropertyChangeListener listener);
}