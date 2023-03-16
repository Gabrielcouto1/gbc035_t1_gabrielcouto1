public class Main {
    public static void main(String[] args) {
        Figurinhas[] titularesBrasil={
            new Figurinhas("Alisson", 12121980, 1.98,78,"Goleiro","Brasil"),
            new Figurinhas("Militao",30091981,1.79,75,"Zagueiro", "Brasil"),
            new Figurinhas("Marquinhos",23041987,1.70,87,"Zagueiro", "Brasil"),
            new Figurinhas("Thiago Silva",30091991,1.78,85,"Zagueiro", "Brasil"),
            new Figurinhas("Danilo",17011997,1.79,90,"Zagueiro", "Brasil"),
            new Figurinhas("Casemiro",30091981,1.79,67,"Centro Avante", "Brasil"),
            new Figurinhas("Paqueta",14122001,1.70,71,"Meio de campo", "Brasil"),
            new Figurinhas("Neymar",31091981,1.75,79,"Ponta", "Brasil"),
            new Figurinhas("Vini Jr",12041999,1.71,59,"Atacante", "Brasil"), 
            new Figurinhas("Raphinha",30091981,1.61,64,"Atacante", "Brasil"),
            new Figurinhas("Richarlison",31012000,1.90,60,"Atacante", "Brasil")        
        };
        Selecao brasil=new Selecao("Brasil", "Tite", titularesBrasil);
        
        Figurinhas[] titularesCroacia={
            new Figurinhas("Livakovic", 12031980, 2.00,79,"Goleiro","Croacia"),
            new Figurinhas("Juranovic",30091981,1.79,87,"Zagueiro", "Croacia"),
            new Figurinhas("Lovren",23041987,1.70,76,"Zagueiro", "Croacia"),
            new Figurinhas("Gvardiol",30091991,1.78,95,"Zagueiro", "Croacia"),
            new Figurinhas("Soza",17011997,1.79,69,"Zagueiro", "Croacia"),
            new Figurinhas("Brozovic",30091981,1.79,78,"Centro Avante", "Croacia"),
            new Figurinhas("Kovacic",14122001,1.70,70,"Meio de campo", "Croacia"),
            new Figurinhas("Modric",31091981,1.75,75,"Ponta", "Croacia"),
            new Figurinhas("Pasalic",12041999,1.71,72,"Atacante", "Croacia"), 
            new Figurinhas("Perisic",30091981,1.61,61,"Atacante", "Croacia"),
            new Figurinhas("Kramaric",31012000,1.90,90,"Atacante", "Croacia")     
        };
        Selecao croacia=new Selecao("Croacia", "Tite", titularesCroacia);

        System.out.println(brasil.getSelecao());
        System.out.println(croacia.getSelecao());
    }
}
