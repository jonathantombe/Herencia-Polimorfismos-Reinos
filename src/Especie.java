public class Especie {
    private String nombre;
    private String alimentacion;
    private String respiracion;
    private String reproduccion;
    private String locomocion;

    public Especie(String nombre, String alimentacion, String respiracion, String reproduccion, String locomocion) {
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.respiracion = respiracion;
        this.reproduccion = reproduccion;
        this.locomocion = locomocion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getRespiracion() {
        return respiracion;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public String getLocomocion() {
        return locomocion;
    }

    public void mostrarFunciones() {
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Respiración: " + respiracion);
        System.out.println("Reproducción: " + reproduccion);
        System.out.println("Locomoción: " + locomocion);
    }
}
