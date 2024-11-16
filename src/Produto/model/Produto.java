package Produto.model;

public abstract class Produto {

	private String nomeProduto;
	private String marcaProduto;
	private Double precoProduto;

	public Produto(String nomeProduto, String marcaProduto, Double precoProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.marcaProduto = marcaProduto;
		this.precoProduto = precoProduto;
	}
	

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public static void main(String[] args) {

		Produto caneta1 = new Produto("Caneta Esferográfica", "Bic", 1.50);
		Produto caneta2 = new Produto("Caneta Gel", "Stabilo", 3.00);

		caneta1.exibirDetalhes();
		caneta2.exibirDetalhes();

		 
	}

	private void exibirDetalhes() {
		

	}

}
