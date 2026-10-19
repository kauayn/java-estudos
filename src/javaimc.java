//Diz que essa classe esta dentro do pacote "teste";
package teste;

//Importa a classe "Scanner", que permite ler dados do teclado;
import java.util.Scanner;

//Cria a classe chamada "javaimc";
public class javaimc {
	
	//Define o inicio da execução do codigo;
	public static void main(String[] args) {
		
		//Cria um objeto Scanner chamado "sc";
		//Serve para ler dados digitados pelo usuario "System.in";
		Scanner sc = new Scanner(System.in);
		
		//Exibe a mensagem "Digite seu peso em (kg): " 
		System.out.print("Digite seu peso em (kg): ");
		//(peso) Lê o numero digitado pelo usuario e guarda na variavel "peso";
		double peso = sc.nextDouble();
		
		
		System.out.print("Digite sua altura em (m): ");
		double alt = sc.nextDouble();
		
		//Cria uma variavel do tipo texto vazia. Utilizada para guardar os biotipos posteriormente citados;
		String biotipo = "";
		double imc = peso / (alt * alt);
		
		//Arredondamento, diminuindo duas casas decimais;
		imc = Math.round(imc * 100.0) / 100.0;
		
		//se "imc" for menos doq  tal, exibira o resultado do imc + resultado do biotipo;
		if (imc < 18.5) {
			biotipo = "Abaixo do peso";
			System.out.println("Seu imc é de " + imc + ", " + biotipo + "!");
		}else if (imc < 24.9) {
			biotipo = "Peso normal";
			System.out.println("Seu imc é de " + imc + ", " + biotipo + "!");
		} else if (imc < 29.9) {
			biotipo = "Sobrepeso";
			System.out.println("Seu imc é de " + imc + ", " + biotipo + "!");
		} else if (imc < 34.9) {
			biotipo = "Obesidade Grau 1";
			System.out.println("Seu imc é de " + imc + ", " + biotipo + "!");
		} else if (imc < 39.9) {
			biotipo = "Obesidade Grau 2";
			System.out.println("Seu imc é de " + imc + ", " + biotipo + "!");
		} else if (imc > 40) {
			biotipo = "Obesidade Grau 3";
			System.out.println("Seu imc é de " + imc + ", " + biotipo + "!");
		}
		


	}

	
	

}
