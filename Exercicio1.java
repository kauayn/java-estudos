import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        while (true) { 
            try {

                double v1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 1° nota:"));
                double v2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 2° nota:"));
                double v3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 3° nota:"));
                double med = (v1 + v2 + v3) / 3;

                if(v1 < 0 || v1 >10 || v2 < 0 || v2 > 10 || v3 < 0 || v3 > 10) {
                    JOptionPane.showMessageDialog(null, "Valor invalido, insira novamente!");
                    continue; 
                    } else if(med < 7) {
                        JOptionPane.showMessageDialog(null, String.format("Sua media é de %.2f, você está REPROVADO!", med));
                    } else if(med >= 7) {
                        JOptionPane.showMessageDialog(null, String.format("Sua media é de %.2f, Você está APROVADO!", med));
                    }
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, Insira somente numeros!");
            }
        }
        JOptionPane.showMessageDialog(null, "Fim do programa!");
    }
}