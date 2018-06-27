package grafo;

/**
 * Estructura donde guardamos una celda
 * (fila, "i", y columna, "j") con un 
 * valor random.
 */
public class CeldaRandom implements Comparable<CeldaRandom>{

		private int fila;
		private int columna;
		private Double random;
		
		public CeldaRandom(int fila, int columna, double rnd){
			this.fila = fila;
			this.columna = columna;
			this.random = new Double(rnd);
		}

		public int getFila(){
			return this.fila;
		}
		
		public int getColumna(){
			return this.columna;
		}

		@Override
		/**
		 * Compara pesos o random de cada posicion
		 * @param obj es la Posicion contra la cual comparar
		 */
		public int compareTo(CeldaRandom obj) {
			return this.random.compareTo(obj.random);
		}

	
}
