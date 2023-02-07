import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Testes {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        palavras.sort((String s1, String s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            }
            if (s1.length() > s2.length()) {
                return 1;
            }
            return 0;
        });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));

        Comparator<String> comparador = Comparator.comparing(s -> s.length());
        palavras.sort(comparador);

        Function<String, Integer> funcao = s -> s.length();
        //exemplo de method reference
        Function<List<String>, Integer> funcao2 = List<String>::size;

        Comparator<String> comparador2 = Comparator.comparing(funcao);
        palavras.sort(comparador2);

        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(impressor);

        System.out.println(palavras);

        palavras.forEach(s -> System.out.println(s));

        //Exemplo de classe anônima
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}

class ImprimeNaLinha implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}

