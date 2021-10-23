package ExInterfaceEAbstrata;

public abstract class Funcionario {
    protected String nome, matricula, tipo;
    protected double salarioBase;
    private static int cont = 0;

    public Funcionario(String nome, String matricula, double salarioBase, String tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.tipo = tipo;
        cont++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Funcionario.cont = cont;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void mostraFuncionario();

    public abstract double calculaSalario();
}
