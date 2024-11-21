package tetris.objects;

import javax.swing.JTable;

public class Test extends Thread{

	private String dir = "neutral";
	private boolean always = true;
	private JTable table;
	
	private int x = 0;
	private int y = 0;
	
	public Test(JTable table) {
		this.table = table;
		start();
	}
	
	@Override
	public void run() {
		do {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			switch(dir) {
                case "left":
                    y++;
                    table.setValueAt("left", y, x);
                    table.setValueAt("", y-1, x);
                    Piece.y++;
                    break;
                case "right":
                    y++;
                    table.setValueAt("right", y, x);
                    table.setValueAt("", y-1, x);
                    Piece.y++;
                    break;
                case "neutral":
                	y++;
                    table.setValueAt("neutral", y, x);
                    table.setValueAt("", y-1, x);
                    Piece.y++;
                    break;
            }
			

		} while (always);

	}
	
	public void setDirLeft() {
		dir = "left";
	}
	
	public void setDirRight() {
		dir = "right";
	}
	
	public void setDirNeutral() {
		dir = "neutral";
	}
}
