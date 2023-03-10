
package practica2;

/**
 * @author debian
 *
 */
public class Robot {
	private EstadosRobot estadoActual;
	private Suspendido suspendido;
	private Activo activo;
	private Caminando caminando;
	private LeyendoMenu leyendoMenu;
	private TomandoOrden tomandoOrden;
	private CocinandoOrden cocinandoOrden;
	private EntregandoOrden entregandoOrden;

	/**
	 * Constructor de Robot. Por defecto, asigna el
	 * estado Suspendido al robot.
	 */
	public Robot() {
		 	suspendido = new Suspendido(this);
	        activo = new Activo(this);
	        caminando = new Caminando(this);
	        leyendoMenu = new LeyendoMenu(this);
	        tomandoOrden = new TomandoOrden(this);
	        cocinandoOrden = new CocinandoOrden(this);
	        entregandoOrden = new EntregandoOrden(this);

		this.estadoActual = this.suspendido;
	}
	
	/*
	 * Activa el robot.
	 */
	public void activar() {
		estadoActual.activar();
	}
	
	
	/**
	 * El robot camina.
	 */
	public void caminar() {
		estadoActual.caminar();
	}
	
	/**
	 * El robot lee el menu.
	 */
	public void leerMenu() {
		estadoActual.mostrarMenu();
	}
	
	/**
	 * El robot toma la orden.
	 */
	public void tomarOrden() {
		estadoActual.tomarOrden();
	}
	
	/**
	 * El robot cocina la orden.
	 */
	public void cocinarOrden() {
		estadoActual.cocinarOrden();
	}
	
	/**
	 * El robot entrega la orden.
	 */
	public void entregarOrden() {
		estadoActual.entregarOrden();
	}
	
	/**
	 * El robot se suspende.
	 */
	public void suspender() {
		estadoActual.suspender();
	}
	
	
	
	
	
	/**
	 * Regresa el estado Activo del robot
	 * @return activo
	 */
	public EstadosRobot getActivo() {
		return this.activo;
	}
	
	
	/**
	 * @return el estado Caminando del robot
	 */
	public EstadosRobot getCaminando() {
		return this.caminando;
	}
	
	/**
	 * @return el estado LeyendoMenu del robot
	 */
	public EstadosRobot getLeyendoMenu() {
		return this.leyendoMenu;
	}
	
	/**
	 * @return el estado TomandoOrden del robot
	 */
	public EstadosRobot getTomandoOrden() {
		return this.tomandoOrden;
	}
	
	/**
	 * @return el estado CocinandoOrden del robot
	 */
	public EstadosRobot getCocinandoOrden() {
		return this.cocinandoOrden;
	}
	
	/**
	 * @return el estado EntregandoOrden del robot
	 */
	public EstadosRobot getEntregandoOrden() {
		return this.entregandoOrden;
	}
	
	/**
	 * @return el estado Caminando del robot
	 */
	public EstadosRobot getSuspendido() {
		return this.suspendido;
	}
	
	
	
	/**
	 * @return estado actual del robot
	 */
	public EstadosRobot getEstadoActual() {
		return this.estadoActual;
	}

	
	/**
	 * Asigna, al estado del robot, el estado actual.
	 * @param nuevoEstado
	 */
	public void cambiaEstado(EstadosRobot nuevoEstado) {
		this.estadoActual = nuevoEstado;
	}
	
	
	/**
	 * @return la descripcion del estado actual en una cadena
	 */
	public String getDescripcionEstado() {
		return estadoActual.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
