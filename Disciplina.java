import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private String professor;
    private List<Integer> notas = new ArrayList<>();

    public Disciplina(String nome, List<Integer> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public void adicionaNota(Integer nota) {
        notas.add(nota);
    }

    public Integer calcularMediaDisciplina() {
        Integer somaNotas = 0;
        for (Integer nota : notas) {
            somaNotas = somaNotas + nota;
        }
        return somaNotas / notas.size();
    }
}