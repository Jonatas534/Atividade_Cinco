package org.iftm.entities;





	public class FuncionarioTercerizado extends Funcionario{
		
		
		
		private double despesaAdicional;
		
		public FuncionarioTercerizado(String nome, int horaTrabalhada, double valorPoHora, double despesaAdicional) {
			super(nome, horaTrabalhada, valorPoHora);
			this.despesaAdicional = despesaAdicional;
		}

		public void setDespesaAdicional(double despesaAdicional) {
			this.despesaAdicional = despesaAdicional;
		}

		
	
	}