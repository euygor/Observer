package observer;
/**
 *
 * @author Ygor
 */
public class PoucoInteressados implements Observer{
        private PortalDoAluno portaldoaluno;

	public PoucoInteressados(PortalDoAluno portaldoaluno) {
		this.portaldoaluno = portaldoaluno;
	}

	@Override
	public void notificar() {
		System.out.println("Pouco Interessado diz: Eu esperava um pouco mais, Professor tem como aumentar minha nota?");
	}
}
