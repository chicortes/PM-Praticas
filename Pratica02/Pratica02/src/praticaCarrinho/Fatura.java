package praticaCarrinho;

import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> itemComprado;
    private double valorTotalFatura;

    public Fatura(ArrayList<Item>itemComprado, double valorTotalFatura){
        this.itemComprado = new ArrayList<Item>();
        this.valorTotalFatura = valorTotalFatura;
    }

    public ArrayList<Item> getItemComprado() {
        return itemComprado;
    }

    public void setItemComprado(ArrayList<Item> itemComprado) {
        this.itemComprado = itemComprado;
    }

    public double getValorTotalFatura() {
        return valorTotalFatura;
    }

    public void setValorTotalFatura(double valorTotalFatura) {
        this.valorTotalFatura = valorTotalFatura;
    }

    public double calculoValorFatura(){
        this.valorTotalFatura = 0.0;
        for(int i = 0; i < this.itemComprado.size(); i++){
            this.valorTotalFatura += this.itemComprado.get(i).getValorTotalItem();
        }
        return this.valorTotalFatura;
    }

    public void addItem(Item item){
        this.itemComprado.add(item);
    }
}