package loja.model;

public abstract class Produto {

	private String nomeProduto;
	private String marcaProduto;
	private float precoProduto;
	private String tipo;

	public Produto(String nomeProduto, float precoProduto, String marcaProduto, String tipo) {
		super();
		this.nomeProduto = nomeProduto;
		this.marcaProduto = marcaProduto;
		this.precoProduto = precoProduto;
		this.tipo = tipo;
	}
	

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
		
		 
	}

	 public void visualizar() {
	        System.out.println("Nome do Produto: " + nomeProduto);
	        System.out.println("Marca do Produto: " + marcaProduto);
	        System.out.println("Preço do Produto: R$" + precoProduto);
	    }

	private void exibirDetalhes() {
		

	}



		
		
	}


}
