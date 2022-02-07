import java.util.LinkedList;

public class Camion {

    private String matricula;
    private double volumen;
    private double capacidadPeso;


    public Camion(String matricula, double volumen, double peso) {
        this.matricula = matricula;
        this.volumen = volumen;
        this.capacidadPeso = peso;
    }

    LinkedList<Bulto> bultosCargados = new LinkedList<>();

    public void addBulto (Bulto bulto){
        bultosCargados.add(bulto);
    }

    private double pesoCarga() {
        double pesoTotalCarga = 0;
        for (Bulto bulto : bultosCargados)
            pesoTotalCarga += bulto.getPeso();
        return pesoTotalCarga;
    }

    private double volumenCarga() {
        double volumenTotalCarga = 0;
        for (Bulto bulto : bultosCargados)
            volumenTotalCarga += bulto.getVolumen();
        return volumenTotalCarga;
    }

    double volumenSobrante = volumen - volumenCarga();
    double pesoSobrante = capacidadPeso - pesoCarga();

    public boolean cabeBulto (Bulto bulto){
        return bulto.getPeso() <= pesoSobrante && bulto.getVolumen() <= volumenSobrante;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setCapacidadPeso(double capacidadPeso) {
        this.capacidadPeso = capacidadPeso;
    }

    public double getCapacidadPeso() {
        return capacidadPeso;
    }



}
