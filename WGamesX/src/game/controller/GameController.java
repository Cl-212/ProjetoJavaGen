package game.controller;

import game.repository.GameRepository;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import game.model.Game;

public class GameController implements GameRepository {

	private ArrayList<Game> listaGames = new ArrayList<Game>();
	private Map<String, String> categorias = new HashMap<String, String>();

	public void CadastrarJogos() {

		listaGames.add(new Game(1, "FC24", "Sports", 529.99f));
		listaGames.add(new Game(2, "Counter Strike", "Fps", 249.99f));
		listaGames.add(new Game(3, "Call Of Duty", "BattleRoyal", 299.0f));
		listaGames.add(new Game(4, "GTA: Trilogy", "Open World", 1400.0f));
		listaGames.add(new Game(5, "RedDead R2", "Open World", 299.99f));
		listaGames.add(new Game(6, "GTA V", "Open World", 82.42f));
		listaGames.add(new Game(7, "FIFA 23", "Sports", 74.99f));
		listaGames.add(new Game(8, "Need for Speed™ Heat", "Race", 279.99f));
		listaGames.add(new Game(9, "Forza Horizon 5", "Race", 399.99f));
		
		categorias.put("2", "Sports");
		categorias.put("3", "Fps");
		categorias.put("4", "BattleRoyal");
		categorias.put("5", "Open World");
		categorias.put("6", "Race");
		

	}

	@Override
	public void listarTodas() {
		for (Game game : listaGames) {
			game.visualizar();
		}

	}

	public Game buscarGame(int id) {
		for (Game game : listaGames) {
			if (game.getId() == id) {
				return game;
			}
		}
		return null;
	}

	public void listar(int tipo) {

		String categoria = categorias.get(Integer.toString(tipo));
		for (Game game : listaGames) {
			if (game.getTipo() == categoria) {
				game.visualizar();
			}
		}

	}
}
