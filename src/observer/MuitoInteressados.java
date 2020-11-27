package observer;
/**
 *
 * @author Ygor
 */
public class MuitoInteressados implements Observer{
        private PortalDoAluno portaldoaluno;

	public MuitoInteressados(PortalDoAluno portaldoaluno) {
		this.portaldoaluno = portaldoaluno;
	}

	@Override
	public void notificar() {
		System.out.println("Muito Interessado diz: Eu não esperava menos que isso, estou de parabéns :D");
	}
}
