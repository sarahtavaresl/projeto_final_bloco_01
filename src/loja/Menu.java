package loja;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("            1 - Listar todos os Produtos             ");
			System.out.println("            2 - Buscar Produto por número            ");
			System.out.println("            3 - Atualizar Dados do Produto           ");
			System.out.println("            4 - Carrinho                             ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println("\nBem-vindo à loja Americanas ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Listar todos os produtos\n\n");

				break;

			case 2:
				System.out.println("Buscar Produto por número\n\n");

				break;

			case 3:
				System.out.println("Atualizar dados do Produto\n\n");

				break;

			case 4:
				System.out.println("Carrinho\n\n");

				break;

			case 5:
				System.out.println("Sair\n\n");

				break;
			}
		}
	}

	private static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Sarah Tavares");
		System.out.println("Contato: sarahtavarez.lima@gmail.com");
		System.out.println("https://github.com/sarahtavaresl");
		System.out.println("*********************************************************");
	}

}
