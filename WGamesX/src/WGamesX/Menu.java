package WGamesX;

import java.util.Scanner;
import java.util.ArrayList;

import game.util.Cores;
import game.model.Game;
import game.controller.GameController;
import game.repository.GameRepository;
import game.controller.CarrinhoController;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> historico = new ArrayList<String>();
		GameController games = new GameController();
		games.CadastrarJogos();
		CarrinhoController carrinho = new CarrinhoController();

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("                    |W GAMES X|                      ");
			System.out.println("                                                     ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("            1 - Catalógo de Jogos                    ");
			System.out.println("            2 - Historico de compras                 ");
			System.out.println("            3 - Carrinho                             ");
			System.out.println("            4 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("_____________________________________________________");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 4) {
				System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
						+ "\nWGAMESX: sua Jornada de Jogos Começa Aqui!!!");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {

			case 1:
				System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + "\n\nCatalógo de Jogos\n\n");
				games.listarTodas();
				do {
					System.out.println("\n\n'Para sair digite 0'");
					System.out.println("\nSelecione os jogos (numero): ");
					int jogo = leia.nextInt();

					if (jogo == 0) {
						break;
					}

					carrinho.AdicionarGame(games.buscarGame(jogo));

				} while (true);
				break;

			case 2:
				System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + "\nHistórico de Compras\n");
				for (String compra : historico) {
					System.out.println(compra);
				}
				break;
			case 3:
				System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + "\nCarrinho - por número\n\n");
				System.out.println("\nitens do carrinho: ");
				System.out.println("\n" + carrinho.listarGames() + " \n");
				System.out.println("Valor total: " + carrinho.valorTotal() + " \n");
				System.out.print("deseja finalizar a compra? s/n ");
				leia.nextLine();
				String finalizar = leia.nextLine().toLowerCase();

				if (finalizar.equals("s")) {
					historico.add(carrinho.listarGames() + "\nValor total da compra: " +carrinho.valorTotal());
					carrinho.limparCarrinho();
					System.out.println("Compra realizada com sucesso!");
				}

				break;
			default:
				System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;

			}

		}
	}
}
