public abstract class Pessoa {


    //Atributos

    private String nome;
    private Data nascimento;


    //Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    //Métodos

    public abstract void imprimeDados();

}
