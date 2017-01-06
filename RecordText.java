import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

import java.util.ArrayList;


class RecordText{

	private JPanel mainPanel = new JPanel(new BorderLayout(3,3));
	//create scrollpane that can be added
	private JTextArea textArea;
	private JScrollPane scrollPane;

	ArrayList<String> gameList;


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

    public JPanel addScrollPane(){

    	scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
   	 	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
   	 	mainPanel.add(scrollPane, BorderLayout.EAST);
   	 	return mainPanel;

    }


    public JScrollPane getScrollPane() {
    	return scrollPane;
    }

    public JTextArea getTextArea() {
    	return textArea;
    }

}