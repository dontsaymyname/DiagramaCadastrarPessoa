public class Cliente extends Pessoa {

    //Atributos
    private int codigo;

    //Getters and Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Métodos

    @Override
    public void imprimeDados() {
        System.out.println(codigo);
        System.out.println(getNome());
        System.out.println(getNascimento());

    }
}
