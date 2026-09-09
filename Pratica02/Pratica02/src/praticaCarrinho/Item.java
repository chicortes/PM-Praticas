package praticaCarrinho;

public class Item {
    private Produto produtoComprado;
    private int quantProduto;
    private double valorTotalItem;

    public Item(Produto produtoComprado, int quantProduto, double valorTotalItem){
        this.produtoComprado = produtoComprado;
        this.quantProduto = quantProduto;
        this.valorTotalItem = valorTotalItem;
    }

    public Produto getProdutoComprado() {
        return produtoComprado;
    }

    public void setProdutoComprado(Produto produtoComprado) {
        this.produtoComprado = produtoComprado;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }

    public double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }
}
