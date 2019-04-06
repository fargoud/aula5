package br.com.digitalhouse;

public class Dono {
    //Atributos
    private String nome;
    public String sexo;

    //Construtor Específico
    public Dono(String novoNome){
        nome = novoNome;
    }

    //Construtor Padrão
    public Dono(){

    }

    //alimentar
    public void alimentar(Cachorro cachorrinho){
        System.out.println("Olá " + cachorrinho.nome);
    }

    //Get - Acessor
    public String getNome(){
        return nome;
    }

    //Set - Modificador
    public void setNome(String novoNome) {
        nome = novoNome;
    }
}
