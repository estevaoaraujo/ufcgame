import br.com.estevao.modelo.Ficha;
import br.com.estevao.modelo.Lutadores;
import br.com.estevao.processo.Campeonato;

public class Main {
    public static void main(String[] args) {
        Lutadores lutadores[] = new Lutadores[4];
        lutadores[0] = new Lutadores("Homem Aranha", "EUA");
        lutadores[1] = new Lutadores("Mareta de Jeova","Brasil");
        lutadores[2] = new Lutadores("Pastor Metralhadora","Paraguay");
        lutadores[3] = new Lutadores("El Toro","Espanha");

        Ficha ficha[] = new Ficha[4];
        ficha[0] = new Ficha(lutadores[0],68,89,80);
        ficha[1] = new Ficha(lutadores[1],91,71,85);
        ficha[2] = new Ficha(lutadores[2],61,71,91);
        ficha[3] = new Ficha(lutadores[3],91,71,90);

        Campeonato campeonato[] = new Campeonato[2];
        campeonato[0] = new Campeonato();
        campeonato[0].inicioLuta(ficha[0],ficha[1],ficha[2],ficha[3]);




    }
}