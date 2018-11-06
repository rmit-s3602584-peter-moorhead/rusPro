package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
	
	public ListPanel(List<Vocab> vocab) {
		this.vocab1 = vocab;
		this.setBackground(bl);
		
		String[] columnNames = {"English", "Russian"};
		
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
			
			String[] data1 = {english, russian};
			
			tableModel.addRow(data1);
		}

		scroll = new JScrollPane(table1);
		
		
		scroll.setBackground(g);
		scroll.setForeground(g);
		
		
		add(scroll);
	}
	
}
