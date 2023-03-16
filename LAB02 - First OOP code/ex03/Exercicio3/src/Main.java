public class Main {
    public static void main(String[] args) {
        Figurinhas[] fig=new Figurinhas[3];

        fig[0]=new Figurinhas("Rafael Bilu", 210419999,1.74,59,"Ponta","Brasil");

        fig[1]=new Figurinhas("Fabio Deivson", 30091980,1.89,80,"Goleiro","Pais");

        fig[2]=new Figurinhas("Montillo",14041984,1.71,63,"Meio Campo","Pais");

        for(int i=0;i<3;i++){
            System.out.printf("\nNome: %s\nNascimento: %d\nAltura: %.2f m\nPeso: %.2f\nPosicao: %s\nPais: %s\n"
            ,fig[i].getNome(),fig[i].getNascimento(),fig[i].getAltura(),fig[i].getPeso(),fig[i].getPosicao(),fig[i].getPais());
        }
    }
}
