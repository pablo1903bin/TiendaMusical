package controller.com;

/*Metodo Construcctor*/
/*SobreCarga de metodos*/
/*Modificadores de acceso*/
/*Encapsulamiento y metodos accesores*/
public class persona {

	private String nombre;
	private int edad;

	public persona() {

	}

	/*
	 * Un método constructor en Java es un método especial que se invoca cada vez
	 * que se genera un objeto de la clase a la que él pertenece. Dependiendo de las
	 * necesidades que tenga el proyecto, una clase puede tener uno o varios
	 * constructores.
	 */
	public persona(String nombre, int edad) {
		// this.nombre es el campo y nombre el parámetro
		this.nombre = nombre;// ¿Cómo va a saber Java cuál es el parámetro y cuál el campo?
		this.edad = edad;
	}

	public String getNombre(String nombre) {
		return nombre;
	}

	public int getEdad(int edad) {
		return edad;
	}

	@Override
	public String toString() {
		return "persona [nombre= " + nombre + ", edad= " + edad + "]";
	}

}

/*
 * La sobrecarga de métodos es la creación de varios métodos con el mismo nombre
 * pero con diferente lista de tipos de parámetros. Java utiliza el número y
 * tipo de parámetros para seleccionar cuál definición de método ejecutar.
 */
