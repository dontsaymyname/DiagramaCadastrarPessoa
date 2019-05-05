public class Main {

    public static void main(String[] args) {

        //Data1
        Data data1 = new Data();
        data1.setAno(2000);
        data1.setDia(11);
        data1.setMes(01);

        //Cliente1
        Cliente cliente1 = new Cliente();
        cliente1.setCodigo(1111);
        cliente1.setNascimento(data1);
        cliente1.setNome("Allioth");

        //Funcionario1
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setSalario(1000000F);
        funcionario1.setNascimento(data1);
        funcionario1.setNome("Jin");

        //Gerente1
        Gerente gerente1 = new Gerente();
        gerente1.setArea("Vendas");
        gerente1.setNascimento(data1);
        gerente1.setNome("Martin");


        



    }
}
