package observer;
/**
 *
 * @author Ygor
 */
public interface Observavel {
        public void anexar(Observer observer);
	public void desanexar(Observer observer);
	public void notificarObservadores();
}
