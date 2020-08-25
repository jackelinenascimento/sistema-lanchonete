package lanchonete;

public class Massa extends Lanche{
	String molho;
	String[] tipos = {"macarrao", "pizza", "lasanha"};
	
	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
}
