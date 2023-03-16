public class Figurinhas {
    private String nome, posicao, pais;
    private double altura, peso;
    private int nascimento;

    public Figurinhas(String nome, int nascimento, double altura, double peso, String posicao, String pais){
        this.nome=nome;
        this.nascimento=nascimento;
        this.altura=altura;
        this.peso=peso;
        this.posicao=posicao;
        this.pais=pais;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setNascimento(int nascimento){
        this.nascimento=nascimento;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public void setPosicao(String posicao){
        this.posicao=posicao;
    }

    public void setPais(String pais){
        this.pais=pais;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNascimento(){
        return this.nascimento;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public String getPosicao(){
        return this.posicao;
    }

    public String getPais(){
        return this.pais;
    }

    public String getJogador(){
        String out="Nome: "+this.getNome()+"\n";
        out+="Nascimento: "+this.getNascimento()+"\n";
        out+="Altura: "+this.getAltura()+"\n";
        out+="Peso: "+this.getPeso()+"\n";
        out+="Posicao: "+this.getPosicao()+"\n";
        out+="Pais: "+this.getPais()+"\n";

        return out;
    }
}