package Construtores_2;
import java.util.Random;

public class NaveEspacial {
    private String nome;
    private int velocidade;
    private static int contador = 0;

    public NaveEspacial(String s) {
        setNome(s);
        setVel();

        contador++;
    }
    public static int getContador(){
        return contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String s) {
        nome =s;
    }

    public void setVel(){
        if(contador <= 2){
            Random r = new Random();
            velocidade = r.nextInt((10-5)+1) + 5;
        }
        else{
            velocidade = 0;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void mostraNave(){
        System.out.println("Nome: "+getNome());
        System.out.println("Velocidade: "+getVelocidade());
    }

    public boolean naveMaisRapida(NaveEspacial n){
        return n.getVelocidade() > getVelocidade();
    }
}
