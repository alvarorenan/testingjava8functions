import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        palavras.forEach(System.out::println);

        List<String> frutas = Arrays.asList("banana", "maçã", "laranja", "melancia", "uva", "abacaxi", "melão", "abacate", "aaacate");
        frutas.sort(Comparator.comparing(String::length));
        System.out.println("Ordenado por tamanho: ");
        frutas.forEach(System.out::println);
        System.out.println("Ordem inversa: ");
        frutas.sort(Comparator.comparing(String::length).reversed());
        // também pode ser feito dessa forma:
        // frutas.sort(Comparator.comparingInt(String::length).reversed());
        // frutas.sort(Comparator.reverseOrder());
        frutas.forEach(System.out::println);
        System.out.println("Ordenado por tamanho e depois por ordem alfabética: ");
        frutas.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        frutas.forEach(System.out::println);


    }
}




