package org.iftm.entities;

public class Funcionario {
	private String nome;
	private int horaTrabalhadas;
	private double valorPorHora;

	public Funcionario(String nome, int horaTrabalhadas, double valorPorHora) {
		this.nome = nome;
		this.horaTrabalhadas = horaTrabalhadas;
		this.valorPorHora = valorPorHora;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setHoraTrabalhadas(int horaTrabalhadas) {
		this.horaTrabalhadas = horaTrabalhadas;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	private int validaHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas > 40) {
			throw new IllegalArgumentException(
					"O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
		}
		return horasTrabalhadas;
	}

}
