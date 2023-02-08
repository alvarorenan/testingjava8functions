import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) throws InterruptedException {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2035, Month.OCTOBER, 5);

        int anos = olimpiadasRio.getYear() - hoje.getYear();

        System.out.println(olimpiadasRio);

        System.out.println(anos);

        Period periodo = Period.between(hoje, olimpiadasRio);

        var proximasOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        YearMonth anoMes = YearMonth.of(2015, Month.JANUARY);
        Year year = Year.of(2015);

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);

        ZonedDateTime fuso = ZonedDateTime.now();
        System.out.println(fuso);

        //mostrar relógio de forma contínua
        // while (true) {
        //     System.out.println(LocalTime.now());
        //     Thread.sleep(1000);
        // }
        while (true) {
            clearConsole();
            System.out.println(LocalTime.now());
            Thread.sleep(1000);

        }
        //clean console
        // System.out.print("\033[H\033[2J");
        // System.out.flush();

    }
    public static void clearConsole(){
        try{
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }else{
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
