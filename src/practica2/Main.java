package practica2;
import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		
		Robot robot = new Robot();
		
        System.out.println("Bienvenido al restaurante McHamburgesas...");
        System.out.println("Nuestro McRobot lo estará atendiendo");
        System.out.println("Actualmenete " + robot.getEstadoActual());
        System.out.println("Por favor elige la opción que deseas ejecutar: ");
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(
            				"1 .- **ACTIVADO** \n" +
                            "2 .- **CAMINANDO** \n" +
                            "3 .- **LEYENDO MENU* \n" +
                            "4 .- **TOMANDO ORDEN** \n" +
                            "5 .- **COCINANDO** \n" +
                            "6 .- **ENTREGANDO ORDEN** \n" +
                            "7 .- **SUSPENDIDO**\n" +
                            "8 .- **SALIR** \n");
            while (true) {
                try {
                    String opcionUsser = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsser);
                    break;
                } catch (NumberFormatException nfe) { 
                    System.out.println("Por favor elige una opción VALIDA \n" +
                    		"1 .- **ACTIVADO** \n" +
                            "2 .- **CAMINANDO** \n" +
                            "3 .- **LEYENDO MENU* \n" +
                            "4 .- **TOMANDO ORDEN** \n" +
                            "5 .- **COCINANDO** \n" +
                            "6 .- **ENTREGANDO ORDEN** \n" +
                            "7 .- **SUSPENDIDO**\n" +
                            "8 .- **SALIR** \n");
                }
            }

            switch (opcion) {
                case 1:
                    robot.activar();
                    break;
                case 2:
                    robot.caminar();
                    break;

                case 3:
                    robot.leerMenu();
                    break;

                case 4:
                    robot.tomarOrden();
                    break;

                case 5:
                    robot.cocinarOrden();
                    break;
                case 6:
                	robot.entregarOrden();
                    break;
                case 7:
                	robot.suspender();
                    break;
                case 8:
                    break;
                  
                default:
                    System.out.println("Por favor elige la opción que deseas ejecutar ");
                    break;
            }

        } while (opcion != 8);
	}
}

	
