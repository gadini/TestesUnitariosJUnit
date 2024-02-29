package FontesAppElevador;

//Classe de controle de fluxo de embarque de pessoas em elevadores
public class ControleEmbarque {

	public boolean embarcar(Pessoa pessoa, Elevador elevador, int operacao) {
	
		//Embarcar pessoa no elevador
		if (operacao == 1) {
			double pesoFinalElevador = elevador.entrarNoelevador(pessoa.getPeso());
		
			boolean alarmeAcesso =elevador.avaliarpeso();
			if (alarmeAcesso == false) {
				//Se o alarme for FALSE (nao ativado),
				//retorna confirmacao de embarque TRUE
				return true;
			}
			else {
				//Se o alarme for TRUE (ativado),
				//retorna bloqueio de acionamento do elevador 
				//(retorna FALSE para a confirmacao de embarque)
				return false;
			}
		}
		
		//Desembarcar pessoa no elevador
		if (operacao == 2) {
			
			double pesoFinalElevador = elevador.sairDoelevador(pessoa.getPeso());
			
			boolean alarmeAcesso =elevador.avaliarpeso();
			if (alarmeAcesso == false) {
				//Se o alarme for FALSE (nao ativado),
				//retorna confirmacao de embarque TRUE
				return true;
			}
			else {
				//Se o alarme for TRUE (ativado),
				//retorna bloqueio de acionamento do elevador 
				//(retorna FALSE para a confirmacao de embarque)
				return false;
			}

		}
		
		return true;
	}
}
