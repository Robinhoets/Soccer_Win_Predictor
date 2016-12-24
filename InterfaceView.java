import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public interface InterfaceView {
	
	void setVisible(boolean visible);

	void setAddRecordAction(Action action);

	void setShowRecordsAction(Action action);

	void setDeleteRecordAction(Action action);

	void setCalculateAction(Action action);

	void setGraphAction(Action action);

	void resetTextBoxes();

}