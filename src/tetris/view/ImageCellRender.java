package tetris.view;

import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class ImageCellRender extends DefaultTableCellRenderer{
	/*
	private final ImageIcon iconI = new ImageIcon("path_to_I_image.png");
    private final ImageIcon iconO = new ImageIcon("path_to_O_image.png");
    private final ImageIcon iconT = new ImageIcon("path_to_T_image.png");
    private final ImageIcon iconS = new ImageIcon("path_to_S_image.png");
    private final ImageIcon iconZ = new ImageIcon("path_to_Z_image.png");
    private final ImageIcon iconJ = new ImageIcon("path_to_J_image.png");
    private final ImageIcon iconL = new ImageIcon("path_to_L_image.png");
    */
	private final ImageIcon imgTest = new ImageIcon(getClass().getResource("/img/hola.jpg"));
	private final ImageIcon resizedIcon = scaleImage(imgTest,20,20);
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        label.setText(""); // Clear text
        
        // Set the appropriate icon based on the cell value
        if (value != null) {
            switch (value.toString()) {
                case "I":
                    label.setIcon(resizedIcon);
                    break;
                case "O":
                    label.setIcon(resizedIcon);
                    break;
                case "T":
                    label.setIcon(resizedIcon);
                    break;
                case "S":
                    label.setIcon(resizedIcon);
                    break;
                case "Z":
                    label.setIcon(resizedIcon);
                    break;
                case "J":
                    label.setIcon(resizedIcon);
                    break;
                case "L":
                    label.setIcon(resizedIcon);
                    break;
                default:
                    label.setIcon(null); // No icon
                    break;
            }
        }
        
        label.setHorizontalAlignment(SwingConstants.CENTER); // Center align
        return label;
    }
    
    private ImageIcon scaleImage(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImg);
    }
}
