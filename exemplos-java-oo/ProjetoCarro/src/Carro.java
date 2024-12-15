// leia-se: Definição do tipo de dado "Carro"
public class Carro {
	
	// características
	private String marca;
	private String modelo;
	private int    ano;
	private String cor;
	private int    km;
	private double preco;
	
	public Carro(String marca, String modelo, int ano, String cor, int km, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.km = km;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// criar um "Botao" para que eu possa executar algo (mostrar os dados)
	public void exibirAnuncio(){
		System.out.println("Anunico do Carro:");
		System.out.println(this.marca+"-"+this.modelo+" ("+this.ano+")");
		System.out.println("Cor: "+this.cor+"  KM: "+this.km+"  R$ "+this.preco);
	}
	
	public void simularSeguro(int perfil) {
		if (perfil == 0) {
			System.out.println("Perfil: Idoso - 1.5%");
			System.out.println("R$ "+preco*0.015);
		}
		else if (perfil == 1) {
			System.out.println("Perfil: Chefe de Família - 2.5%");
			System.out.println("R$ "+preco*0.025);
		}
		else if (perfil == 2) {
			System.out.println("Perfil: Jovem - 14%");
			System.out.println("R$ "+preco*0.14);
		}
		else {
			System.out.println("Não temos este perfil");
		}
	}
	
	public double calcularIPVA(){
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
