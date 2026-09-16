package praticaCarrinho;

import java.util.HashMap;

public class Estoque {
    private HashMap<Integer, Produto> estoque;

    public Estoque(){
        this.estoque= new HashMap<>();
    }

    public HashMap<Integer, Produto> getEstoque() {
        return estoque;
    }

    public void setEstoque(HashMap<Integer, Produto> estoque) {
        this.estoque = estoque;
    }

    public boolean adicionarProduto(Produto produto){
        if(estoque.containsKey(produto.getCode())){
            return false;
        }else{
            estoque.put(produto.getCode(), produto);
            return true;
        }
    }

    public Produto buscaProduto(Produto produto){
        if(this.estoque.containsKey(produto.getCode())){
            return this.estoque.get(produto.getCode());
        }else{
            return null;
        }
    }

    public void removeProduto(Produto produto){
        this.estoque.remove(produto.getCode());
        
    }

    public boolean verificarExistencia(Produto produto){
        if(estoque.containsKey(produto.getCode())){
            return true;
        }else{
            return false;
        }
    }

    public void listaProdutos(){
        if(estoque.isEmpty()){
            System.out.println("Estoque Vazio");
        }else{
            for(Produto produto : estoque.values()){
                System.out.println(produto);
            }
        }
    }
}