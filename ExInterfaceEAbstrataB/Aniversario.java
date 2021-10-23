package ExInterfaceEAbstrataB;

public class Aniversario extends CartaoWeb {
    private int idade;

    public Aniversario(int idade, String destinatario, String data) {
        super(destinatario, data);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void showMessage() {
        System.out.println("Feliz aniversário " + destinatario + "!!!");
        System.out.println("Parabéns pelos seus " + idade + " anos...");
        System.out.println("Tudo de melhor sempre!");
    }
}
