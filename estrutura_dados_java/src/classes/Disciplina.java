package classes;

import java.util.Arrays;
import java.util.Objects;

/* Essa classe Disciplina servirá para todos os objetos e instâncias de notas e matérias */
public class Disciplina {

	/* Atributos */
	
	/*Cada disciplina terá 4 notas -> regra de negócio */
	double[] nota = new double[4];
	String disciplina;

	/* Getters and Setters */
	
	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getMediaNotas() {
		double somaTotal = 0;
		
		for (int i = 0; i < nota.length; i ++) {
			 somaTotal += nota[i];
		 }
		return somaTotal / nota.length;
	} 
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}

	/* To String */
	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}
