import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {
    private final String nome;
    private final int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public String toString() {
        return nome + " - " + alunos;
    }
}


public class ExemploCursos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        System.out.println(cursos);
//        cursos.forEach(System.out::println);
        System.out.println("Cursos com mais de 100 alunos:");
        Stream<Curso> list = cursos.stream()
                .filter(c -> c.getAlunos() >= 100);
        //salvando em uma lista
        cursos = list.toList();
        System.out.println(cursos);
    }
}
