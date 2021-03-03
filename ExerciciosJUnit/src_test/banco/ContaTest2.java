package banco;

import org.junit.Test;

public class ContaTest2 {

	@Test
	public void testSaqueNaoUltrapassaLimite() throws OperacaoIlegalException {
		
		Conta contaUsuario1 = new Conta("1", 100);
		Conta contaUsuario2 = new Conta("2", 80);
		
		contaUsuario1.transferir(contaUsuario2, 20);
			
	}
	
	@Test(expected=OperacaoIlegalException.class) 
	public void testSaqueUltrapassaLimite() throws OperacaoIlegalException {
		
		Conta contaUsuario1 = new Conta("1", 20);
		Conta contaUsuario2 = new Conta("2", 100);
		
		contaUsuario1.transferir(contaUsuario2, 30);
		
	}
	
}
