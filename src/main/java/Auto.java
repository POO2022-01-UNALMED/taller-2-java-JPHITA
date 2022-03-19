package test;

public class Auto {

	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	
	static int cantidadCreados;
	
	int cantidadAsientos() {
	
		int cAsientos = 0;
		
		for(int i = 0; i < this.asientos.length; i++) {
			if (this.asientos[i] != null) {
				cAsientos++;
			}
		}
		
		return cAsientos;
	}
	
	String verificarIntegridad() {
		
		boolean original = true;
		
		if (this.registro != motor.registro) {
			original = false;
		}
		
		for(int i = 0; i < this.asientos.length; i++) {
			if(this.asientos[i] != null){
				if (this.registro != this.asientos[i].registro) {
					original = false;
					break;
				}
			}
		}
		
		if (original) {
			return "Las piezas no son originales";
		} else {
			return "Auto original";
		}
	}
	
}
