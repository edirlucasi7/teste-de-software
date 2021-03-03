package fila;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilaTest {
	
	@Test
	public void testInseriFinalFila() {
		
		IFila fila = new Fila(5);

		String item1 = "1";
		String item2 = "2";
		
		fila.insereNaFila(item1);
		int pos0 = fila.verificarElementoVetor("1");
		assertTrue(pos0 == 0);
		
		fila.insereNaFila(item2);
		int pos1 = fila.verificarElementoVetor("2");
		assertTrue(pos1 == 1);
	
		assertTrue(fila.tamanho() == 2);		
		
	}
	
	@Test
	public void testRemoveInicioFila() {
		
		Fila fila = new Fila(5);
	
		String item1 = "1";
		String item2 = "2";
		String item3 = "3";
		
		fila.insereNaFila(item1);
		int pos0 = fila.verificarElementoVetor("1");
		assertTrue(pos0 == 0);
		
		fila.insereNaFila(item2);
		int pos1 = fila.verificarElementoVetor("2");
		assertTrue(pos1 == 1);
		
		fila.insereNaFila(item3);
		int pos2 = fila.verificarElementoVetor("3");
		assertTrue(pos2 == 2);

		fila.removeDaFila();

		int primeiroElementoTeste1 = fila.verificarElementoVetor("1");
		assertTrue(primeiroElementoTeste1 == -1);
		assertTrue(fila.verificarElementoVetor("2") == 0);
		
		fila.removeDaFila();
		int primeiroElementoTeste2 = fila.verificarElementoVetor("2");
		assertTrue(primeiroElementoTeste2 == -1);
		assertTrue(fila.verificarElementoVetor("3") == 0);	
		
	}

}
