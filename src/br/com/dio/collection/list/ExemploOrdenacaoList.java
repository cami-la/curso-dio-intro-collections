package br.com.dio.collection.list;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList { //segundo...
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado")); // ctrl d pra duplicar a linha
            add(new Gato("Jon", 18, "amarelo"));
        }};
        // se colocássemos aqui o Sys.out ele só imprimiria o lugar de memória. Pra dar certo temos que sobrescrever na classe gato o toString 
        
        meusGatos.sort(Comparator.comparing(Gato::getNome));


        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
        Collections.sort(meusGatos, new ComparatorIdade()); // pra dar certo antes tem que criar a classe comparator
        //meusGatos.sort(new ComparatorIdade());/pra ser organizada sort, tem que ter o método comparable e n o comparator, n confundir. posso usar esse ou o acima, ambos funcionam
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
//        Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---"); // se os nomes forem iguais, critério de desempate é cor...
//        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{ //primeiro criar classe gato. Depois quando implementa o comparable dá erro, pressionar alt enter e implementar o método compare to
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) { //construtor
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    //get
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" + // apagou gato e botou pra rodar novamente
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());// sobrescreveu a partir de return.Qnd meu retorno for zero os nomes são iguais, se der 1 é pq o gato que estou comparando é maior e tem que  ficar depois, se der -1 é menor
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) { // pq é classe externa tem que mudar a nomenclatura de gato pra g1 e g2
        return Integer.compare(g1.getIdade(), g2.getIdade());// complementou o método após o return e vai retornar o 0,1,-1
    }
}

class ComparatorCor implements Comparator<Gato> { // classe comparator implementa a interface comparator. Ele vai "reclamar" então implementar o método compare abaixo

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());// escreveu o método como o nome pq ambos são strings, porém aqui não está dentro da classe gato então usa g1 e g2, então n vai o this
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome; // se o nome é diferente de zero, n são iguais, a comparação pode ser por nome;
        // se nomes forem iguais comparar por cor...
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;
        // se nomes e cores forem iguais ordenarei por idade
        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}
