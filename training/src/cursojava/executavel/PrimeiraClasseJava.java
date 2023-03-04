package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class PrimeiraClasseJava {
	/*Main é um metodo auto executavel em java - blalalal*/
	public static void main(String[] args) {
		List<Double> numeros = Arrays.asList(4.99,49.92,34.99,54.97,125.00,5.5,28.67,12.5,227.32,13.96,68.29,19.66,25.92);
		double resultado = somarNumero(numeros);
		private Date dataNascimento;
		System.out.println("A soma da lista é " + resultado);
	}
	
	public static double somarNumero(List<Double> numeros) {
		double soma = 0.00;
		
		for(double numero : numeros) {
			soma += numero;
		}
		
		return soma;
	}
}
