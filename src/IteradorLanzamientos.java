import java.util.ArrayList;
import java.util.List;


public class IteradorLanzamientos {
	private IndexFrame indexFrame;
	private List<Lanzamiento> lanzamientos = new ArrayList<Lanzamiento>();
	private int cantidadLanzamientos;
	
	public IteradorLanzamientos(ArrayList<Lanzamiento> lanzamientos) {
		indexFrame = new IndexFrame();
		this.lanzamientos = lanzamientos;
		this.cantidadLanzamientos = lanzamientos.size();
	}
	
	public void siguiente(int valor) {
		indexFrame.incrementar(valor);
	}
	
	public IndexFrame actual()
	{
		return this.indexFrame;
	}
	
	public boolean haySiguiente() {
		return indexFrame.get() != cantidadLanzamientos;
	}
}
