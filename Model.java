import java.beans.PropertyChangeListener;
import javax.swing.event.SwingPropertyChangeSupport;

public class Model implements InterfaceModel {
	
	private String text;
	private SwingPropertyChangeSupport propChangeSupport = new SwingPropertyChangeSupport(this);

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		String newValue = text;
		String oldValue = this.text;
		this.text = newValue;
		propChangeSupport.firePropertyChange(text, oldValue, newValue);
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