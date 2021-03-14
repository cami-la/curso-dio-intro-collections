package br.com.dio.collection;

public class Main {

    public static void main(String[] args) {
        String aluno1 = "Cami";
        String aluno2 = "Carlos";
        String aluno3 = "Maria";
        String aluno4 = "Pedro";

        String[] alunosCursoCollections = new String[4];
        alunosCursoCollections[0] = aluno1;
        alunosCursoCollections[1] = aluno2;
        alunosCursoCollections[2] = aluno3;
        alunosCursoCollections[3] = aluno4;

        for (String aluno: alunosCursoCollections) {
            System.out.println(aluno);
        }
    }
}
