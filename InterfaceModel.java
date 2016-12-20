import java.beans.PropertyChangeListener;

public interface InterfaceModel {
	
	String getText();
	
	void setText(String text);

	void addPropertyChangeListener(PropertyChangeListener listener);

	void removePropertyChangeListener(PropertyChangeListener listener);
}