package entities;

public class Soldado {
    private Integer movimento = 0;
    private String arma;
    private String nome;
    private static int quantidadeSoldados = 0;

    public Soldado(String nome) {
        this.nome = nome;
        quantidadeSoldados++;
    }

    public Integer getMovimento() {
        return movimento;
    }

    public void setMovimento(Integer movimento) {
        this.movimento = movimento;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    public String getNome() {
        return nome;
    }

    public void movimentar(int posicao){
        this.movimento += posicao;
        System.out.println("\nSoldado "+getNome()+ " movido para a posição "+ getMovimento());
    }
    public void movimentar(){
        this.movimento+=10;
        System.out.println("\nSoldado "+getNome()+ " movido para a posição "+ getMovimento());
    }
    public void atacar(String arma){
        if(Soldado.quantidadeSoldados >= 10){
            this.arma = arma;
            System.out.println("O soldado "+getNome()+" atacou com "+getArma());
        }else{
            System.out.println("Ainda não! Espere!");
        }
    }
    public void atacar(){
        if(Soldado.quantidadeSoldados >= 10){
                System.out.println("O soldado "+getNome()+" atacou com o fuzil");
        }else{
            System.out.println("Ainda não! Espere!");
        }
    }

}
