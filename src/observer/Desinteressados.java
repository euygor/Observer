package observer;
/**
 *
 * @author Ygor
 */
public class Desinteressados implements Observer{
    	private PortalDoAluno portaldoaluno;

	public Desinteressados(PortalDoAluno portaldoaluno) {
		this.portaldoaluno = portaldoaluno;
	}

	@Override
	public void notificar() {
		System.out.println("Desinteressado diz: Tem algo de errado com minha nota, quero revisão, como posso ter tirado uma nota tão baixa?");
	}
}
