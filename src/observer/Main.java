package observer;
/**
 *
 * @author Ygor
 */
public class Main {

    public static void main(String[] args) {
        	PortalDoAluno notas = new PortalDoAluno("Portal do Aluno");
                
		Desinteressados desinteressados = new Desinteressados(notas);
		PoucoInteressados poucoInteressados = new PoucoInteressados(notas);
                MuitoInteressados muitoInteressados = new MuitoInteressados(notas);
                
                System.out.println("Programação Avançada - Padrão Observer");
                
		notas.anexar(desinteressados);
		notas.anexar(poucoInteressados);
                notas.anexar(muitoInteressados);
                notas.postarNotaPortal();
                
    }
    
}
