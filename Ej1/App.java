package Ejercicio1Procesos;

public class App {
	
	public static void main(String[] args) {
		
		String ruta = "C:\\WINDOWS\\System32\\notepad.exe";
		
		LanzadorProcesos lp = new LanzadorProcesos();
	    lp.ejecutar(ruta);
	    System.out.println("Finalizado");
	}
}
