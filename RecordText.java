import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;


class RecordText{

	//create scrollpane that can be added
	JTextArea textArea;
	JScrollPane scrollPane;


	public RecordText() {

		textArea = new JTextArea(5, 70);
		scrollPane = new JScrollPane(textArea);
	}

	
	public void  addGameListToScrollPane(ArrayList<String> gameList) {

    	textArea.setText("");
    	for(int i=0; i<gameList.size(); i++) {  		
    		textArea.append(gameList.get(i));	
    	}

    }

    public void addScrollPane(){

    	scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
   	 	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    }

    public JScrollPane getScrollPane() {
    	return scrollPane;
    }

    public JTextArea getTextArea() {
    	return textArea;
    }

}