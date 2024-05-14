import java.util.ArrayList;
import java.util.List;

public class Reino {
    private String nombreComun;
    private String nombreCientifico;
    private String caracteristicas;

    public Reino(String nombreComun, String nombreCientifico, String caracteristicas) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.caracteristicas = caracteristicas;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void mostrarCaracteristicas() {
        System.out.println(caracteristicas);
    }
}
