public class Secretaria extends Funcionario{
    private String ramal;

    public void setRamal(String ramal){
        this.ramal = ramal;
    }
    public void getRamal(){
        System.out.println(this.ramal);
    }
    public void bonificacao(){
        this.salario = this.salario*0.15 + 100;
    }
}
