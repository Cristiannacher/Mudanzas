public class Bulto {

    private String id;
    private double volumen;
    private double peso;
    private boolean fragilidad;

    public Bulto (String id, double volumen, double peso, boolean fragilidad) {
        this.id = id;
        this.volumen = volumen;
        this.peso = peso;
        this.fragilidad = fragilidad;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getVolumen(){
        return volumen;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setFragilidad(boolean fragilidad) {
        this.fragilidad = fragilidad;
    }

    public boolean getFragilidad() {
        return fragilidad;
    }
}
