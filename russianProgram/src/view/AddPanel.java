package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import model.Vocab;

public class AddPanel extends JPanel{

	Color g = new Color(44, 47, 51);
	Color bl = new Color(35, 39, 42);
	Color lg = new Color(153,170,181);
	
	List<Vocab> vocab1 = new ArrayList<Vocab>();
	
	public AddPanel(List<Vocab> vocab) {
		this.vocab1 = vocab;
		
	}
	
}
