package laboratorio13;

public class Principal {

	Flecha flecha1,flecha2,flecha3;
	
	public static void main(String[] args) {
		Principal miPrincipal = new Principal();
	}
	
	public Principal() {
		flecha1 = new Flecha();
		flecha1.contruirFlecha();
		flecha1.imprimirEspacio();
		
		flecha2 = new Flecha();
		flecha2.longitud = 34;
		flecha2.color = "rojo";
		flecha2.contruirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3 = new Flecha(12,"negro");
		flecha3.contruirFlecha();
		flecha3.imprimirEspacio();
	}
}
