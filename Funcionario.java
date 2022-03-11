abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected double salario;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    public void setdataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setsalario(double salario){
        this.salario = salario;
    }

    public void getNome(){
        System.out.println(this.nome);
    }
    public void getcpf(){
        System.out.println(this.cpf);
    }
    public void getdataNascimento(){
        System.out.println(this.dataNascimento);
    }
    public void getsalario(){
        System.out.println(this.salario);
    }

    public void bonificacao(){
        this.salario = this.salario + 100;

    }
}
