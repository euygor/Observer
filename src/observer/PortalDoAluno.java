package observer;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ygor
 */
public class PortalDoAluno implements Observavel {
        private String nome;
	private List<Observer> alunos;

	public PortalDoAluno(String nome) {
		this.nome = nome;
	}
	public void postarNotaPortal() {
		System.out.println("\nAviso: Todas as notas foram postadas no " + nome + " confiram. \n");
		notificarObservadores();
	}

	@Override
	public void anexar(Observer observer) {
		if (null == alunos)
		alunos = new ArrayList<Observer>();
		alunos.add(observer);
	}

	@Override
	public void desanexar(Observer observer) {
		if (null == alunos)
		return;
		alunos.remove(observer);
	}

	@Override
	public void notificarObservadores() {
		if (null == alunos)
		return;
		for (Observer observer : alunos) {
                observer.notificar();
		}
	}
}
