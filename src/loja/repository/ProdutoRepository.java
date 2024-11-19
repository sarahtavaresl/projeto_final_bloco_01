package loja.repository;

import loja.model.Produto;

public interface ProdutoRepository {
	
	public interface ContaRepository {
		
		public void procurarPorProduto(int numero);
		public void listarTodos();
		public void cadastrar(Produto produto);
		public void atualizar(Produto produto);
		public void deletar(int numero);
		
		
		
	}

		
		

}
