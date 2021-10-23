package ExInterfaceEAbstrata;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String matricula, double salarioBase, double comissao, String tipo) {
        super(nome, matricula, salarioBase, tipo);
        setComissao(comissao);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void mostraFuncionario() {
        System.out.println(this.tipo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Salário base: " + this.salarioBase);
        System.out.println("Comissão: " + this.comissao);
    }

    public double calculaSalario() {
        return this.salarioBase + this.comissao;
    }
}
