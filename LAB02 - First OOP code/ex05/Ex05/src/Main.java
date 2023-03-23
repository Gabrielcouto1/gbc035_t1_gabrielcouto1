import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome, nome_tecnico, nome_jogador;
        int nascimento;
        double altura, peso;
        int qtd;

        System.out.print("Insira quantas selecoes deseja criar: ");
        qtd=sc.nextInt();
        sc.nextLine();
        if(qtd<=0)
            return;

        Selecao[] selecoes=new Selecao[qtd];

        for(int i=0;i<qtd;i++){
            System.out.print("Insira o nome da selecao "+(i+1)+": ");
            nome=sc.nextLine();
            System.out.print("Insira o nome do tecnico da selecao "+(i+1)+": ");
            nome_tecnico=sc.nextLine();

            selecoes[i]=new Selecao(nome,nome_tecnico);

            for(int j=0;j<11;j++){
                System.out.print("\nInsira o nome do "+selecoes[i].getPosicaoJogador(j)+" : ");
                nome_jogador=sc.nextLine();
                System.out.print("Insira a data de nascimento do "+selecoes[i].getPosicaoJogador(j)+" : ");
                nascimento=sc.nextInt();
                sc.nextLine();
                System.out.print("Insira a altura do "+selecoes[i].getPosicaoJogador(j)+" : ");
                altura=sc.nextDouble();
                sc.nextLine();
                System.out.print("Insira o peso do "+selecoes[i].getPosicaoJogador(j)+" : ");
                peso=sc.nextDouble();
                sc.nextLine();

                selecoes[i].setJogador(nome_jogador,nascimento,altura,peso,j);
            }
        }
        System.out.println(selecoes[0].getSelecao());
        for(int i=0;i<qtd;i++){
            System.out.println(selecoes[i].getSelecao());
        }
    }
}
