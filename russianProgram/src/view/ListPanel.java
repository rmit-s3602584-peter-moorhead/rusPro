package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import model.Vocab;

public class ListPanel extends JPanel{
	
	List<Vocab> vocab1 = new ArrayList<Vocab>();
	JTable table;
	JScrollPane scroll;
	
	
	
	Color g = new Color(44, 47, 51);
	Color bl = new Color(35, 39, 42);
	Color lg = new Color(153,170,181);
	
	JTextField id = new JTextField(5);
	JTextField english = new JTextField(10);
	JTextField russian = new JTextField(10);
	
	JButton add = new JButton("Add");
	
	BorderLayout border = new BorderLayout();
	GridLayout grid = new GridLayout(1, 5);
	JPanel south = new JPanel(grid);
	
	public ListPanel(List<Vocab> vocab) {
		this.vocab1 = vocab;
		this.setBackground(bl);
		
		add(south, BorderLayout.SOUTH);
		setLayout(border);
		
		String[] columnNames = {"ID", "English", "Russian"};
		
		DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
		JTable table1 = new JTable(tableModel);
		
		//not allow user to edit table
		table1.setEnabled(false);
		table1.getTableHeader().setReorderingAllowed(false);
		
		table1.setBackground(bl);
		table1.setForeground(lg);
		
		
		
		//fill table with vocab data
		for(int i = 0; i<vocab1.size(); i++) {
			String english = vocab1.get(i).getEng();
			String russian = vocab1.get(i).getRus();
			String id = vocab1.get(i).getId();
			
			String[] data1 = {id, english, russian};
			
			tableModel.addRow(data1);
		}

		scroll = new JScrollPane(table1);
		
		
		scroll.setBackground(g);
		scroll.setForeground(g);
		
		
		add(scroll);
		
		south.add(id);
		south.add(english);
		south.add(russian);
		south.add(add);
		
	}
	
}
