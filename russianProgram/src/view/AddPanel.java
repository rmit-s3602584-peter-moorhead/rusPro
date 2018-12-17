package view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Vocab;

public class AddPanel extends JPanel{

	Color g = new Color(44, 47, 51);
	Color bl = new Color(35, 39, 42);
	Color lg = new Color(153,170,181);
	
	List<Vocab> vocab1 = new ArrayList<Vocab>();
	
	JTextField id = new JTextField(5);
	JTextField english = new JTextField(10);
	JTextField russian = new JTextField(10);
	
	JButton add = new JButton("Add");
	
	public AddPanel(List<Vocab> vocab) {
		this.vocab1 = vocab;
		
		add(id);
		add(english);
		add(russian);
		add(add);
		
		
	}
	
}
