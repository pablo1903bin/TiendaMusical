package controller.com;

public class miclase {

	private String nombre;

	public miclase() {
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "miclase [nombre=" + nombre + "]";
	}

}
