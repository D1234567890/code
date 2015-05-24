import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		boolean z = true;
		while (z) {
			String a = JOptionPane
					.showInputDialog("If you want me to multiply your numbers type 1.  If you want me to add your numbers type 2. If you want me to subtract your numbers type 3.");
			while (!a.equalsIgnoreCase("1") && !a.equalsIgnoreCase("2")
					&& !a.equalsIgnoreCase("3")) {
				a = JOptionPane.showInputDialog("Type either 1, 2, or 3.");
			}
			if (a.equalsIgnoreCase("1")) {
				String b = JOptionPane
						.showInputDialog("Type your first number.");
				String c = JOptionPane
						.showInputDialog("Type your second number.");
				int d = Integer.parseInt(b);
				int e = Integer.parseInt(c);
				JOptionPane.showMessageDialog(null, multiply(d, e));
			} else if (a.equalsIgnoreCase("2")) {
				String g = JOptionPane
						.showInputDialog("Type your first number.");
				String h = JOptionPane
						.showInputDialog("Type your second number.");
				int i = Integer.parseInt(g);
				int j = Integer.parseInt(h);
				JOptionPane.showMessageDialog(null, add(i, j));
			} else if (a.equalsIgnoreCase("3")) {
				String l = JOptionPane
						.showInputDialog("Type your first number.");
				String m = JOptionPane
						.showInputDialog("Type your second number.");
				int n = Integer.parseInt(l);
				int o = Integer.parseInt(m);
				JOptionPane.showMessageDialog(null, subtract(n, o));
			}
			String q = JOptionPane
					.showInputDialog("Would you like me to solve another problem?");
			if (q.equalsIgnoreCase("yes")) {

			} else if (q.equalsIgnoreCase("no")) {
				z = false;
			}
		}
	}

	static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	static int add(int num3, int num4) {
		return num3 + num4;
	}

	static int subtract(int num5, int num6) {
		return num5 - num6;
	}
}
