public class Funcionario {
    private String nome;
    private double salario, teto;
    private int cpf;

    public Funcionario(String nome, int cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double getTeto() {
        return teto;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTeto(double teto) {
        this.teto = teto;
    }

    public double aumentaSalario(double porcentagem){
        double aumento = getSalario() * porcentagem;

        if(aumento<0){
            throw new ValorInvalidoException("Valor invalido de salario resultante");
        }
        if(aumento>getTeto()){
            throw new ValorInvalidoException("Valor do novo salario ultrapassa o teto salarial")
        }

        setSalario(aumento);
        return getSalario();
    }
}
