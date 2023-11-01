package ProvaTeste;

import java.util.Scanner;

public class Paciente extends Pessoa{
	private String planoSaude;

	public Paciente() {
		super();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nome do paciente: ");
		setNome(scan.nextLine());
		System.out.println("Id do paciente: ");
		setId(scan.nextInt());
		scan.nextLine();
		System.out.println("Whatsapp: ");
		setWhatsapp(scan.nextLine());
		System.out.println("Plano de Saúde: ");
		this.planoSaude = scan.nextLine();
	}
	public Paciente(int id, String nome, String whatsapp, String planoSaude) {
		super(id, nome, whatsapp);
		this.planoSaude = planoSaude;
	}

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}

}
