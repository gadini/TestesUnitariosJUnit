package TestesUnitarios;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppElevador.Pessoa;

public class PessoaTeste {

Pessoa pessoa = new Pessoa();
	
	//Teste de Getter e setter
	@Test
	public void testeAtribuirNomeRenato() {
		pessoa.setNome("Renato");
		assertEquals(pessoa.getNome(), "Renato");
	}
	
	@Test
	public void testeAtribuirPesoRenato() {
		pessoa.setPeso(80.5);
		assertEquals(pessoa.getPeso(), 80,0.5);
	}

}
