package Produto.controller;

import java.util.ArrayList;

import loja.model.Produto;
import loja.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
    int numero = 0 ;
    
	@Override
	public void procurarPorProduto(int numero) {

	}

	@Override
	public void listarTodos() {
		for (var produto : listaProduto) {
			produto.visualizar();
		}

	}

	@Override
	public void cadastrar(Produto produto) {

	}

	@Override
	public void atualizar(Produto produto) {

	}

	@Override
	public void deletar(int numero) {

	}

}
