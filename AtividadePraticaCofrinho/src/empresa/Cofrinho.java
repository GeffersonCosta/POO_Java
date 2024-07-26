package empresa;

import java.util.ArrayList;

public class Cofrinho{
	
	 private ArrayList <Moeda> listaMoedas = new ArrayList();
	
	 
	public void adicionar(Moeda valor) {
		listaMoedas.add(valor);
	}
	public void remover(Moeda valor){
		listaMoedas.remove(valor);
	}
	public void listagemMoedas(){
		for(Moeda moedas : listaMoedas) {
			moedas.info();
		}
	}
	public void totalConvertido() {
		double total = 0;
		for(Moeda moedas : listaMoedas) {
			total += moedas.Converter();
		}
		System.out.printf("Valor total convertido: R$ %.2f \n",total);
	}
	

}
