package Produto.Repository;

public interface ProdutoRepository {
	
	public interface ContaRepository {
		
		public void procurarPorProduto(int numero);
		public void ListarTodos();
		public void cadastrar();
		public void atualizar();
		public void deletar();
		
		public void  adicionarnocarrinho();
		
		
	}

		
		

}
