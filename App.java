public class App {
    public static void main(String[] args) throws Exception {
        Gerente gerente = new Gerente();
        Secretaria secretaria = new Secretaria();

        gerente.setNome("Gerentson");
        gerente.setcpf("123.456.789-10");
        gerente.setdataNascimento("32/13/1994");
        gerente.setlogin("gerentson94");
        gerente.setsenha("32131994");
        gerente.setsalario(2400.00);

        secretaria.setNome("Secretelsa");
        secretaria.setcpf("321.654.987-01");
        secretaria.setdataNascimento("19/12/2000");
        secretaria.setRamal("sla oq é ramal k");
        secretaria.setsalario(1200.00);

        gerente.getNome();
        gerente.getcpf();
        gerente.getdataNascimento();
        gerente.getlogin();
        gerente.getsenha();
        gerente.bonificacao();
        gerente.getsalario();

        secretaria.getNome();
        secretaria.getcpf();
        secretaria.getdataNascimento();
        secretaria.getRamal();
        secretaria.bonificacao();
        secretaria.getsalario();
    }
}
