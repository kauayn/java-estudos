
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        while (true) {
            String Vl = JOptionPane.showInputDialog(null, "Olá. Qual o seu nome?: ");

            if(Vl == null || Vl.equals("")) {
                JOptionPane.showMessageDialog(null, "Nome invalido, insira seu nome por favor!");
                continue;
            } {
                JOptionPane.showMessageDialog(null, "Olá " + Vl);
                break;
            }
        }
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de C: "));

        Double del = Math.pow(b, 2) - (4 * a * c);
        JOptionPane.showMessageDialog(null,"O valor de Delta é " +  del);

        Double x1 = (-b + Math.sqrt(del)) / (2 * a);
        Double x2 = (-b - Math.sqrt(del)) / (2 * a);

        if(del > 0) {
            JOptionPane.showMessageDialog(null,"O valor de x1 é "+  x1);
            JOptionPane.showMessageDialog(null,"O valor de x2 é "+  x2);
        } else {
            JOptionPane.showMessageDialog(null, "Raizes Inexistentes!");
        }

    }
}