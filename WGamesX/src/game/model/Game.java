package game.model;

public class Game {

	private int id;
	private String nome;
	private String tipo;
	private float preco;

	public Game(int id, String nome, String tipo, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		System.out.println("\n\n____________________________________");
		System.out.println("\nNumero do produto: " + this.id);
		System.out.println("\nJogo: " + this.nome);
		System.out.println("\nCategoria: " + this.tipo);
		System.out.println("\nValor do produto: " + this.preco);

	}
}
