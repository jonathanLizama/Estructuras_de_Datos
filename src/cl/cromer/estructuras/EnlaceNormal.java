package cl.cromer.estructuras;

/**
 * Esta clase es de tipo de enlace normal.
 *
 * @author Chris Cromer
 */
final public class EnlaceNormal implements Enlace {
	/**
	 * La llave.
	 */
	private int llave;

	/**
	 * El siguiente enlace.
	 */
	private EnlaceNormal siguiente;

	/**
	 * El enlace previo por doble enlazada.
	 */
	private EnlaceNormal previo;

	/**
	 * Incializar.
	 */
	public EnlaceNormal() {
		siguiente = null;
		previo = null;
	}

	/**
	 * Devolver la llave.
	 *
	 * @return int: La llave.
	 */
	public int getLlave() {
		return llave;
	}

	/**
	 * Cambiar el valor de la llave.
	 *
	 * @param llave int: El valor de la llave.
	 */
	public void setLlave(int llave) {
		this.llave = llave;
	}

	/**
	 * Devolver el siguiente enlace.
	 *
	 * @return EnlaceNormal: El enlace a devolver.
	 */
	public EnlaceNormal getSiguiente() {
		return siguiente;
	}

	/**
	 * Cambiar el siguiente enlace.
	 *
	 * @param siguiente Object: El siguiente enlace nuevo de tipo {@link EnlaceNormal}.
	 */
	public void setSiguiente(Object siguiente) {
		this.siguiente = (EnlaceNormal) siguiente;
	}

	/**
	 * Devolver el enlace previo.
	 *
	 * @return EnlaceNormal: El enlace previo.
	 */
	public EnlaceNormal getPrevio() {
		return previo;
	}

	/**
	 * Cambiar el previo enlace.
	 *
	 * @param previo Object: El enlace previo nuevo de tipo {@link EnlaceNormal}.
	 */
	public void setPrevio(Object previo) {
		this.previo = (EnlaceNormal) previo;
	}
}