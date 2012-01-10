
public class IndexFrame {
	private int indexFrame;
	
	public IndexFrame() {
		indexFrame = 0;
	}
	
	public int get() {
		return indexFrame;
	}
	
	public void incrementar(int valor) {
		indexFrame += valor;
	}
}
