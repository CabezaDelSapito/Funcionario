public class Gerente extends Funcionario{
    private String login;
    private String senha;

    public void setlogin(String login){
        this.login = login;
    }
    public void setsenha(String senha){
        this.senha = senha;
    }
    public void getlogin(){
        System.out.println(this.login);
    }
    public void getsenha(){
        System.out.println(this.senha);
    }

    public void bonificacao(){
        this.salario = this.salario*0.25 + 100;
    }
}
