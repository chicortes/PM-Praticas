package agendaTelefonica;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;
    private int contatosCadastrados;

    public Agenda(ArrayList<Contato> contatos, int contatosCadastrados){
        this.contatos = contatos;
        this.contatosCadastrados = contatosCadastrados;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public int getContatosCadastrados() {
        return contatosCadastrados;
    }

    public void setContatosCadastrados(int contatosCadastrados) {
        this.contatosCadastrados = contatosCadastrados;
    }
}
