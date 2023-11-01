package ProvaTeste;

public class Medico extends Pessoa{
	private String crm;
	private Especialidade especialidade;
	
	public Medico() {
		super();
	}
	public Medico(int id, String nome, String whatsapp, String crm, Especialidade especialidade) {
		super(id, nome, whatsapp);
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

}
