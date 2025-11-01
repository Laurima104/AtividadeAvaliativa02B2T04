package fag.objetos;

public class Carros {
	private String modelo;
	private int ano;
	private String cor;
	
	public Carros() {
		
	}
	
	public Carros(String modelo, int ano, String cor) {
		 setModelo(modelo);
		 setAno(ano);
		 setCor(cor);
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		if(modelo!=null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		if(ano>1884 && ano<2026) {
			this.ano = ano;
		}
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		if(cor!=null && !cor.isBlank()) {
			this.cor = cor;
		}
	}
	
	public void carro() {
		System.out.printf("Modelo: %s, Ano: %d, Cor: %s", modelo, ano, cor);
	}
}
