package br.com.honda.teste;
import br.com.honda.beans.Carro;

public class Programa  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Carro carro = new Carro();
     
     carro.setNome("Civic");
     
     System.out.println("Nome do Carro " + carro.getNome());
     
     carro.setQuantidadeRodas(4);
     carro.setQuantidadeDeJanelas(6);
     carro.setCapacidadeCombustivel(5500);
     
     System.out.println("Quantidade de Rodas " +  carro.getQuantidadeRodas()
     + "\nQuantidade de Janelas " + carro.getQuantidadeDeJanelas()
     + "\n\tCapacidade de Combustivel " + carro.getCapacidadeCombustivel()
      );
   

	}
}
