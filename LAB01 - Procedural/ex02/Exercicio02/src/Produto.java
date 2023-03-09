public class Produto {
    private String nome;
    private float preco;
    private int qtd_estoque;

    public Produto(String nome, float preco, int qtd_estoque){
        this.nome=nome;
        this.preco=preco;
        this.qtd_estoque=qtd_estoque;
    }

    public String getProduto(){
        String out="\nNome do produto:"+this.nome+" \n";
        out+="Preco: "+this.preco+"\n";
        out+="Quantidade em estoque: "+this.qtd_estoque+"\n";
        return out;
    }

    public int alteraPreco(float porcentagem){
        if(porcentagem>-100){
            float temp=1+(porcentagem/100);
            this.preco=this.preco*temp;
            return 0;
        }
        return -1;
    }
}
