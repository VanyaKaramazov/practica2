package practica2;

public class Activo implements EstadosRobot {

Robot robot;
	
	/**
	 * Constructor de Activo que selecciona
	 * el robot que cambiara de estado.
	 * @param robot
	 */
	public Activo(Robot robot){
		this.robot = robot;
	}
	
	/**Metodo que activa al robot, solo se puede ejecutar
	 * cuando el robot esta en estado Suspendido.
	 */
	@Override
	public void activar() {
		System.out.println("El robot ya esta ACTIVADO");
	}
	
	
	/**
	 * Metodo que hace caminar al robot, se ejecuta 
	 * si y solo si el robot se activa (revisar si es
	 * necesario tener ambos metodos).
	 */
	@Override
	public void caminar() {
		robot.cambiaEstado(robot.getCaminando());
		System.out.println("El robot ha pasado de ACTIVADO a CAMINANDO");
		System.out.println("Ahora el estado del robot es CAMINANDO");
	}

	/**
	 * Metodo que hace que el robot muestre el menu.
	 * Solo se ejecuta cuando el robot esta en modo
	 * Caminando
	 */
	@Override
	public void mostrarMenu() {
		System.out.println("El robot esta ACTIVO, aun no puede mostrar el menu.");
	}

	/**
	 * Metodo que hace que el robot obtenga una referencia
	 * al platillo que va a preparar. Se ejecuta tras 
	 * mostrar el menu
	 */
	@Override
	public void tomarOrden() {
		System.out.println("El robot esta ACTIVO, no puede tomar la orden ahora.");
	}

	/**
	 * Metodo que hace que el robot cocine el platillo.
	 * Solo se activa cuando el robot esta en modo Atendiendo.
	 */
	@Override
	public void cocinarOrden() {
		System.out.println("El robot esta ACTIVO, no puede cocinar ahora.");
	}

	/**
	 * Metodo que hace que el robot entregue la orden.
	 * Solo se puede ejecutar si el robot esta en modo 
	 * Cocinando.
	 */
	@Override
	public void entregarOrden() {
		System.out.println("El robot esta ACTIVO, no puede entregar la orden ahora.");
	}

	/**
	 * Metodo que suspende al robot. Solo se puede ejecutar 
	 * si el robot esta en estado Caminando o EntregandoOrden
	 */
	@Override
	public void suspender() {
		robot.cambiaEstado(robot.getSuspendido());
		System.out.println("El robot esta ACTIVO y pasara a DESACTIVADO.");
		System.out.println("El robot ahora esta en estado SUSPENDIDO.");
	}
	
	
	/**
	 * Metodo que regresa el estado del robot en una cadena.
	 */
	@Override
	public String toString() {
		return "El robot esta en estado ACTIVO.";
	}

}
