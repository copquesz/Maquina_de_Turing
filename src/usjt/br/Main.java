package usjt.br;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Digite o número que será lido pela Máquina de Turing");
		
		Turing turing = new Turing(numero);

	}

}
