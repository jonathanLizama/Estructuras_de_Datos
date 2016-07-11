package cl.cromer.estructuras;

import javafx.scene.paint.Color;

import java.util.Random;

/**
 * Rotación de colores.
 *
 * @author Chris Cromer
 */
public class Colores {
	/**
	 * Cuantos colores estan definidos en esta clase.
	 */
	static final public int MAX_COLORS = 7;

	/**
	 * El color actual en forma numerica.
	 */
	private int color;

	/**
	 * El color de texto actual.
	 */
	private Color texto;

	/**
	 * El color de fondo actual.
	 */
	private Color fondo;

	/**
	 * El color de border actual.
	 */
	private Color border;

	/**
	 * Inicializar el primer color.
	 */
	public Colores() {
		siguinteColor();
	}

	/**
	 * Cambiar el color al siguinte. Si no hay, voler al primer.
	 */
	public void siguinteColor() {
		switch (color) {
			case 1:
				color = 2;
				texto = Color.WHITE;
				fondo = Color.RED;
				border = Color.BLACK;
				break;
			case 2:
				color = 3;
				texto = Color.BLACK;
				fondo = Color.WHITE;
				border = Color.BLACK;
				break;
			case 3:
				color = 4;
				texto = Color.BLACK;
				fondo = Color.PINK;
				border = Color.BLACK;
				break;
			case 4:
				color = 5;
				texto = Color.BLACK;
				fondo = Color.YELLOW;
				border = Color.BLACK;
				break;
			case 5:
				color = 6;
				texto = Color.WHITE;
				fondo = Color.GREEN;
				border = Color.BLACK;
				break;
			case 6:
				color = 7;
				texto = Color.BLACK;
				fondo = Color.ORANGE;
				border = Color.BLACK;
				break;
			default:
				color = 1;
				texto = Color.WHITE;
				fondo = Color.BLUE;
				border = Color.BLACK;
		}

	}

	public void randomColor() {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		fondo = Color.rgb(r, g, b);

		// Generate a text color that doesn't conflict
		double a = 1 - (0.299 * r + 0.587 * g + 0.114 * b) / 255;
		texto = (a > 0.5)?Color.WHITE: Color.BLACK;

		border = Color.BLACK;
	}

	/**
	 * Devolver el color del texto actual.
	 *
	 * @return Color: Color del texto.
	 */
	public Color getTexto() {
		return texto;
	}

	/**
	 * Devolver el color del fondo actual.
	 *
	 * @return Color: Color del fondo.
	 */
	public Color getFondo() {
		return fondo;
	}

	/**
	 * Devolver el color del border actual.
	 *
	 * @return Color: Color del border.
	 */
	public Color getBorder() {
		return border;
	}
}
