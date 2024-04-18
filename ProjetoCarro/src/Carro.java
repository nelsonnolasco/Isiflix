// leia-se: DEFINIÇÃO DO TIPO DADO "CARRO"
public class Carro {
	
	//Características
	String marca;
	String modelo;
	int ano;
	String cor;
	int km;
	double preco;
	
	// Criar um "Botão" para que eu possa executar algo (mostrar os dados)
	
	void exibirAnuncio(){
		
		System.out.println("\n Anúncio do Carro \n" );
		System.out.println(marca + "-" + modelo + " (" + ano + ")");
		System.out.println("Cor: " + cor + "KM" + km + " R$ " + preco );
	}
	
	void SimularSeguro(int perfil) {
		if (perfil ==0) {
			System.out.println("Perfil: Idoso - 1,5%");
			System.out.println("R$ " + preco * 0.025);
		}
		else if (perfil == 1) {
			System.out.println("Perfil: Chefe de família - 2.5%");
			System.out.println("R$ " + preco * 0.025);
		}
		else if (perfil == 2) {
			System.out.println("Perfil: Jovem - 14%");
			System.out.println("R$ " + preco * 0.14);
		}
		else {
			System.out.println("Não temos este perfil");
		}
				
	}
	
	double calcularIPVA(){
		double valorIPVA;
		if (ano <= 2002) {
			valorIPVA = 0;
		}
		else {
			valorIPVA = preco * 0.035;
		}
		return valorIPVA;
		
		
	}

}
