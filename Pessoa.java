package ProvaTeste;

public class Pessoa {
	
	private int id;
	private String nome;
	private String whatsapp;
	
	public Pessoa() {
		super();
	}
	public Pessoa(int id, String nome, String whatsapp) {
		super();
		this.id = id;
		this.nome = nome;
		this.whatsapp = whatsapp;
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
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

}
