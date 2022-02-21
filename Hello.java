import javax.swing.*;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello World " + args[0]);

		JFrame jFrame = new JFrame("Hello Java");
		jFrame.setSize(800, 600);

		JTextPane jTextPane = new JTextPane();
		jTextPane.setText("I LOVE JAVA");

		jFrame.add(jTextPane);
		//ВСе ОК :)

		jFrame.setVisible(true);
	}
}