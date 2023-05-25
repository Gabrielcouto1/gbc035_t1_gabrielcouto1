public class Cliente implements Classificavel {
    private String nome;
    
    public Cliente(String nome){
        this.nome=nome;
    }
    
    public boolean eMenorQue(Classificavel o){
        Cliente comparar = (Cliente) o;

        if(this.nome.compareTo(comparar.nome)<0){
            return true;
        }

        return false;
    }
    
    @Override 
    public String toString(){
        String out="";
        out+="Cliente '" + this.nome + "'\n";
        return out;
    }
}
