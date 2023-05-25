public class Main {
    public static void main(String[] args) {

        Produto[] prod_vetor = new Produto[5];

        prod_vetor[0] = new Produto(3);
        prod_vetor[1] = new Produto(1);
        prod_vetor[2] = new Produto(5);
        prod_vetor[3] = new Produto(2);
        prod_vetor[4] = new Produto(4);

        Classificador classificador = new Classificador();
        classificador.ordena(prod_vetor);

        for (Produto produto : prod_vetor) {
            System.out.println(produto);
        }



        Servico[] serv_vet = new Servico[5];

        serv_vet[0] = new Servico(3.14);
        serv_vet[1] = new Servico(15.4);
        serv_vet[2] = new Servico(17.5);
        serv_vet[3] = new Servico(2.8);
        serv_vet[4] = new Servico(0.4);


        classificador.ordena(serv_vet);

        System.out.println("\n");
        for (Servico servico : serv_vet) {
            System.out.println(servico);
        }


        Cliente[] cliente_vet = new Cliente[5];

        cliente_vet[0] = new Cliente("Ana");
        cliente_vet[1] = new Cliente("Beatriz");
        cliente_vet[2] = new Cliente("Maria");
        cliente_vet[3] = new Cliente("Julia");
        cliente_vet[4] = new Cliente("Barbara");


        classificador.ordena(cliente_vet);

        System.out.println("\n");
        for (Cliente cliente : cliente_vet) {
            System.out.println(cliente);
        }
    }


}