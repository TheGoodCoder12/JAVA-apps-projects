import javax.swing.JOptionPane;

public class Hypo {
    public static void main(String[] args) {
        double base, height;
        base=Double.parseDouble(JOptionPane.showInputDialog("Enter the base: ")); 
        if (base<=0) {
            JOptionPane.showMessageDialog(null, "Wrong Input!", "Hypotenuse Calculator", 1);
            return;
        }
        height=Double.parseDouble(JOptionPane.showInputDialog("Enter the height: ")); 
        if (height<=0) {
            JOptionPane.showMessageDialog(null, "Wrong Input!", "Hypotenuse Calculator", 1);
            return;
        }
        double hypotenuse=Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
        JOptionPane.showMessageDialog(null, "Ok, so the hypotenuse is: "+ hypotenuse, "Hypotenuse Calculator", 1);
    }
}
