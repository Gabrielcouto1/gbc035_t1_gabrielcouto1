import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int qtd_max=4;
        Produto prod[]=new Produto[qtd_max];
        String nome_temp;
        int qtd_estoque_temp;
        float preco_temp;
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<qtd_max;i++){
            System.out.println("\nNome do produto "+(i+1)+": ");
            nome_temp=sc.nextLine();

            System.out.println("Preco do produto "+(i+1)+": ");
            preco_temp=sc.nextFloat();
            sc.nextLine();

            System.out.println("Quantidade do produto "+(i+1)+": ");
            qtd_estoque_temp=sc.nextInt();
            sc.nextLine();
            prod[i]=new Produto(nome_temp,preco_temp,qtd_estoque_temp);
        }

        System.out.println("\nAumentando o preco em 10% dos produtos 1 e 3.");
        if(prod[0].alteraPreco(10)==-1)
            System.out.println("Nao foi possivel aumentar o preco.");
        else
            System.out.println("Preco alterado com sucesso!");
        if(prod[2].alteraPreco(10)==-1)
            System.out.println("Nao foi possivel aumentar o preco.");
        else
            System.out.println("Preco alterado com sucesso!");

        System.out.println("\nReduzindo o preco em 5% do produto 2.");
        if(prod[1].alteraPreco(-5)==-1)
            System.out.println("Nao foi possivel aumentar o preco.");
        else
            System.out.println("Preco alterado com sucesso!");

        System.out.println("\nAlterando o preco do produto 4.");
        if(prod[3].alteraPreco(-110)==-1)
            System.out.println("Nao foi possivel aumentar o preco.");
        else
            System.out.println("Preco alterado com sucesso!");

        System.out.println();
        for(int i=0;i<qtd_max;i++)
            System.out.println(prod[i].getProduto());
    }
}
