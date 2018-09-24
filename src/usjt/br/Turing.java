package usjt.br;

public class Turing {

	public int tamanho;
	public int contador;
	public String fita[];
	public String cadeia, aux;

	public Turing(String numero) {
		System.out.println("Iniciando Máquina de Turing\nNúmero digitado: " + numero);
		inicio(numero);
	}

	// Construtor que carrega a maquina de turing
	public void inicio(String numero) {
		contador = 1;
		cadeia = "#" + numero + "#";
		tamanho = cadeia.length();
		fita = new String[tamanho];
		for (int i = 0; i < tamanho; i++) {
			fita[i] = "" + cadeia.charAt(i);
		}

		q0();
	}

	// Método que move a máquina de turing para a direita
	private void moveDireita() {
		contador++;
	}

	// Método que move a máquina de turing para a esquerda
	private void moveEsquerda() {
		contador--;
	}

	// Método que verifica se foram digitados caracteres válidos para a máquina de
	// turing
	public void isValido(String param, int contador) {
		System.err.println("\nÍndice Inválido: " + contador + "\nCaracter: " + param + "\n");
	}
	
	public boolean isFim(int contador, int tamanho) {
		
		if(contador < tamanho) {
			return true;
		}
		else {
			return false;
		}
	}

	// Verifica o estado inicial
	private void q0() {
		aux = fita[contador];
		if (aux.equals("0")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q1");

			q1();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nCadeia vazia ... !\n");
		}

		else {
			isValido(aux, contador);
		}
	}

	// Verifica o primeiro estado
	private void q1() {

		aux = fita[contador];
		if (aux.equals("0")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " -> Move para Direita -> Entra em q2");

			q2();
		}

		else if (aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4") || aux.equals("5")
				|| aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q8");

			q8();

		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q2() {
		aux = fita[contador];
		if (aux.equals("1")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q3");

			q3();
		}

		else if (aux.equals("2")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q4");

			q4();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q3() {
		aux = fita[contador];
		if (aux.equals("5")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q5");

			q5();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q4() {
		aux = fita[contador];
		if (aux.equals("1")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q5");

			q5();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q5() {
		aux = fita[contador];
		if (aux.equals("3")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q6");

			q6();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q6() {
		aux = fita[contador];
		if (aux.equals("3")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q7");

			q7();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q7() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q8");

			q8();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q8() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q9");

			q9();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q9() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q10");

			q10();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q10() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q11");

			q11();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q11() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q12");

			q12();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q12() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q13");

			q13();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q13() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q14");

			q14();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q14() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q15");

			q15();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q15() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Entra em q16");

			q16();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void q16() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveDireita();

			System.out.println("Lê " + aux + " -> Substitui por " + aux + " - > Move para Direita -> Move para o estado Final");

			fim();
		}

		else if (aux.equals("#")) {

			fita[contador] = "#";
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido!\n");
		}

		else {
			isValido(aux, contador);
		}

	}

	private void fim() {
		aux = fita[contador];
		if (aux.equals("0") || aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4")
				|| aux.equals("5") || aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")) {

			fita[contador] = aux;
			moveEsquerda();

			System.err.println("\nNúmero digitado inválido! Excesso de caracteres\n");
		}

		
		else {
			if(isFim(contador, fita.length)) {
				System.out.println("Máquina de Turing finalizada. Número Aceito!");
			}
			else {
				isValido(aux, contador);
			}
		}

	}

}
