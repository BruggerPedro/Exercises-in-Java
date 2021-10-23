package ExInterfaceEAbstrataB;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CartaoWeb cartoes[] = new CartaoWeb[20];
        String destinatario, par;
        int anoNamoro, idade;
        int menu = 0, op = 0;

        do {
            System.out.println("------------ CARTÕES -------------");
            System.out.println("1 - Novo cartão");
            System.out.println("2 - Mensagens já cadastradas");
            System.out.println("3 - Cartôes por data");
            System.out.println("4 - SAIR");
            System.out.print("\nESCOLHA: ");
            System.out.println("----------------------------------");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.print("\n");

            switch(menu) {
                case 1:
                    System.out.print("Destinatário: ");
                    destinatario = sc.nextLine();

                    System.out.println("\nCartão para qual data?");
                    System.out.println("\tDia dos namorados [1]");
                    System.out.println("\tNatal [2]");
                    System.out.println("\tAniversário [3]");
                    System.out.print("ESCOLHA: ");
                    op = sc.nextInt();

                    while(op != 1 && op != 2 && op != 3) {
                        System.out.println("OPÇÃO INVÁLIDA...");
                        System.out.print("ESCOLHA");
                        op = sc.nextInt();
                    }

                    if(op == 1) {
                        System.out.print("\nNome do namorado(a): ");
                        par = sc.next();
                        System.out.print("Anos de namoro: ");
                        anoNamoro = sc.nextInt();
                        cartoes[CartaoWeb.getCont()] = new DiaDosNamorados(destinatario, par, anoNamoro, destinatario, "Dia dos Namorados");
                    }else if(op == 2) {
                        cartoes[CartaoWeb.getCont()] = new Natal(destinatario, "Natal");
                    }else {
                        System.out.print("\nAniversário de quantos anos: ");
                        idade = sc.nextInt();
                        cartoes[CartaoWeb.getCont()] = new Aniversario(idade, destinatario, "Aniversário");
                    }

                    break;

                case 2:
                    for(int i=0; i<CartaoWeb.getCont(); i++) {
                        cartoes[i].showMessage();
                        System.out.println();
                    }

                    break;

                case 3:
                    System.out.println("Data desejada: ");
                    System.out.println("\tDia dos Namorados");
                    System.out.println("\tNatal");
                    System.out.println("\tAniversário");
                    System.out.print("ESCOLHA (digitar idêntico à opção desejada): ");
                    String data = sc.nextLine();

                    System.out.println("\nCARTÕES DATA - " + data + "\n");
                    for(int i=0; i<CartaoWeb.getCont(); i++) {
                        if(cartoes[i].getData().equals(data)) {
                            cartoes[i].showMessage();
                            System.out.println();
                        }
                    }

                    break;
            }
        }while(menu != 5);
    }
}
