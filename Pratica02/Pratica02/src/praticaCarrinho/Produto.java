package praticaCarrinho;

public class Produto {
    private String nome;
    private int code;
    private double preco;
    private int quantidade;

    public Produto(String nome, int code, double preco, int quantidade){
        this.nome = nome;
        this.code = code;
        this.preco = preco;
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int valorIncremento){
        this.quantidade += valorIncremento;
    }

    public boolean removerEstoque(int valorRemover){
        if(valorRemover < 0){
            if(this.quantidade >= valorRemover){
                this.quantidade -= valorRemover;
                return true;
            }
        }
    return false;
    }
}