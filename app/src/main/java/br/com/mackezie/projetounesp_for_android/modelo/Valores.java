package br.com.mackezie.projetounesp_for_android.modelo;

/**
 * Created by Bruno on 02/01/2016.
 */
public class Valores {
    int codigo_valores;
    private String nome;

    //Getter and Setter --> Alt + Insert

    public int getCodigo_valores() {
        return codigo_valores;
    }

    public void setCodigo_valores(int codigo_valores) {
        this.codigo_valores = codigo_valores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    private String valores;

}
