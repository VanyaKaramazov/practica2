package practica2;

public class TomandoOrden implements EstadosRobot {
Robot robot;
	
	/**
	 * Constructor de TomandoOrden que selecciona
	 * el robot que cambiara de estado.
	 * @param robot
	 */
	public TomandoOrden(Robot robot){
		this.robot = robot;
	}
	
	/**Metodo que activa al robot, solo se puede ejecutar
	 * cuando el robot esta en estado Suspendido.
	 */
	@Override
	public void activar() {
		System.out.println("El robot ya fue activado, ahora esta TOMANDO ORDEN");
	}
	
	
	/**
	 * Metodo que hace caminar al robot, se ejecuta 
	 * si y solo si el robot se activa (revisar si es
	 * necesario tener ambos metodos).
	 */
	@Override
	public void caminar() {
		System.out.println("El robot esta TOMANDO ORDEN, no puede caminar ahora.");
	}

	/**
	 * Metodo que hace que el robot muestre el menu.
	 * Solo se ejecuta cuando el robot esta en modo
	 * Caminando
	 */
	@Override
	public void mostrarMenu() {
		System.out.println("El robot esta TOMANDO ORDEN, no puede cambiar a MOSTRANDO MENU");
	}

	/**
	 * Metodo que hace que el robot obtenga una referencia
	 * al platillo que va a preparar. Se ejecuta tras 
	 * mostrar el menu
	 */
	@Override
	public void tomarOrden() {
		System.out.println("El robot ya esta en el estado TOMANDO ORDEN");
	}

	/**
	 * Metodo que hace que el robot cocine el platillo.
	 * Solo se activa cuando el robot esta en modo Atendiendo.
	 */
	@Override
	public void cocinarOrden() {
		robot.cambiaEstado(robot.getCocinandoOrden());
		System.out.println("El robot esta TOMANDO ORDEN y pasara a COCINANDO ORDEN.");
		System.out.println("El robot esta en el estado COCINANDO ORDEN.");
	}

	/**
	 * Metodo que hace que el robot entregue la orden.
	 * Solo se puede ejecutar si el robot esta en modo 
	 * Cocinando.
	 */
	@Override
	public void entregarOrden() {
		System.out.println("El robot esta TOMANDO ORDEN, no puede entregar la orden ahora.");
	}

	/**
	 * Metodo que suspende al robot. Solo se puede ejecutar 
	 * si el robot esta en estado Caminando o EntregandoOrden
	 */
	@Override
	public void suspender() {
		System.out.println("El robot esta TOMANDO ORDEN, no puede cambiar al estado SUSPENDIDO.");
	}
	
	
	/**
	 * Metodo que regresa el estado del robot en una cadena.
	 */
	@Override
	public String toString() {
		return "El robot esta en estado TOMANDO ORDEN.";
	}

}
