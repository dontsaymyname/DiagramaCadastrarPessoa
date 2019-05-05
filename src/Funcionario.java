public class Funcionario extends Pessoa {

    //Atributos
    private float salario;
    private float valorImposto;

    //Getters And Setters

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //Métodos

    @Override
    public void imprimeDados() {
        System.out.println(salario);
        System.out.println(getNome());
        System.out.println(getNascimento());

    }

    public float calcularImposto() {
        return valorImposto = salario * 0.03F;
    }
}
