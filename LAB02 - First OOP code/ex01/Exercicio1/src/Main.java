public class Main {
    public static void main(String[] args) {
        Figurinhas fig1=new Figurinhas();
        Figurinhas fig2=new Figurinhas();
        Figurinhas fig3=new Figurinhas();

        fig1.nome="Rafael Bilu";
        fig1.nascimento=21041999;
        fig1.altura=1.74;
        fig1.peso=59;
        fig1.posicao="Ponta";
        fig1.pais="Brasil";

        fig2.nome="Fábio Deivson";
        fig2.nascimento=30091980;
        fig2.altura=1.89;
        fig2.peso=80;
        fig2.posicao="Goleiro";
        fig2.pais="Brasil";

        fig3.nome="Montillo";
        fig3.nascimento=14041984;
        fig3.altura=1.71;
        fig3.peso=63;
        fig3.posicao="Meio campo";
        fig3.pais="Brasil";

        System.out.printf("\nNome: %s\nNascimento: %d\nAltura: %.2f m\nPeso: %.2f\nPosicao: %s\nPais: %s\n"
        ,fig1.nome,fig1.nascimento,fig1.altura,fig1.peso,fig1.posicao,fig1.pais);

        System.out.printf("\nNome: %s\nNascimento: %d\nAltura: %.2f m\nPeso: %.2f\nPosicao: %s\nPais: %s\n"
        ,fig2.nome,fig2.nascimento,fig2.altura,fig2.peso,fig2.posicao,fig2.pais);

        System.out.printf("\nNome: %s\nNascimento: %d\nAltura: %.2f m\nPeso: %.2f\nPosicao: %s\nPais: %s\n"
        ,fig3.nome,fig3.nascimento,fig3.altura,fig3.peso,fig3.posicao,fig3.pais);
    }
}
