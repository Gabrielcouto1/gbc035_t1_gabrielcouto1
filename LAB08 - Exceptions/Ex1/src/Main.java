public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario ("Gabriel Couto", 12021040, 1000.4);

        try{
            funcionario.aumentaSalario(-1.10);
            System.out.println("Salario: "+ funcionario.getSalario());
        }catch (ValorInvalidoException err){
            System.out.println("Erro: "+ err.getMessage());
            System.out.println("Salario: "+ funcionario.getSalario();
        }
    }
}
