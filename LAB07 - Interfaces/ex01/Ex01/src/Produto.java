public class Produto {
    private int codigo;

    public Produto(int codigo){
        this.codigo = codigo;
    }

    public boolean eMenorQue(Classificavel o){
        Produto compara = (Produto) o;

        if(this.codigo<compara.codigo)
            return true;

        return false;
    }

    @Override
    public String toString(){
        String out="";
        out+="Produto '" + this.cliente + "'\n";
        return out;
    }
}
