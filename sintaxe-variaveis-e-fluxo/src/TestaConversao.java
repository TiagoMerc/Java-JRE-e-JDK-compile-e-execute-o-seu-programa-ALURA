
public class TestaConversao {
	
	public static void main(String[] args) {
		System.out.println("\tConversões");
		
		float pontoFlutuante = 3.14f; //O "f" é para dizer o número é um float
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		//long numeroGrande = 32432423523L; //O "l ou L" é para dizer o número é um long
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
