package ExInterfaceEAbstrataB;

public abstract class CartaoWeb {
    protected String destinatario, data;
    private static int cont = 0;

    public CartaoWeb(String destinatario, String data) {
        this.destinatario = destinatario;
        this.data = data;
        cont++;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        CartaoWeb.cont = cont;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    public abstract void showMessage();
}
