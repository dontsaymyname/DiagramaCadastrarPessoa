public class Gerente extends Funcionario {

    //Atributos
    private String area;

    //Getters and Setters

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    //Métodos


    @Override
    public void imprimeDados() {
        System.out.println(area);
        System.out.println(getNome());
        System.out.println(getNascimento());
    }

    public float calcularImposto() {
        return getSalario() * 0.05F;
    }
}
