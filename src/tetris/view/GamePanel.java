package tetris.view;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import tetris.GlobalVariables;

import javax.swing.JTable;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;

public class GamePanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTable table;



	/**
	 * Create the frame.
	 */
	public GamePanel() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 400, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("TETRIS");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(Color.RED);
		lblTitle.setFont(GlobalVariables.font.deriveFont(Font.BOLD, 80));
		lblTitle.setBounds(0, 11, 384, 79);
		contentPane.add(lblTitle);
		
		DefaultTableModel model = new DefaultTableModel(40,15);
		
		// Initialize all cells with a white color
		for (int row = 0; row < model.getRowCount(); row++) {
		    for (int col = 0; col < model.getColumnCount(); col++) {
		        model.setValueAt("J", row, col);
		    }
		}
		
		table = new JTable(model);
		
		table.setDefaultRenderer(Object.class, new ImageCellRender());
		
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setRowSelectionAllowed(false);
		table.setEnabled(false);
		table.setBounds(72, 113, 264, 417);
		contentPane.add(table);
		
		
	
    }
	
}
