import java.util.ArrayList;
import java.util.List;

public class ReinoFungi extends Reino{
    private List<Especie> especies = new ArrayList<>();


    public ReinoFungi(String nombreComun, String nombreCientifico, String caracteristicas) {
        super(nombreComun, nombreCientifico, caracteristicas);
    }

    public void agregarEspecie(Especie especie) {
        especies.add(especie);

    }

    public void mostrarEspecies() {
        for (Especie especie : especies) {
            System.out.println(especie.getNombre());
        }
    }
}
