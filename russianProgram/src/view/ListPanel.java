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
	
	public ListPanel(List<Vocab> vocab) {
		this.vocab1 = vocab;
		this.setBackground(Color.YELLOW);
		System.out.println(vocab1.get(0).getEng());
		
		String[][] data = {{"English", "кгыыфш"},{"English", "кгыыфш"},{"English", "кгыыфш"}};
		String[] columnNames = {"English", "Russian"};
		
		//SOLUTION?
		/*for(int i = 0; i<vocab1.size(); i++) {
			for(int j = 0; j<vocab1.size(); j++) {
				data[i][j] = vocab1.get(i).getEng();
			}
		}*/
		
		table = new JTable(data, columnNames);
		
		scroll = new JScrollPane(table);
		
		add(scroll);
		//THIS IS BROKEN
		/*
		TableModel tableModel = new DefaultTableModel(data, columnNames);

		JTable table1 = new JTable(tableModel);
		
		Object rowData[] = new Object[2];
        for(int i = 0; i < vocab1.size(); i++)
        {
            rowData[0] = vocab1.get(i).getEng();
            rowData[1] = vocab1.get(i).getRus();
            ((DefaultTableModel) tableModel).addRow(rowData);
        }*/
	}
	
}
