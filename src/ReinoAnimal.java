import java.util.ArrayList;
import java.util.List;

public class ReinoAnimal extends Reino{
    private final List<Especie> especies;

    public ReinoAnimal(String nombreComun, String nombreCientifico, String caracteristicas) {
        super(nombreComun, nombreCientifico, caracteristicas);
        this.especies = new ArrayList<>();
    }

    public List<Especie> getEspecies() {
        return especies;
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
