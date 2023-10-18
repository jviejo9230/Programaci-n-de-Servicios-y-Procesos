package Ejercicio3Procesos;

public class LanzadorProcesos {
    public void ejecutar(String ruta){

            ProcessBuilder pb;
            try {
                    pb = new ProcessBuilder(ruta);
                    pb.start();
            } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }

    }
}
