package co.edu.konradlorenz.model;

public class Futbolista extends Persona{
	private byte dorsal;
	private String equipo;
	public Futbolista() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Futbolista(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	public Futbolista(byte dorsal, String equipo) {
		super();
		this.dorsal = dorsal;
		this.equipo = equipo;
	}
	
}
