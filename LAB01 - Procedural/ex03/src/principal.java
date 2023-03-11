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

    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Media e desvio padrao >>");
        double media, soma=0, dp, temp, aux;
        
        for(int i=0;i<5;i++){
            System.out.print("Digite o valor "+(i+1)+": ");
            vet[i]=sc.nextInt();
            sc.nextLine();
            soma+=vet[i];
        }
        media=soma/5;
        soma=0;
        for(int i=0;i<5;i++){
            temp=Math.pow((vet[i]-media),2);
            soma+=temp;
        }
        aux=soma/4;
        dp=Math.sqrt(aux);

        System.out.println("A media eh "+media+" e o desvio padrao eh "+dp);
    }

    public static void ex09(){
        Scanner sc = new Scanner(System.in);
        float soma=0;
        float media;
        int qtd_alunos;
        System.out.println("<< Listando um vetor de numeros pares>>");
        System.out.println("Insira a quantidade de alunos: ");
        qtd_alunos=sc.nextInt();
        sc.nextLine();
        
        if(qtd_alunos>100||qtd_alunos<0){
            System.out.println("Erro! O numero maximo de alunos e 100.");
            return;
        }
        int[] vet=new int[qtd_alunos];

        for(int i=0;i<qtd_alunos;i++){
            System.out.print("Digite a nota do aluno "+(i+1)+": ");
            vet[i]=sc.nextInt();
            sc.nextLine();
            soma+=vet[i];
        }

        media=soma/qtd_alunos;

        System.out.println("<<Relatorio de notas >>");
        for(int i=0;i<qtd_alunos;i++)
            System.out.println("Nota do aluno "+(i+1)+": "+vet[i]);
        
        System.out.println("A media eh: "+media);
    }

    public static void ex10(){
        Scanner sc=new Scanner(System.in);
        int[] vetA=new int[3];
        int[] vetB=new int[3];
        int[] vetC=new int[3];

        System.out.println("<<Subtracao de vetores>>");
    
        for(int i=0;i<3;i++){
            System.out.println("Digite o valor "+(i+1)+" de A: ");
            vetA[i]=sc.nextInt();
            sc.nextLine();
        }    
        for(int i=0;i<3;i++){
            System.out.println("Digite o valor "+(i+1)+" de B: ");
            vetB[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.print("O vetor C, definido como C=A-B eh (");  
        for(int i=0;i<3;i++){
            vetC[i]=vetA[i]-vetB[i];
            System.out.print(vetC[i]+",");
        }
        System.out.println(")");
    }
    
    public static void ex11(){
        Scanner sc=new Scanner(System.in);
        int[] pares=new int[5];
        int[] impares=new int[5];
        int temp,qtd_par=0,qtd_impar=0;
        System.out.println("<<Pares e impares>>");
    
        for(int i=0;i<5;i++){
            System.out.println("Digite o valor "+(i+1)+": ");
            temp=sc.nextInt();
            sc.nextLine();
            if(temp%2==0){
                pares[qtd_par]=temp;
                qtd_par++;
            }
            else{
                impares[qtd_impar]=temp;
                qtd_impar++;
            }   
        }    
        
        System.out.print("Impares: ");
        for(int i=0;i<qtd_impar;i++){
            System.out.print(impares[i]+" ");
        }
        System.out.println();

        System.out.print("Pares: ");
        for(int i=0;i<qtd_par;i++){
            System.out.print(pares[i]+" ");
        }
    }

    public static void ex12(){
        Scanner sc=new Scanner(System.in);
        int  maior_ind;
        float[] prob=new float[4];
        float[] qtd=new float[4];
        float max=0, maior;

        System.out.println("<<Probabilidades>>\n");

        System.out.println("Digite a quantidade de bolinhas");
        System.out.print("Verde: ");
        qtd[0]=sc.nextInt();
        sc.nextLine();

        System.out.print("Azul: ");
        qtd[1]=sc.nextInt();
        sc.nextLine();

        System.out.print("Amarela: ");
        qtd[2]=sc.nextInt();
        sc.nextLine();

        System.out.print("Vermelha: ");
        qtd[3]=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<4;i++)
            max+=qtd[i];
        
        for(int i=0;i<4;i++)
            prob[i]=(qtd[i]/max);

        maior=qtd[0];
        maior_ind=0;
        for(int i=0;i<4;i++)
            if(maior<qtd[i]){
                maior=qtd[i];
                maior_ind=i;
            }
                
        System.out.println("Probabilidades");
        System.out.print("Verde: "+(prob[0]*100)+"% "); if(maior_ind==0) System.out.print("<<Maior probabilidade");
        System.out.print("\nAzul: "+(prob[1]*100)+"% "); if(maior_ind==1) System.out.print("<<Maior probabilidade");
        System.out.print("\nAmarela: "+(prob[2]*100)+"% "); if(maior_ind==2) System.out.print("<<Maior probabilidade");
        System.out.print("\nVermelha: "+(prob[3]*100)+"% "); if(maior_ind==3) System.out.print("<<Maior probabilidade");
    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Zerando negativos>>");

        for(int i=0;i<5;i++){
            System.out.print("Entre com o numero "+(i+1)+": ");
            vet[i]=sc.nextInt();
            sc.nextLine();

            if(vet[i]<0)
                vet[i]=0;
        }

        System.out.println("Zerando os negativos, obtem-se:");
        for (int i = 0; i < 5; i++){
            System.out.print(vet[i]+" ");
        }
    }

    public static void ex14(){
        Scanner sc=new Scanner(System.in);
        int qtd_alunos;

        System.out.println("<<Universidade X>>");

        System.out.print("Quantos alunos serao cadastrados: ");
        qtd_alunos=sc.nextInt();
        sc.nextLine();
        if(qtd_alunos>1000||qtd_alunos<=0){
            System.out.println("Numero invalido.");
            return;
        }

        int[] num_aluno=new int[qtd_alunos];
        String[] classe=new String[qtd_alunos];
        double[] CRA=new double[qtd_alunos];

        for(int i=0;i<qtd_alunos;i++){
            System.out.print("\nEntre com o numero do aluno: ");
            num_aluno[i]=sc.nextInt();
            sc.nextLine();

            System.out.print("Entre com a classe social do aluno "+num_aluno[i]+": ");
            classe[i]=sc.nextLine();

            System.out.print("Entre com o CRA do aluno "+num_aluno[i]+": ");
            CRA[i]=sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\n====Alunos Cadastrados====");
        for(int i=0;i<qtd_alunos;i++)
            System.out.println("Numero: "+num_aluno[i]+" Classe Social: "+classe[i]+" CRA: "+CRA[i]);
    }
   
    public static void ex15(){
        Scanner sc=new Scanner(System.in);
        int[] vet=new int[8];
        int[] repetidos=new int[4];
        int qtd_repetidos=0;

        System.out.println("<<Valores Iguais>>");
        
        for(int i=0;i<8;i++){
            System.out.print("Entre com o numero "+(i+1)+": ");
            vet[i]=sc.nextInt();
            sc.nextLine();
        }

        for(int i=0;i<8;i++) {
            for(int j=i+1;j<8;j++) {
                if(vet[i]==vet[j]) {
                    boolean ja=false;
                    for(int k=0;k<qtd_repetidos;k++) {
                        if(repetidos[k]==vet[i]){
                            ja=true;
                            break;
                        }
                    }
                    if(!ja){
                        repetidos[qtd_repetidos]=vet[i];
                        qtd_repetidos++;
                    }
                    break;
                }
            }
        }

        System.out.print("Valores repetidos: ");
        for(int i=0;i<qtd_repetidos;i++)
            System.out.print(repetidos[i]+" ");
    }
    
    public static void ex16(){
        Scanner sc=new Scanner(System.in);
        int[] vet=new int[8];
        int[] repetidos=new int[4];
        int[] qtdrep=new int[4];
        int qtd_repetidos=0;

        for(int i=0;i<4;i++)
            qtdrep[i]=0;
        
        System.out.println("<<Valores Iguais>>");
        
        for(int i=0;i<8;i++){
            System.out.print("Entre com o numero "+(i+1)+": ");
            vet[i]=sc.nextInt();
            sc.nextLine();
        }

        for(int i=0;i<8;i++) {
            for(int j=i+1;j<8;j++) {
                if(vet[i]==vet[j]) {
                    boolean ja=false;
                    for(int k=0;k<qtd_repetidos;k++) {
                        if(repetidos[k]==vet[i]){
                            ja=true;
                            qtdrep[k]++;
                            break;
                        }
                    }
                    if(!ja){
                        repetidos[qtd_repetidos]=vet[i];
                        qtdrep[qtd_repetidos]=2;
                        qtd_repetidos++;
                    }
                    break;
                }
            }
        }

        System.out.print("Valores repetidos: ");
        for(int i=0;i<qtd_repetidos;i++)
            System.out.println(repetidos[i]+" aparece "+qtdrep[i]+" vezes");
    }

    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        ex16();
    }
}