package banco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class ContaTest2 {
	
	@Test
	public void testTrasferirValorNaoUltrapassaLimite() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 100);
		Conta contaUsuario2 = new Conta("2", 80);
		contaUsuario1.transferir(contaUsuario2, 20);
	}
	
	@Test
	public void testTrasferirErroValorIgualLimite() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 200);
		Conta contaUsuario2 = new Conta("2", 80);
		contaUsuario1.transferir(contaUsuario2, 200);
	}
	
	@Test
	public void testTrasferirErroValorIgualZero() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 0);
		Conta contaUsuario2 = new Conta("2", 80);
		contaUsuario1.transferir(contaUsuario2, 0);
	}
	
	@Test(expected=OperacaoIlegalException.class) 
	public void testTransferirUltrapassaLimite() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 20);
		Conta contaUsuario2 = new Conta("2", 100);
		contaUsuario1.transferir(contaUsuario2, 30);
	}
	
	@Test(expected=OperacaoIlegalException.class) 
	public void testTransferirValorNegativo() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 20);
		Conta contaUsuario2 = new Conta("2", 100);
		contaUsuario1.transferir(contaUsuario2, -2);
	}
	
	@Test(expected=OperacaoIlegalException.class)
	public void testDebitarValorNegativo() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 100);
		contaUsuario1.debitar(-10);
	}
	
	@Test(expected=OperacaoIlegalException.class)
	public void testDebitarComValorZero() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 100);
		contaUsuario1.debitar(0);
	}
	
	@Test
	public void testDebitarValor() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 100);
		assertEquals(50, contaUsuario1.debitar(50), 0.0);
	}
	
	@Test
	public void testDebitarSaldoCompleto() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 100);
		assertEquals(0.0, contaUsuario1.debitar(100), 0.0);
	}
	
	@Test
	public void testCreditarSaldo() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 120);
		assertEquals(220, contaUsuario1.creditar(contaUsuario1, 100), 0.0);
	}
	
	@Test
	public void testCreditarErroSaldo() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 100);
		assertNotEquals(90, contaUsuario1.creditar(contaUsuario1, 10), 0.0);
	}
	
	@Test(expected=OperacaoIlegalException.class)
	public void testCreditarValorZero() throws OperacaoIlegalException {
		Conta contaUsuario1 = new Conta("1", 120);
		contaUsuario1.creditar(contaUsuario1, 0);
	}
	
	@Test(expected=OperacaoIlegalException.class)
	public void testCreditarValorNegativo() throws OperacaoIlegalException {	
		Conta contaUsuario1 = new Conta("1", 100);
		Conta contaUsuario2 = new Conta("2", 20);
		contaUsuario1.creditar(contaUsuario2, -12);
	}
	
}
