package br.com.dio.collection.map.paraSaberMais;

import java.util.Objects;

//Crie uma classe Curso que possua os atributos: Disciplina, matricula
public class Disciplina implements Comparable<Disciplina> {
    private String nome;
    private Integer duracao;

    public Disciplina(String disciplina, Integer duracao) {
        this.nome = disciplina;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "disciplina='" + nome + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina disciplina = (Disciplina) o;
        return this.nome.equals(disciplina.nome) && duracao.equals(disciplina.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, duracao);
    }

    @Override
    public int compareTo(Disciplina disciplina) {
        return this.getNome().compareToIgnoreCase(disciplina.getNome());
    }
}
