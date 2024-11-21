package tetris.objects;

import javax.swing.JTable;

public class Piece extends Thread{
	
	private Test test;
	
	private String dir = "neutral";
	protected boolean always = true;
	protected JTable table;
	
	//protected int x = 0;
	//protected int y = 7;
	
	public Piece(JTable table) {
		this.table = table;
		
		//this.test = new Test(table);
	}
	
	public Piece() {

	}

	
	public void setDirLeft() {
		dir = "left";
		test.setDirLeft();
	}
	
	public void setDirRight() {
		dir = "right";
		test.setDirRight();
	}
	
	public void setDirNeutral() {
		dir = "neutral";
		test.setDirNeutral();
	}
	

	
}
