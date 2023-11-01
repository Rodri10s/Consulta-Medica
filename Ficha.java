package ProvaTeste;

import java.util.Arrays;
import java.util.Date;

public class Ficha {
	public static void main(String[] args) {
		Especialidade especialidade = new Especialidade(112, "Aromas");
		Medico medico = new Medico(111, "Ramon", "(87) 99645-7790", "P300", especialidade);
		
		Paciente paciente = new Paciente();
		
		Medicamento medicamento1 = new Medicamento(001, "Dipirona", "1x ao dia");
		Medicamento medicamento2 = new Medicamento(002, "Fluoxentina", "2x ao dia");
		Medicamento medicamento3 = new Medicamento(003, "Paracetamol", "2x ao dia");
		
		Date data = new Date();
		
		Consulta consulta = new Consulta(222, data, true, "Concluída", 500.00, paciente, medico, Arrays.asList(medicamento1, medicamento2, medicamento3));
		
		consulta.ImprimirTudo();
	}

}
