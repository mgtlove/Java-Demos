import java.time.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.*;
import java.time.format.DateTimeFormatter;

public class Java_Date_Demo{

    static void localDateExample() {
        System.out.println("\nLocal Date Example");
        LocalDate example = LocalDate.now();
        System.out.println(example);
    }
    
    static void localTimeExample() {
        System.out.println("\nLocal Time Example");
        LocalTime example = LocalTime.now();
        System.out.println(example);
    }
    
    static void localDateTimeExample() {
        System.out.println("\n Local Date Time Example");
        LocalDateTime example = LocalDateTime.now();
        System.out.println(example);
    }

    static void classRoomExample() {
        System.out.println("\n Class Room Example");
        LocalDate nowTime = LocalDate.now();
        LocalDate example = LocalDate.now();
        //System.out.println(example + nowTime);
    }
 
    static void dateTimeFormatterExample () {
        LocalDateTime exampleTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String exampleTimeFormatted = exampleTime.format(format);
        System.out.println("\nDate Time Formatter Example");
        System.out.println("Local Date Time (No Format): " + exampleTime);
        System.out.println("The formatting method: " + format);
        System.out.println("The formatted Local Date Time: " + exampleTimeFormatted);
    }

    static void interviewQuestion () {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2019, 8, 07);
        LocalDate difference = today.minusMonths(10);
        System.out.println(difference);
    }

    static void interviewQuestionAnswer () {
        System.out.println("\nInterview Question Answer:");
        LocalDateTime exampleTime = LocalDateTime.now();
        System.out.println("\nThe initial time: " + exampleTime);
        String formattedTime = exampleTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println("The formatted Local Date Time: " + formattedTime);
    }

    public static void main(String[] args) {
          localDateExample();
         localTimeExample();
         localDateTimeExample();
         dateTimeFormatterExample();
         interviewQuestion();
        // interviewQuestionAnswer();
        System.out.println("Run completed.");
    }
}