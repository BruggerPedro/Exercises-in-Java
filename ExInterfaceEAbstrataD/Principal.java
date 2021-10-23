package ExInterfaceEAbstrataD;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> lista = new ArrayList<Produto>();
        String id, categoria;
        int anoProducao, unidadeVenda;
        float preco;
        int menu = 0, op = 0;

        do {
            System.out.println("------------ PRODUTOS -------------");
            System.out.println("1 - Adicionar produtos");
            System.out.println("2 - Informações de categoria");
            System.out.println("3 - Total de produtos");
            System.out.println("4 - Mostrar cenário");
            System.out.println("5 - SAIR");
            System.out.print("\nESCOLHA: ");
            System.out.println("-----------------------------------");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.print("\n");

            switch(menu) {
                case 1:
                    System.out.print("ID: ");
                    id = sc.nextLine();
                    System.out.print("Ano de produção: ");
                    anoProducao = sc.nextInt();
                    System.out.print("Unidade de venda: ");
                    unidadeVenda = sc.nextInt();
                    System.out.print("Preço: ");
                    preco = sc.nextFloat();

                    System.out.println("\nAdicionar produto em qual categoria?");
                    System.out.println("\tEletrodoméstico [1]");
                    System.out.println("\tVinho [2]");
                    System.out.println("\tCafé [3]");
                    System.out.print("ESCOLHA: ");
                    op = sc.nextInt();

                    while(op != 1 && op != 2 && op != 3) {
                        System.out.println("OPÇÃO INVÁLIDA...");
                        System.out.print("ESCOLHA");
                        op = sc.nextInt();
                    }

                    if(op == 1) {
                        lista.add(new Eletrodomestico(id, "eletrodoméstico", anoProducao, unidadeVenda, preco));
                    }else if(op == 2) {
                        lista.add(new Vinho(id, "vinho", anoProducao, unidadeVenda, preco));
                    }else {
                        lista.add(new Cafe(id, "café", anoProducao, unidadeVenda, preco));
                    }

                    break;

                case 2:
                    System.out.println("Categoria a ser consultada...");
                    System.out.println("\teletrodoméstico");
                    System.out.println("\tvinho");
                    System.out.println("\tcafé");
                    System.out.print("ESCOLHA (digitar idêntico às opções): ");
                    categoria = sc.nextLine();

                    int cont = 0;
                    preco = 0;

                    for(int i=0; i<lista.size(); i++) {
                        if(lista.get(i).categoria().equals(categoria)) {
                            cont++;
                            preco = preco + lista.get(i).preco();
                        }
                    }

                    System.out.println("\n" + categoria + "\n");
                    System.out.println("Quantidade de produtos: " + cont);
                    System.out.println("Preço total: " + preco + "\n");

                    break;

                case 3:
                    System.out.println("Total de produtos da lista: " + lista.size());
                    break;

                case 4:
                    for(int i=0; i<lista.size(); i++) {
                        lista.get(i).mostraDados();
                        System.out.println();
                    }

                    break;
            }
        }while(menu != 5);
    }
}
