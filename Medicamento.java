package ProvaTeste;

public class Medicamento {
	private int id;
	private String nome;
	private String posologia;
	
	public Medicamento(int id, String nome, String posologia) {
		this.id = id;
		this.nome = nome;
		this.posologia = posologia;
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
	public String getPosologia() {
		return posologia;
	}
	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}
	
}
