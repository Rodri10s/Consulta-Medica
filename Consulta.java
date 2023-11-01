package ProvaTeste;

import java.util.Date;
import java.util.List;

public class Consulta {
	private int id;
	private Date data;
	private boolean retorno;
	private String status;
	private double valor;
	private Paciente paciente;
	private Medico medico;
	private List<Medicamento> medicamento;
	
	public Consulta(int id, Date data, boolean retorno, String status, double valor, Paciente paciente, Medico medico,
			List<Medicamento> medicamento) {
		this.id = id;
		this.data = data;
		this.retorno = retorno;
		this.status = status;
		this.valor = valor;
		this.paciente = paciente;
		this.medico = medico;
		this.medicamento = medicamento;
	}
	
	public void ImprimirTudo() {
		System.out.println("=============== CONSULTA ===============");
		System.out.printf("Nome do Paciente: %s(%d)\n", getPaciente().getNome(), getPaciente().getId());
		System.out.println("Plano de Saúde: "+ getPaciente().getPlanoSaude());
		
		System.out.printf("\nMédico: %s (CRM: %s)\n", getMedico().getNome(), getMedico().getCrm());
		System.out.println("----------------------------------------");
		
		System.out.println("Data: "+ getData());
		System.out.println("Valor: "+ getValor());
		System.out.println("----------------------------------------\n");
		
		System.out.println("Medicamentos: \n");
		for(int i=0; i < medicamento.size(); i++) {
			System.out.printf("%s(%s)\n\n", getMedicamento().get(i).getNome(), getMedicamento().get(i).getPosologia());
		}
		
		System.out.println("----------------------------------------");
		System.out.println("Status da consulta: "+getStatus());
		System.out.println("========================================");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public boolean isRetorno() {
		return retorno;
	}
	public void setRetorno(boolean retorno) {
		this.retorno = retorno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public List<Medicamento> getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(List<Medicamento> medicamento) {
		this.medicamento = medicamento;
	}

}
