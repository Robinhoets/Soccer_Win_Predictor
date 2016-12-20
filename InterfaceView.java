import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public interface InterfaceView {
	
	void setVisible(boolean visible);

	void setAddRecordAction(Action action);

	void setCalculateAction(Action action);

	void setTextAreaText(String text);

	void getTextAreaText();

}