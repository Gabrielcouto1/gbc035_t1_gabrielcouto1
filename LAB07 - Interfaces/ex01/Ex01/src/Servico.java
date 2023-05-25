public class Servico implements Classificavel{
    private double preco;

    public Servico (double preco){
        this.preco = preco;
    }

    public boolean eMenorQue(Classificavel o){
        Servico compara = (Servico) o;

        if(this.preco<compara.preco)
            return true;
        
        return false;
    }

    @Override 
    public String toString(){
        String out="";
        out+="Servico preco= " + this.preco + "\n";
        return out;
    }
}
