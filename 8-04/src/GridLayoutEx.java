import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame{
	private Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GRAY,
			Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
			Color.PINK, Color.LIGHT_GRAY};
	
	public GridLayoutEx() {
		super("GridLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new GridLayout(1, 10));
		
		for(int i=0; i<10; i++) {
			String text = Integer.toString(i);
			JButton button = new JButton(text);
			button.setOpaque(true);
			button.setBackground(color[i]);
			contentPane.add(button);
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
