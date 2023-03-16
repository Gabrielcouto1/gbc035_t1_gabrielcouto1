public class Selecao {
    private String nome, nome_tecnico;
    private Figurinhas[] titulares;
    
    public Selecao(String nome, String nome_tecnico, Figurinhas[] titulares){
        this.nome=nome;
        this.nome_tecnico=nome_tecnico;
        this.titulares=titulares;
    }

    public String getSelecao(){
        String out="Escalacao da Selecao de "+this.nome+"\n";
        
        for(int i=0;i<11;i++){
            out+="\nJogador "+(i+1)+"\n";
            out+=this.titulares[i].getJogador();
        }
        
        out+="\nTecnico: "+this.nome_tecnico+"\n";
        return out;
    }
}
