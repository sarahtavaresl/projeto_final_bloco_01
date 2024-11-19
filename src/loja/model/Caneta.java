package loja.model;

public class Caneta extends Produto{
	
	private String tipo;

	public Caneta(String nomeProduto, String marcaProduto, float precoProduto, String tipo) {
		super(nomeProduto, marcaProduto, precoProduto, tipo);
		this.tipo = tipo;
	
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
	    super.visualizar();  
	    System.out.println("Tipo de caneta: " + this.tipo);  
	    
	 
	}

		
		
		
		
		

	

	
	}
	
	

	
	
	
	
	

