package test;

public class Asiento {
	
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		boolean cond = color.equals("rojo") || color.equals("verde") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco");
		if (cond) {
			this.color = color;
		}
	}
	
}
