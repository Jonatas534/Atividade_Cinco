package org.iftm.entities;

public class Funcionario {

	public static final double SALARIO_MINIMO = 1212.00;
	public static final int HORAS_MAXIMO = 40;
	public static final double VALORHORA_MAXIMO = 121.00;
	public static final double VALORHORA_MINIMO = 48.48;
	private String nome;
	private  int horasTrabalhadas;
	private double valorHora;
	private double salario;
	

	public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
		
		this.nome = nome;
		this.horasTrabalhadas= validaHorasTrabalhadas (horasTrabalhadas);
		this.valorHora = validaValorHora(valorHora);
		calculaSalario();
	}

	public void calculaSalario() {
		double valor = (valorHora * horasTrabalhadas * 4);
		if (valor <1212) {
			throw new IllegalArgumentException(
					"O número de horas trabalhadas por funcionários próprios não deve ser menor que 48.48 nem maior 121.");
		}
			salario = valor;
	}

	public void setSalario(double salario) 
	{
		this.salario = (salario);
		calculaSalario();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
		calculaSalario();
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = validaValorHora(valorHora);
	}
	
	public static double validaValorHora(double valorHora) {
		if (valorHora >  VALORHORA_MAXIMO || valorHora < VALORHORA_MINIMO) {
			throw new IllegalArgumentException(
					"O número de horas trabalhadas por funcionários próprios não deve ser menor que 48.48 nem maior 121.");
		}
		return valorHora;
	}

	public static int validaHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas > HORAS_MAXIMO) {
			throw new IllegalArgumentException(
					"O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
		}
		return horasTrabalhadas;
	}
	
	public boolean salarioValido(){
		
		return (salario >= SALARIO_MINIMO  ? true : false);
	}
	

}


