

public class Juego {

	private Lanzamientos lanzamientos = new Lanzamientos();
	private Total puntajeTotal;
	private IndexFrame indexFrame;

	public void lanzar(int pinos) {
		lanzamientos.add(pinos);
	}

	public Total puntaje() {
		puntajeTotal = new Total();
		indexFrame = new IndexFrame();
		for (int frame = 0; frame < 10; frame++) {
			calcularPuntajeParaFrame();
		}
		return puntajeTotal;
	}
	private void calcularPuntajeParaFrame() {
		Lanzamiento lanzamiento = lanzamientos.get(indexFrame);
		if (lanzamiento.esStrike()) { 
			puntajeTotal.sumar(10 + lanzamientos.bonoStrike(indexFrame));
			indexFrame.incrementar(1);
			return;
		}
		if (lanzamientos.esSpare(indexFrame)) {
			puntajeTotal.sumar(10 + lanzamientos.bonoSpare(indexFrame));
			indexFrame.incrementar(2);
			return;
		} 	
		lanzamiento = lanzamientos.sumaDeDosLanzamientos(indexFrame);
		puntajeTotal.sumar(lanzamiento.getPinosDerribados());
		indexFrame.incrementar(2);
	}
}
