package co.edu.konradlorenz.model;

public class Arquero extends Futbolista{
	private String guantes;

	public Arquero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arquero(byte dorsal, String equipo) {
		super(dorsal, equipo);
		// TODO Auto-generated constructor stub
	}

	public Arquero(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Arquero(String guantes) {
		super();
		this.guantes = guantes;
	}

	
	
}
