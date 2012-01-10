import java.util.ArrayList;
import java.util.List;


public class Lanzamientos {

	private List<Lanzamiento> lanzamientos = new ArrayList<Lanzamiento>();
	
	
	public void add(int pinos){
		lanzamientos.add(new Lanzamiento(pinos));
	}
	
	public Lanzamiento get(IndexFrame indexFrame) {
		return lanzamientos.get(indexFrame.get());
	}
	
	public int bonoStrike(IndexFrame indexFrame) {
		
		return lanzamientos.get(indexFrame.get() + 1).getPinosDerribados() + bonoSpare(indexFrame);
	}

	public boolean esSpare(IndexFrame indexFrame) {
		return sumaDeDosLanzamientos(indexFrame).esStrike();
	}
	
	public int bonoSpare(IndexFrame indexFrame) {
		return lanzamientos.get(indexFrame.get() + 2).getPinosDerribados();
	}

	public Lanzamiento sumaDeDosLanzamientos(IndexFrame indexFrame) {
		return lanzamientos.get(indexFrame.get()).sumar(lanzamientos.get(indexFrame.get() + 1));
	}

}
