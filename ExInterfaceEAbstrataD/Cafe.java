package ExInterfaceEAbstrataD;

public class Cafe implements Produto {
    private String id, categoria;
    private int anoProducao, unidadeVenda;
    private float preco;

    public Cafe(String id, String categoria, int anoProducao, int unidadeVenda, float preco) {
        this.id = id;
        this.categoria = categoria;
        this.anoProducao = anoProducao;
        this.unidadeVenda = unidadeVenda;
        this.preco = preco;
    }

    public String id() {
        return this.id;
    }

    public int anoProducao() {
        return this.anoProducao;
    }

    public int unidadeVenda() {
        return this.unidadeVenda;
    }

    public String categoria() {
        return this.categoria;
    }

    public float preco() {
        return  this.preco;
    }

    public void mostraDados() {
        System.out.println("Id: " + id());
        System.out.println("Ano de produção: " + anoProducao());
        System.out.println("Unidade de venda: " + unidadeVenda());
        System.out.println("Categoria: " + categoria());
        System.out.println("Preço: " + preco());
    }
}
