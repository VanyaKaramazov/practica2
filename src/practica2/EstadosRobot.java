package practica2;

/**
 * 
 * @author debian
 *	Interfaz de los estados del robot
 */
public interface EstadosRobot {
	
	/**
	 * Metodo que activa al robot, solo se puede ejecutar
	 * cuando el robot esta en estado Suspendido.
	 */
	public void activar();
	
	/**
	 * Metodo que hace caminar al robot, se ejecuta 
	 * si y solo si el robot se activa (revisar si es
	 * necesario tener ambos metodos).
	 */
	public void caminar();
	
	/**
	 * Metodo que hace que el robot muestre el menu.
	 * Solo se ejecuta cuando el robot esta en modo
	 * Caminando
	 */
	public void mostrarMenu();
	
	/**
	 * Metodo que hace que el robot obtenga una referencia
	 * al platillo que va a preparar. Se ejecuta tras 
	 * mostrar el menu
	 */
	public void tomarOrden();
	
	/**
	 * Metodo que hace que el robot cocine el platillo.
	 * Solo se activa cuando el robot esta en modo Atendiendo.
	 */
	public void cocinarOrden();
	
	/**
	 * Metodo que hace que el robot entregue la orden.
	 * Solo se puede ejecutar si el robot esta en modo 
	 * Cocinando.
	 */
	public void entregarOrden();
	
	/**
	 * Metodo que suspende al robot. Solo se puede ejecutar 
	 * si el robot esta en estado Caminando o EntregandoOrden
	 */
	public void suspender();

	
	/**
	 * Metodo que regresa el estado del robot en una cadena.
	 */
	public String toString();
}





