import java.time.LocalDate;

public class Professor {

    private String nome;
    private String matricula;
    private LocalDate dataContratacao;

    public Professor() {
    }

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Getters para obter os valores dos atributos
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    // Setters para definir os valores dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", dataContratacao=" + dataContratacao +
                '}';
    }
}
