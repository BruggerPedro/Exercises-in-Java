package ExInterfaceEAbstrataC;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Veiculo veiculos[] = new Veiculo[5];

        int menu = 0, cont = 0;
        String marca, modelo, cor;
        double potencia;

        do {
            System.out.println("------------ MENU -------------");
            System.out.println("1 - Registrar carro");
            System.out.println("2 - Registrar moto");
            System.out.println("3 - Mostrar cenário");
            System.out.println("4 - Mais potente (veículos vermelhos)");
            System.out.println("5 - SAIR");
            System.out.println("-------------------------------");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.print("\n");

            switch(menu) {
                case 1:
                    System.out.println("Registrando carro...");
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    modelo = sc.nextLine();
                    System.out.print("Cor: ");
                    cor = sc.nextLine();
                    System.out.print("Potência: ");
                    potencia = sc.nextDouble();

                    veiculos[cont] = new Carro(marca, modelo, cor, potencia);
                    cont++;
                    System.out.print("\n");
                    break;

                case 2:
                    System.out.println("Registrando moto...");
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    modelo = sc.nextLine();
                    System.out.print("Cor: ");
                    cor = sc.nextLine();
                    System.out.print("Potência: ");
                    potencia = sc.nextDouble();

                    veiculos[cont] = new Moto(marca, modelo, cor, potencia);
                    cont++;
                    System.out.print("\n");
                    break;

                case 3:
                    for(int i = 0; i < cont; i++) {
                        System.out.println("Veículo " + (i+1));
                        veiculos[i].mostraDados();
                        System.out.println();
                    }

                    break;

                case 4:
                    int maisPotente = -1;
                    int menosPotente = -1;
                    int i = 0;
                    for(i = 0; i<cont; i++) {
                        if(veiculos[i].cor().equals("vermelho")) {
                            maisPotente = i;
                            menosPotente = i;

                            break;
                        }
                    }

                    for(int j = i + 1; j < cont; j++) {
                        if(veiculos[j].cor().equals("vermelho")) {
                            if(veiculos[j].potencia() > veiculos[maisPotente].potencia())
                                maisPotente = j;

                            if(veiculos[j].potencia() < veiculos[menosPotente].potencia())
                                menosPotente = j;
                        }
                    }

                    if(maisPotente == -1 && menosPotente == -1) {
                        System.out.println("Não há veículos vernelhos...");
                    }else {
                        System.out.println("Marca do veículo mais potente dentre os vermelhos: ");
                        System.out.println(veiculos[maisPotente].marca() + "\n");
                        System.out.println("Marca do veículo menos potente dentre os vermelhos: ");
                        System.out.println(veiculos[menosPotente].marca() + "\n");
                    }

                    break;
            }
        }while(menu != 5);
    }
}
