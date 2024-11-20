package tetris;

import java.awt.Font;
import java.io.InputStream;

import tetris.view.GamePanel;


public class App {
	

	public static void main(String[] args) {
		try {
			InputStream is = App.class.getResourceAsStream("/fonts/x12y16pxMaruMonica.ttf");
			GlobalVariables.font = Font.createFont(Font.TRUETYPE_FONT, is);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		startGame();

	}
	
	private static void startGame() {
		GamePanel gm = new GamePanel();
		gm.setVisible(true);
	}

}
