package co.edu.konradlorenz.model;

public class Persona {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona() {
		super();
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
