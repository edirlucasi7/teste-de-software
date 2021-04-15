package param;

public class CalculoImpostoRenda {

	/**
	 * Este método calcula o imposto a ser pago baseado no valor de uma dada compra.
	 * 
	 * Se  1201 <= valor <= 5000 deve pagar 10% de imposto
	 * Se  5001 <= valor <= 10000 deve pagar 15% de imposto
	 * Se  valor > 10000 deve pagar 20% de imposto
	 * Se  valor < 1201 deve pagar 0% de imposto
	 * 
	 * @param valor
	 */
	public double calculaImposto(double valor) {

		double impostoTotal = 0.0;
  
		if(valor >= 1201 && valor <= 5000) {
			impostoTotal = 0.1;
		} else if(valor >= 5001 && valor <= 10000){
			impostoTotal = 0.15;
		} else if(valor > 10000){
			impostoTotal = 0.2;
		}
		else {
			impostoTotal = 0.0;
		}
		return valor*impostoTotal;
	}
	
	/**
	 * Este método retorna a porcentagem de imposto a ser pago baseado no valor de uma dada compra.
	 * 
	 * Se  1201 <= valor <= 5000 deve pagar 10% de imposto
	 * Se  5001 <= valor <= 10000 deve pagar 15% de imposto
	 * Se  valor > 10000 deve pagar 20% de imposto
	 * Se  valor < 1201 deve pagar 0% de imposto
	 * 
	 * @param valor
	 */
	public String retornaPorcentagemImposto(double valor) {

		String porcentagem;

		if(valor >= 1201 && valor <= 5000) {
			porcentagem = "10%";
		} else if(valor >= 5001 && valor <= 10000){
			porcentagem = "15%";
		} else if(valor > 10000){
			porcentagem = "20%";
		} else{
			porcentagem = "0.0%";
		}
		return porcentagem;
	}

}
