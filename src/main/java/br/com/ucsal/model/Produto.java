package br.com.ucsal.model;

public class Produto {
	    private Integer id;
	    private String nome;
	    private Double preco;


	    public Produto() {
		}


		public Produto(Integer id, String nome, double preco) {
			super();
			this.id = id;
			this.nome = nome;
			this.preco = preco;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public Double getPreco() {
			return preco;
		}


		public void setPreco(Double preco) {
			this.preco = preco;
		}

	@Override
	public String toString() {
		return String.format("Produto{id=%d, nome='%s', preco=%.2f}", id, nome, preco);
	}
}
