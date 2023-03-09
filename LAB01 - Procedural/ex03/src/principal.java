import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 5; i >= 0; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor de numeros pares>>");
        int qtd_inserida=0;

        while(qtd_inserida<6){
            System.out.print("Entre com o numero "+(qtd_inserida+1)+": ");
            vet[qtd_inserida]=sc.nextInt();
            sc.nextLine();

            if((vet[qtd_inserida]%2)!=0)
                System.out.println("Erro: Valor invalido.");
            else
                qtd_inserida++;
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.print(vet[i]+" ");
        }
    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Listando um vetor de numeros pares>>");
        int soma=0;
        float media;
        int maior, menor;

        for(int i=0;i<5;i++){
            System.out.print("Entre com o numero "+(i+1)+": ");
            vet[i]=sc.nextInt();
            sc.nextLine();
            soma+=vet[i];
        }

        media=soma/5;
        maior=vet[0];
        menor=vet[0];

        for(int i=0;i<5;i++){
            if(menor>vet[i])
                menor=vet[i];
            if(maior<vet[i])
                maior=vet[i];
        }

        System.out.println("<<5 valores >>");
        for(int i=0;i<5;i++)
            System.out.print(vet[i]+" ");

        System.out.println("\nO maior valor eh: "+maior);
        System.out.println("O menor valor eh: "+menor);
        System.out.println("A media eh: "+media);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Listando um vetor de numeros pares>>");
        int soma=0;
        float media;
        int maior, menor, indice_maior=0, indice_menor=0;

        for(int i=0;i<5;i++){
            System.out.print("Entre com o numero "+(i+1)+": ");
            vet[i]=sc.nextInt();
            sc.nextLine();
            soma+=vet[i];
        }

        media=soma/5;
        maior=vet[0];
        menor=vet[0];

        for(int i=0;i<5;i++){
            if(menor>vet[i]){
                menor=vet[i];
                indice_menor=i;
            }

            if(maior<vet[i]){
                maior=vet[i];
                indice_maior=i;
            }
        }

        System.out.println("<<5 valores >>");
        for(int i=0;i<5;i++)
            System.out.print(vet[i]+" ");

        System.out.println("\nO maior valor eh: "+maior+" localizado na posicao "+indice_maior+" do vetor.");
        System.out.println("O menor valor eh: "+menor+" localizado na posicao "+indice_menor+" do vetor.");
        System.out.println("A media eh: "+media);
    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        float[] vet = new float[5];
        System.out.println("<< Normalizando as notas >>");
        float maior, fator_normalizacao;

        for(int i=0;i<5;i++){
            System.out.print("Entre com a nota do aluno "+(i+1)+": ");
            vet[i]=sc.nextFloat();
            sc.nextLine();
        }

        maior=vet[0];
        for(int i=0;i<5;i++){
            if(maior<vet[i])
                maior=vet[i];
        }

        fator_normalizacao=100/maior;

        System.out.println("Notas normalizadas:");
        for(int i=0;i<5;i++)
            System.out.println("A nota do aluno "+(i+1)+" eh: "+(vet[i]*fator_normalizacao)+" ");
    }

    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
    }
}
