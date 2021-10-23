package ExInterfaceEAbstrataB;

public class DiaDosNamorados extends CartaoWeb {
    private String pessoa1, pessoa2;
    private int anoNamoro;

    public DiaDosNamorados(String pessoa1, String pessoa2, int anoNamoro, String destinatario, String data) {
        super(destinatario, data);
        this.pessoa1 = pessoa1;
        this.pessoa2 = pessoa2;
        this.anoNamoro = anoNamoro;
    }

    public String getPessoa1() {
        return pessoa1;
    }

    public void setPessoa1(String pessoa1) {
        this.pessoa1 = pessoa1;
    }

    public String getPessoa2() {
        return pessoa2;
    }

    public void setPessoa2(String pessoa2) {
        this.pessoa2 = pessoa2;
    }

    public int getAnoNamoro() {
        return anoNamoro;
    }

    public void setAnoNamoro(int anoNamoro) {
        this.anoNamoro = anoNamoro;
    }
    //Função que vai mostrar as mensagens presentes no cartão

    public void showMessage() {
        System.out.println("Feliz dia dos Namorados!!!");
        System.out.println("Parabéns pelos " + anoNamoro + " anos de namoro... " + pessoa1 + " e " + pessoa2);
        System.out.println("Para: " + destinatario);
    }
}
