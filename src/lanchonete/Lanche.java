package lanchonete;

public abstract class Lanche {
	
	private double preco;
	
	public Lanche() {}
	
	public Lanche(double preco) {
		this.setPreco(preco);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double tempo(double distancia) {
		return distancia * 10;
	}
}
