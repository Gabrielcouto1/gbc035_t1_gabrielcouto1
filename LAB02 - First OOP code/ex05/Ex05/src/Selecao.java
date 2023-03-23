public class Selecao {
    private String nome, nome_tecnico;
    private Figurinhas[] titulares= new Figurinhas[11];

    public Selecao(String nome, String nome_tecnico){
        this.nome=nome;
        this.nome_tecnico=nome_tecnico;

        for(int i=0; i<11; i++){
            this.titulares[i] = new Figurinhas(nome);
        }

        this.titulares[0].setPosicao("Goleiro");
        this.titulares[1].setPosicao("Lateral Direito");
        this.titulares[2].setPosicao("Zagueiro");
        this.titulares[3].setPosicao("Zagueiro");
        this.titulares[4].setPosicao("Lateral Esquerdo");
        this.titulares[5].setPosicao("Meio de campo");
        this.titulares[6].setPosicao("Meio de campo");
        this.titulares[7].setPosicao("Meio de campo");
        this.titulares[8].setPosicao("Ponta direita");
        this.titulares[9].setPosicao("Ponta esquerda");
        this.titulares[10].setPosicao("Centroavante");


    }

    public String getSelecao(){
        String out="Escalacao da Selecao "+this.nome+"\n";

        for(int i=0;i<11;i++){
            out+="\nJogador "+(i+1)+"\n";
            out+=this.titulares[i].getJogador();
        }

        out+="\nTecnico: "+this.nome_tecnico+"\n";
        return out;
    }

    public String getPosicaoJogador(int pos){
        return this.titulares[pos].getPosicao();
    }

    public void setJogador(String nome, int nascimento, double altura, double peso, int pos){
        this.titulares[pos].setNome(nome);
        this.titulares[pos].setNascimento(nascimento);
        this.titulares[pos].setAltura(altura);
        this.titulares[pos].setPeso(peso);
    }
}
