package praticaCarrinho;

public class Produto {
    private String nome;
    private int code;
    private double preco;

    public Produto(String nome, int code, double preco){
        this.nome = nome;
        this.code = code;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
