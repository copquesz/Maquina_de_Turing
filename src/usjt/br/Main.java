package usjt.br;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Digite o n�mero que ser� lido pela M�quina de Turing");
		
		Turing turing = new Turing(numero);

	}

}
