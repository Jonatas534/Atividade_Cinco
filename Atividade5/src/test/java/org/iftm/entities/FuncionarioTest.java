package org.iftm.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class FuncionarioTest {

	@Test
	public void  testarConstrutorPagamentoInvalido ( ) {
		
		//cenário de teste
		String nomeValido = "Rogério Lima Duarte";
		int horasTrabalhadasValidas = 3;
		double valorHoraValido = 60.25;
		boolean salarioValido = false;
		Funcionario f;
		
		
		
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					new Funcionario(nomeValido,horasTrabalhadasValidas, valorHoraValido);
					}
				);
		
	}
	
	@Test
	public void testarConstrutorEntradaValorHoraInvalida ( ) {
		
		//cenário de teste
				String nomeValido = "Jonatas Silva";
				int horasTrabalhadasValidas = 40;
				double valorHoraValido = 122.00;
				
				//execução	
				
				Assertions.assertThrows(IllegalArgumentException.class, ()->{new Funcionario(nomeValido,horasTrabalhadasValidas, valorHoraValido);});
					
			}
				
		
	
	
	public void testarConstrutorEntradaHorasInvalida ( ) {
		//cenário de teste
				String nomeValido = "Maria Peixoto gonçalves";
				int horasTrabalhadasValidas = 42;
				double valorHoraValido = 60.25;
				boolean salarioValido = true;
				Funcionario f;
				
				
				//execução	
				
				f= new Funcionario(nomeValido,horasTrabalhadasValidas, valorHoraValido);
				boolean resultadoObtido = f.salarioValido();
				String nomeObtido = f.getNome();
				int horasTrabalhadasObtida = f.getHorasTrabalhadas();
				double valorHoraObtido= f. getValorHora();
			
				
				
				
				
				//comparação
				
				Assertions.assertEquals(salarioValido, resultadoObtido);
				Assertions.assertEquals(nomeValido, nomeObtido);
				Assertions.assertEquals(valorHoraValido, valorHoraObtido);
				Assertions.assertEquals(horasTrabalhadasValidas, horasTrabalhadasObtida);
		
	}
	
	@Test
	public void testarConstrutorEntradasValida ( ) {
		
		//cenário de teste
				String nomeValido = "Rogério Lima Duarte";
				double valorHoraValido = 60.00;
				int horasTrabalhadasValidas = 40;
				boolean salarioValido = true;
				Funcionario f;
				
				
				//execução	
				
				f= new Funcionario(nomeValido,horasTrabalhadasValidas, valorHoraValido);
				boolean resultadoObtido = f.salarioValido();
				String nomeObtido = f.getNome();
				int horasTrabalhadasObtida = f.getHorasTrabalhadas();
				double valorHoraObtido= f. getValorHora();
				
				
				
				
				
				//comparação
				
				Assertions.assertEquals(salarioValido, resultadoObtido);
				Assertions.assertEquals(nomeValido, nomeObtido);
				Assertions.assertEquals(valorHoraValido, valorHoraObtido);
				Assertions.assertEquals(horasTrabalhadasValidas, horasTrabalhadasObtida);
				
			}
		
		
		
	
	@Test
	public void testarModificarHorasPagamentoInvalido ( ) {
		//cenário de teste
		String nomeValido = "João Peixoto Fagundes";
		double valorHoraValido = 60.00;
		int horasTrabalhadasValidas = 40;
		Funcionario f;
		f= new Funcionario(nomeValido,horasTrabalhadasValidas, valorHoraValido);
		
		
		int novaHora = 3;
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					f.setHorasTrabalhadas(novaHora);
					}
				);
		
		
		
	}

		
		
	
		
	
	@Test
	public void testarModificarHorasEntradaInvalida ( ) {
		//cenário de teste
				String nomeValido = "João Peixoto Fagundes";
				double valorHoraValido = 60.00;
				int horasTrabalhadasValidas = 40;
				Funcionario f;
				f= new Funcionario(nomeValido,horasTrabalhadasValidas, valorHoraValido);
				
				
				int novaHora = 42;
				//execução	
				Assertions.assertThrows(
						IllegalArgumentException.class, 
						()->{
							f.setHorasTrabalhadas(novaHora);
							}
						);
				
	}
	@Test
	public void testarModificarHorasEntradaValida ( ) {
		
		//cenário de teste
		String nomeValido = "João Peixoto Fagundes";
		double valorHoraValido = 49.00;
		int horasTrabalhadasValidas = 40;
		Funcionario f;
		f= new Funcionario(nomeValido,horasTrabalhadasValidas, valorHoraValido);
		
		
		int novaHora = 61;
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					f.setHorasTrabalhadas(novaHora);
					}
				);
		
		
	}
	
	public void testarModificarValorPagamentoInvalido ( ) {
		
	}
	
	public void testarModificarValorEntradaInvalida ( ) {
		
	}
	
	public void testarModificarValorEntradaValida ( ) {
		
		
	}
	           
}