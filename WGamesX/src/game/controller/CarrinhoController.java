package game.controller;

import java.util.ArrayList;

import game.model.Game;

public class CarrinhoController {

	private ArrayList<Game> carrinho = new ArrayList<Game>();


	public void AdicionarGame(Game game) {
		carrinho.add(game);
	}

	public String listarGames() {
	    String str = "", str_aux;
		for (Game game : carrinho) {
			str_aux = "\n\nnome: " + game.getNome() + "\nvalor: " + game.getPreco();
			str += str_aux;
		}
		return str;
	}

	public String valorTotal() {
		float total = 0;
		for (Game game : carrinho) {
			total += game.getPreco();
		}
		return String.format("%.2f", total);
	}

	public void limparCarrinho() {
		carrinho.clear();
	}

}
