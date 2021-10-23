package ExInterfaceEAbstrata;
import java.util.Scanner;

public class Principal {
    public static Funcionario findFuncionario(Funcionario funcionarios[], String s) {
        if(Funcionario.getCont() == 0) {
            return null;
        }

        for(int i=0; i<Funcionario.getCont(); i++) {
            if(funcionarios[i].getNome().equals(s)) {
                return funcionarios[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionarios[] = new Funcionario[5];
        int menu = 0;
        String nome, matricula;
        double salarioBase, comissao;

        do {
            System.out.println("------------ MENU -------------");
            System.out.println("1 - Registrar funcionário gerente");
            System.out.println("2 - Registrar funcionário vendedor");
            System.out.println("3 - Registrar funcionário assistente");
            System.out.println("4 - Mostrar cenário");
            System.out.println("5 - Fim de mês - calcular salário");
            System.out.println("6 - Média salarial de cada tipo de funcionário");
            System.out.println("7 - SAIR");
            System.out.println("-------------------------------");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.print("\n");

            switch(menu) {

                case 1:
                    System.out.println("Cadastrando funcionário gerente...");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Matrícula: ");
                    matricula = sc.nextLine();
                    System.out.print("Salário base: ");
                    salarioBase = sc.nextDouble();

                    funcionarios[Funcionario.getCont()] = new Gerente(nome, matricula, salarioBase, "gerente");
                    System.out.print("\n");
                    break;

                case 2:
                    System.out.println("Cadastrando funcionário vendedor...");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Matrícula: ");
                    matricula = sc.nextLine();
                    System.out.print("Salário base: ");
                    salarioBase = sc.nextDouble();
                    System.out.print("Comissão: ");
                    comissao = sc.nextDouble();

                    funcionarios[Funcionario.getCont()] = new Vendedor(nome, matricula, salarioBase, comissao, "vendedor");
                    System.out.print("\n");
                    break;

                case 3:
                    System.out.println("Cadastrando funcionário assistente...");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Matrícula: ");
                    matricula = sc.nextLine();
                    System.out.print("Salário base: ");
                    salarioBase = sc.nextDouble();

                    funcionarios[Funcionario.getCont()] = new Assistente(nome, matricula, salarioBase, "assistente");
                    System.out.print("\n");
                    break;

                case 4:
                    if(Funcionario.getCont() == 0) {
                        System.out.println("\nNenhum funcionário registrado...\n");
                        break;
                    }

                    for(int i=0; i<Funcionario.getCont(); i++) {
                        System.out.println("Funcionário " + (i+1) + "...\n");
                        funcionarios[i].mostraFuncionario();
                        System.out.println();
                    }

                    break;

                case 5:
                    if(Funcionario.getCont() == 0) {
                        System.out.println("\nNenhum funcionário registrado...\n");
                        break;
                    }

                    for(int i=0; i<Funcionario.getCont(); i++) {
                        System.out.println("Funcionário " + (i+1) + "...\n");
                        funcionarios[i].mostraFuncionario();
                        System.out.println("Salário = " + funcionarios[i].calculaSalario());
                        System.out.println("\n");
                    }

                    break;

                case 6:
                    if(Funcionario.getCont() == 0) {
                        System.out.println("\nNenhum funcionário registrado...\n");
                        break;
                    }

                    int contGerente=0, contVendedor=0, contAssistente=0;
                    double salariosGerente=0, salariosVendedor=0, salariosAssistente=0;

                    for(int i=0; i<Funcionario.getCont(); i++) {
                        if(funcionarios[i].getTipo().equals("gerente")) {
                            salariosGerente = salariosGerente + funcionarios[i].calculaSalario();
                            contGerente++;
                        }else if(funcionarios[i].getTipo().equals("vendedor")) {
                            salariosVendedor = salariosVendedor + funcionarios[i].calculaSalario();
                            contVendedor++;
                        }else {
                            salariosAssistente = salariosAssistente + funcionarios[i].calculaSalario();
                            contAssistente++;
                        }
                    }

                    System.out.println("\nMédia Salários - GERENTE: ");
                    System.out.println(salariosGerente/contGerente);
                    System.out.println("\nMédia Salários - VENDEDOR: ");
                    System.out.println(salariosVendedor/contVendedor);
                    System.out.println("\nMédia Salários - ASSISTENTE: ");
                    System.out.println(salariosAssistente/contAssistente);

                    break;

            }
        }while(menu != 7);
    }
}
