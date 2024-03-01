package br.com.estevao.processo;

import br.com.estevao.modelo.Ficha;

import java.util.Random;

public class Campeonato {
    private Random random = new Random();
    private Ficha campeao1;
    private Ficha campeao2;

    public void setcampeao1(Ficha campeao1){
        this.campeao1 = campeao1;
    }
    public void setcampeao2(Ficha campeao2){
        this.campeao2 = campeao2;
    }
    public void apresentacao(Ficha ficha0, Ficha ficha1){
        System.out.println("\n........"+ficha0.getLutadores().getNome()+"  VS  "+ ficha1.getLutadores().getNome()+"........" );
    }
    public void inicioLuta(Ficha ficha0, Ficha ficha1,Ficha ficha2, Ficha ficha3){
        apresentacao(ficha0,ficha1);
        System.out.println("........Inicio do quebra........");

        int saldo0 = sequencia(ficha0);
        int saldo1 = sequencia(ficha2);


        if (saldo0> saldo1){
            System.out.println("VENCEDOR " + ficha0.getLutadores().getNome() + "  score "+ saldo0 + " \n"+ficha1.getLutadores().getNome()+" Perdeu" + " Score "+ saldo1);
            setcampeao1(ficha0);
        }else {
            System.out.println("VENCEDOR " + ficha1.getLutadores().getNome()+ "  score "+ saldo1 + " \n"+ ficha0.getLutadores().getNome() + " Perdeu" +"  score "+ saldo0);
            setcampeao1(ficha1);
        }
        apresentacao(ficha2,ficha3);
        System.out.println("........Inicio do quebra........");

        int saldo2 = sequencia(ficha2);
        int saldo3 = sequencia(ficha3);

        if (saldo2> saldo3){
            System.out.println("VENCEDOR " + ficha2.getLutadores().getNome() + "  score "+ saldo2 + " \n"+ficha3.getLutadores().getNome()+" Perdeu" + " Score "+ saldo3);
            setcampeao2(ficha2);
        }else {
            System.out.println("VENCEDOR " + ficha3.getLutadores().getNome()+ "  score "+ saldo3 + " \n"+ ficha2.getLutadores().getNome() + " Perdeu" +"  score "+ saldo2);
            setcampeao2(ficha3);
        }
        lutafinal(campeao1,campeao2);
    }

    public void lutafinal(Ficha campeao1, Ficha campeao2){
        System.out.println("\n........GRANDE FINAL........");
        apresentacao(campeao1,campeao2);
        System.out.println("........Inicio do quebra........");

        int saldo4 = sequencia(campeao1);
        int saldo5 = sequencia(campeao2);

        if (saldo4> saldo5){
            System.out.println("VENCEDOR " + campeao1.getLutadores().getNome() + "  score "+ saldo4 + " \n"+campeao2.getLutadores().getNome()+" Perdeu" + " Score "+ saldo5);
        }else {
            System.out.println("VENCEDOR " + campeao2.getLutadores().getNome()+ "  score "+ saldo5 + " \n"+ campeao1.getLutadores().getNome() + " Perdeu" +"  score "+ saldo4);
        }
    }

    public int sequencia(Ficha ficha){
        int chute = 1;
        int soco = 2;
        int defende = 3;
        int especial = 4;
        int score = 0;
        for(int i = 0; i<= random.nextInt(5);i++){
            int acao = random.nextInt(5);
            if(chute == acao){
                score += chute;
                System.out.println(ficha.getLutadores().getNome() + " Ponto no chute " + chute + " score " + score);
            } else if (soco == acao) {
                score += soco;
                System.out.println(ficha.getLutadores().getNome()+" Ponto no soco " + soco+ " score " + score);
            } else if (defende == acao){
                System.out.println(ficha.getLutadores().getNome() +" Ponto na defesa " + defende + " score " + score);
            } else if (especial == acao) {
                score += especial;
                System.out.println(ficha.getLutadores().getNome() +" Ponto no especial " + especial + " score " + score);
            }else {
                score -= 1;
                System.out.println(ficha.getLutadores().getNome() +" errou golpe -1 "+ " score " + score);
            }

        }
        return score ;
    }
}
