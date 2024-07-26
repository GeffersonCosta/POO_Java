package empresa;

import java.util.Scanner;

public class Principal {
	
	
	public static void telaPrincipal() { // metodo criado para imprimir o menu na tela poupando linhas de codigo e evitando excesso de linhas reptidas
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar Moeda: ");
		System.out.println("2-Remover Moeda: ");
		System.out.println("3-Listar Moedas: ");
		System.out.println("4-Calcular total em Real: ");
		System.out.println("0-Encerrar");
	}
	public static void telaSecundaria() { // metodo criado para imprimir o menu na tela poupando linhas de codigo e evitando excesso de linhas reptidas
		System.out.println("Escolha Moeda: ");
		System.out.println("1-Real: ");
		System.out.println("2-Dolar: ");
		System.out.println("3-Euro: ");
	}
	public static void main(String[] args) {
		Cofrinho cofrinho = new Cofrinho();
		Scanner teclado = new Scanner(System.in);
		telaPrincipal();
		int opcao = teclado.nextInt();
		while(opcao != 0) {
			switch(opcao){
				case 1:
					telaSecundaria();
					opcao = teclado.nextInt();
					while(opcao < 1 || opcao > 3) {
						System.out.println("Opção inválida: ");
						telaSecundaria();
						opcao = teclado.nextInt();
					}
					if(opcao == 1) {
						System.out.println("Digite o valor: ");
						cofrinho.adicionar(new Real(teclado.nextDouble()));
						
					}else if(opcao == 2){
						System.out.println("Digite o valor: ");
						cofrinho.adicionar(new Dolar(teclado.nextDouble()));
					}else {
						System.out.println("Digite o valor: ");
						cofrinho.adicionar(new Euro(teclado.nextDouble()));
					}
					break;
				case 2:
					telaSecundaria();
					opcao = teclado.nextInt();
					while(opcao < 1 || opcao > 3) {
						System.out.println("Opção inválida: ");
						telaSecundaria();
						opcao = teclado.nextInt();
					}
					if(opcao == 1) {
						System.out.println("Digite o valor: ");
						cofrinho.remover(new Real(teclado.nextDouble()));
						
					}else if(opcao == 2){
						System.out.println("Digite o valor: ");
						cofrinho.remover(new Dolar(teclado.nextDouble()));
						
					}else {
						System.out.println("Digite o valor: ");
						cofrinho.remover(new Euro(teclado.nextDouble()));		
					}
					break;
				case 3:
					cofrinho.listagemMoedas();
					break;
				case 4:
					cofrinho.totalConvertido();
					break;
				default:
					System.out.println("Opção inválida");
			}
			telaPrincipal();
			opcao = teclado.nextInt();
		}
		System.out.println("Encerrando programa!");
		
		
		

		

			
			

		
		
	
	
		
	}

}
