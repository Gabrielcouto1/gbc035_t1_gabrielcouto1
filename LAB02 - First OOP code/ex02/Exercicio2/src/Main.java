public class Main {
    public static void main(String[] args) {
        Figurinhas fig1=new Figurinhas();
        Figurinhas fig2=new Figurinhas();
        Figurinhas fig3=new Figurinhas();

        fig1.setNome("Rafael Bilu");
        fig1.setNascimento(21041999);
        fig1.setAltura(1.74);
        fig1.setPeso(59);
        fig1.setPosicao("Ponta");
        fig1.setPais("Brasil");

        fig2.setNome("Fábio Deivson");
        fig2.setNascimento(30091980);
        fig2.setAltura(1.89);
        fig2.setPeso(80);
        fig2.setPosicao("Goleiro");
        fig2.setPais("Brasil");

        fig3.setNome("Montillo");
        fig3.setNascimento(14041984);
        fig3.setAltura(1.71);
        fig3.setPeso(63);
        fig3.setPosicao("Meio campo");
        fig3.setPais("Brasil");

        System.out.printf("\nNome: %s\nNascimento: %d\nAltura: %.2f m\nPeso: %.2f\nPosicao: %s\nPais: %s\n"
        ,fig1.getNome(),fig1.getNascimento(),fig1.getAltura(),fig1.getPeso(),fig1.getPosicao(),fig1.getPais());

        System.out.printf("\nNome: %s\nNascimento: %d\nAltura: %.2f m\nPeso: %.2f\nPosicao: %s\nPais: %s\n"
        ,fig2.getNome(),fig2.getNascimento(),fig2.getAltura(),fig2.getPeso(),fig2.getPosicao(),fig2.getPais());

        System.out.printf("\nNome: %s\nNascimento: %d\nAltura: %.2f m\nPeso: %.2f\nPosicao: %s\nPais: %s\n"
        ,fig3.getNome(),fig3.getNascimento(),fig3.getAltura(),fig3.getPeso(),fig3.getPosicao(),fig3.getPais());
    }
}
