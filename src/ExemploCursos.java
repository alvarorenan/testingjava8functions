import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
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
        cursos.add(new Curso("PHP", 90));
        cursos.add(new Curso("C#", 120));
        cursos.add(new Curso("Ruby", 80));
        cursos.add(new Curso("Go", 60));
        cursos.add(new Curso("Scala", 30));
        cursos.add(new Curso("Kotlin", 20));
        cursos.add(new Curso("Swift", 10));
        cursos.add(new Curso("R", 5));
        cursos.add(new Curso("Rust", 1));
        cursos.add(new Curso("Elixir", 1));
        cursos.add(new Curso("Clojure", 1));
        cursos.add(new Curso("Haskell", 1));
        cursos.add(new Curso("Erlang", 1));
        cursos.add(new Curso("F#", 1));


        System.out.println(cursos);
//        cursos.forEach(System.out::println);
        System.out.println("Cursos com mais de 100 alunos:");
        cursos.stream().filter(c -> c.getAlunos() > 100).forEach(System.out::println);
        System.out.println("------");
        //salvando em uma lista
//        cursos = list.toList();
//        System.out.println(cursos);
        System.out.println(cursos);
        Optional<Curso> optional = cursos.stream().findAny();
        optional.ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        int sum = cursos.stream().filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();

        OptionalDouble media = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .average();

        //imprimindo a média com 2 casas decimais
        System.out.println("Media: " + String.format("%.2f", media.getAsDouble()));

        Stream<Curso> stream = cursos.stream()
                .filter(c -> c.getAlunos() >= 100);
        List<Curso> teste = stream.toList();
        System.out.println(teste);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));;


    }
}
