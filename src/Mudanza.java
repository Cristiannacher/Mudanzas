import java.util.LinkedList;

public class Mudanza {

    private String id;
    private double distancia;
    private Camion camionAsignado;

    public Mudanza(String id, double distancia, Camion camionAsignado) {

        this.id = id;
        this.distancia = distancia;
        this.camionAsignado = camionAsignado;
    }

    LinkedList<Bulto> bultos = new LinkedList<>();

    public void incluyeBulto(Bulto bulto) {
        bultos.add(bulto);
    }

    public double costeBultos(){
        double coste = 0;
        for(Bulto bulto : bultos){
            if(bulto.getFragilidad()){
                coste+= bulto.getPeso()*4;
            }
            else coste+= bulto.getPeso();
        }
        return  coste;
    }

    public double costeViajes(){
        return viajesNecesarios() * distancia * 2;
    }

    public double viajesNecesarios(){
        LinkedList<Bulto> copiaBultos = new LinkedList<>(bultos);
        double viajes = 0;
        while (!copiaBultos.isEmpty()){
            viajes++;
            cargaCamiaonAlMaximo(copiaBultos);
            copiaBultos.removeAll(camionAsignado.)
        }
    }

    private void cargaCamiaonAlMaximo (LinkedList<Bulto> bultos){
        for(Bulto bulto: bultos)
            if(camionAsignado.cabeBulto(bulto))
                camionAsignado.addBulto(bulto);
    }
}
