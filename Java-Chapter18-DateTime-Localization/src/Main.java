import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//
//        Random random = new Random();
//
//        String message = "Guess a number (1-6): ";
//
//        boolean go = false;
//        int guess;
//        int actual;
//        do {
//            System.out.println(message);
//            guess = in.nextInt();
//            actual = random.nextInt(1, 7);
//            if(guess == actual){
//                System.out.println("========Done Win the game==========");
//                go = true;
//            }else {
//                System.out.println("N/A ===== " + actual);
//            }
//        }while (!go);

//        TaskStatus status = TaskStatus.DONE;
//
//        System.out.println(status.name());
//        System.out.println(status.ordinal());
//        System.out.println(TaskStatus.valueOf("DONe"));
        LocalDate specific = LocalDate.of(2026, 9, 16);
        System.out.println(specific);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();

        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println("------------------------");


        System.out.println(localDate.plusDays(32));

        LocalDateTime d1 = LocalDateTime.now();
        LocalDateTime d2 = LocalDateTime.now().plusDays(90);
        Duration duration = Duration.between(d1, d2);
        System.out.println(d2);

        System.out.println("----------------");

        ZoneId cairo= ZoneId.of("Africa/cairo");
        ZoneId tokyo = ZoneId.of("Asia/tokyo");
        ZonedDateTime userTime = LocalDateTime.now().atZone(cairo);
        System.out.println(userTime.format(DateTimeFormatter.BASIC_ISO_DATE));

    }
}

enum TaskStatus{
    PENDING,
    DONE,
    IN_PROGRESS
}