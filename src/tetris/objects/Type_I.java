package tetris.objects;

import java.util.ArrayList;

import javax.swing.JTable;

public class Type_I extends Piece {
	
	private ArrayList<ArrayList<Integer>> pieceCells = new ArrayList<ArrayList<Integer>>();  
	
	private int[][] test = { 
						{7, 0}, 
						{7, -1}, 
						{7, -2}, 
						{7, -3}
					};
	
	public Type_I(JTable table) {
		super(table);
		
		super.table.setValueAt("I", 0, 7);
		/*
		ArrayList<Integer> cell1 = new ArrayList<Integer>();
		ArrayList<Integer> cell2 = new ArrayList<Integer>();
		ArrayList<Integer> cell3 = new ArrayList<Integer>();
		ArrayList<Integer> cell4 = new ArrayList<Integer>();	
		cell1.add(7,0);
		cell2.add(7,-1);
		cell3.add(7,-2);
		cell4.add(7,-3);
		pieceCells.add(cell1);
		pieceCells.add(cell2);
		pieceCells.add(cell3);
		pieceCells.add(cell4);
		*/
	}
	
	@Override
	public void run() {
		do {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for (int i = 0; i < test.length; i++) {
				if (test[i][1] > 0) {
					super.table.setValueAt("I", test[i][0], test[i][1]);
					super.table.setValueAt("", test[i][0], test[i][1] - 1);
				}

				test[i][1]++;
			}
			/*
			for (int i = 0; i < pieceCells.size(); i++) {
				if (pieceCells.get(i).get(1) > 0) {
					super.table.setValueAt("I", pieceCells.get(i).get(0), pieceCells.get(i).get(1));
					super.table.setValueAt("", pieceCells.get(i).get(0), pieceCells.get(i).get(1)-1);
				}
		
				pieceCells.get(i).set(pieceCells.get(i).get(0) , pieceCells.get(i).get(i)+1);
			}
			*/
			/*
			super.y++;
			super.table.setValueAt("I", super.y, super.x);
			super.table.setValueAt("", super.y-1, super.x);
			System.out.println(y);
			*/
			
		} while (super.always);

	}

}
