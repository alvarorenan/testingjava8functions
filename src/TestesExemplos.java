import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestesExemplos {
    public static void main(String[] args) {
        //Exemplo de classe anônima
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //Exemplo de lambda
        palavras.sort(Comparator.comparing(s -> s.length()));
        //Exemplo de method reference
        palavras.sort(Comparator.comparing(String::length));
        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        palavras.forEach(System.out::println);

    }
}
