package Construtores_2;

import java.util.Scanner;
public class AmbienteEspacial {

    static NaveEspacial[] nave = new NaveEspacial[5];

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int menu = -1;

        while(menu !=7){
            System.out.println("----MENU----\n");
            if(NaveEspacial.getContador() > 3){
                System.out.println("\n\nSuperlotação de naves!!!\n\n");
            }
            System.out.println("1 - Criar uma nova nave");
            System.out.println("2 - Exibir naves existentes");
            System.out.println("3 - Exibir a nave mais rápida");
            System.out.println("4 - Sair");
            System.out.print("Digite aqui a opção escolhida: ");

            menu = scanf.nextInt();

            String nome;

            switch (menu){
                case 1: {
                    System.out.print("Insira o nome da nave: ");
                    nome = scanf.next();
                    if(NaveEspacial.getContador() > 2){
                        nave[NaveEspacial.getContador()] = new NaveEspacial("NAVE COM DEFEITO!");
                        break;
                    }
                    nave[NaveEspacial.getContador()] = new NaveEspacial(nome);
                    break;
                }
                case 2: {
                    for(int i = 0; i < NaveEspacial.getContador(); i++){
                        System.out.println("\nNave"+(i+1));
                        nave[i].mostraNave();

                        if(nave[i].getVelocidade() == 0){
                            System.out.println("NAVE INOPERANTE!");
                        }
                    }
                    break;
                }
                case 3: {
                    int n1,n2;
                    System.out.println("Nave para chamar método: ");
                    n1 = scanf.nextInt();
                    System.out.println("Nave para parâmetro: ");
                    n2 = scanf.nextInt();

                    if(nave[n1-1].naveMaisRapida(nave[n2-1])){
                        System.out.println("A nave"+n2+"é mais rápida que"+n1);
                    }
                    else{
                        System.out.println("A nave"+n1+"é mais rápida que"+n2);
                    }
                    break;
                }
            }
        }
    }
}
