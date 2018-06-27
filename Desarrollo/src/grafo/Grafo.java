package grafo;

public class Grafo {
	public MatrizSimetrica matrizSimetrica;
	public int cantidadNodos;
	public int cantidadAristas;
	public int gradoMax;
	public int gradoMin;
	public int porcentajeAdyacencia;

	public int cantColores;

	public Grafo() {
		this.matrizSimetrica = null;
		this.cantidadNodos = 0;
		this.cantidadAristas = 0;
		this.gradoMax = 0;
		this.gradoMin = 0;
		this.porcentajeAdyacencia = 0;
		this.cantColores = 0;
	}

	public void setArista(int fila, int columna) {
		if(fila != columna) {			
			this.matrizSimetrica.setAdyacencia(fila, columna);
		}
	}
	
	public int obtenerAdyacenciaReal() {
		
		double cantidadAristasDOUBLE = this.cantidadAristas;
		double cantidadNodosDOUBLE = this.cantidadNodos;
		double adyacenciaReal = (cantidadAristasDOUBLE/(cantidadNodosDOUBLE*(cantidadNodosDOUBLE-1)/2))*100;
		
		return (int) adyacenciaReal;
	}
	
	/* Para cuando se imprime el mínimo coloreo. */
	public Grafo clone() {
		Grafo clone = new Grafo();
		clone.matrizSimetrica = this.matrizSimetrica.clone();
		clone.cantidadNodos = this.cantidadNodos;
		clone.cantidadAristas = this.cantidadAristas;
		clone.gradoMax = this.gradoMax;
		clone.gradoMin = this.gradoMin;
		clone.porcentajeAdyacencia = this.porcentajeAdyacencia;
		clone.cantColores = this.cantColores;
		return clone;
	}
}
